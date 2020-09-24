package com.example.onlinehouserentalmanagement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Random;

/**
 * HouseInformationDetailsRegistration is used to take the house information from the landlord
 * and store all of that information including house pictures.
 * here no field can't be empty
 */
public class houseInformationDetailsRegistration extends AppCompatActivity {

    //initialize variables
    EditText location, size, price, room, bathroom, garage, resident, service, facing, nearby, other, preferdtime, pet, contact;
    Button register, browseImage;
    ImageView img;
    Uri filepath;
    Bitmap bitmap;

    DatabaseReference databaseReference;


    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * Always followed by onStart().
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_information_details_registration);
        this.setTitle("House Information Register");


        //to reference the firebase data
        databaseReference = FirebaseDatabase.getInstance().getReference("House Information");



        //assign variables
        location = (EditText) findViewById(R.id.TV_Location);
        size = (EditText) findViewById(R.id.TV_Size);
        price = (EditText) findViewById(R.id.TV_Price);
        room = (EditText) findViewById(R.id.TV_Room);
        bathroom = (EditText) findViewById(R.id.TV_Bathroom);
        garage = (EditText) findViewById(R.id.TV_Garage);
        resident = (EditText) findViewById(R.id.TV_Resident);
        service = (EditText) findViewById(R.id.TV_Service);
        facing = (EditText) findViewById(R.id.TV_Facing);
        nearby = (EditText) findViewById(R.id.TV_Nearby);
        other = (EditText) findViewById(R.id.TV_Others);
        preferdtime = (EditText) findViewById(R.id.TV_Preferedtime);
        pet = (EditText) findViewById(R.id.TV_Pet);
        contact = (EditText) findViewById(R.id.TV_Contact);

        register = (Button) findViewById(R.id.TV_Register);


        img = (ImageView) findViewById(R.id.TV_House_Image);
        browseImage = (Button) findViewById(R.id.TV_BrowseButton);





        /**
         * setOnClickListener is called to set action through a button.
         * here register button will register the given information by the landlord
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        register.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             * @param v  The view that was clicked.
             * This function called a method named saveHouseInformation
             */
            @Override
            public void onClick(View v) {
                saveHouseInformation();
            }
        });


        /**
         * setOnClickListener is called to set action through a button.
         * here browseImage button will browse image from the photos and set it in the portal
         * it will manage permission for photos
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick
         */
        browseImage.setOnClickListener(new View.OnClickListener() {

            /**
             * Called when a view has been clicked.
             * @param view  The view that was clicked.
             */
            @Override
            public void onClick(View view) {
                Dexter.withActivity(houseInformationDetailsRegistration.this)
                        .withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        .withListener(new PermissionListener() {

                            /**
                             * Called after the user grant the permission.
                             * it give an option to the user to choose a picture from the photo or galary.
                             * @param response  The response from the user after granting permission.
                             */
                            @Override
                            public void onPermissionGranted(PermissionGrantedResponse response) {
                                Intent intent = new Intent(Intent.ACTION_PICK);
                                intent.setType("image/*");
                                startActivityForResult(Intent.createChooser(intent,"Please select image"),1);
                            }

                            /**
                             * Called when the user denied the permission request.
                             * @param response  The permission denied response from the user.
                             */
                            @Override
                            public void onPermissionDenied(PermissionDeniedResponse response) {

                            }

                            /**
                             * Called when the user open the app next time after cancelling the request permission first time.
                             * it will request for permission everytime when the user open the app until accepting the permission once.
                             * @param permission  The permission request to the user.
                             * @param token  The permission cancel by the user.
                             */
                            @Override
                            public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {
                                token.continuePermissionRequest();
                            }
                        }).check();
            }
        });

    }


    /**
     * This onActivityResult is called to store the Intent result
     * it will convert image URI into inputStream
     * inputStream will be converted into bitmap
     * bitmap will be displayed in imageView
     * @param requestCode  it will match the given requestCode
     * @param resultCode  it will set the result
     * @param data  it will contain the Intent
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode==1 && resultCode==RESULT_OK)
        {
            filepath = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(filepath);
                bitmap = BitmapFactory.decodeStream(inputStream);
                img.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


    /**
     * saveHouseInformation will store all of the information including picture in the vacant house list.
     * if success it will show uploaded successfully message to the portal.
     * it will also show the percent of uploading a picture.
     */
    public void saveHouseInformation() {


        final ProgressDialog dialog = new ProgressDialog(this);
        dialog.setTitle("File Uploader");
        dialog.show();


        FirebaseStorage storage = FirebaseStorage.getInstance();
        final StorageReference uploader = storage.getReference("image1" + new Random().nextInt(50));

        uploader.putFile(filepath)
                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        dialog.dismiss();

                        uploader.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {

                                String locationstr = location.getText().toString();
                                String sizestr = size.getText().toString();
                                String pricestr = price.getText().toString();
                                String roomstr = room.getText().toString();
                                String bathroomstr = bathroom.getText().toString();
                                String garagestr = garage.getText().toString();
                                String residentstr = resident.getText().toString();
                                String servicestr = service.getText().toString();
                                String facingstr = facing.getText().toString();
                                String nearbystr = nearby.getText().toString();
                                String otherstr = other.getText().toString();
                                String preferedtimestr = preferdtime.getText().toString();
                                String petstr = pet.getText().toString();
                                String contactstr = contact.getText().toString();

                                String key = databaseReference.push().getKey();


                                record r = new record(locationstr,sizestr,pricestr,roomstr,
                                        bathroomstr,garagestr,residentstr,
                                        servicestr,facingstr,nearbystr,
                                        otherstr,preferedtimestr,petstr,contactstr,uri.toString());

                                databaseReference.child(key).setValue(r);
                                Toast.makeText(getApplicationContext(),"House information stored successfully!",Toast.LENGTH_LONG).show();


                                Intent intent = new Intent(houseInformationDetailsRegistration.this, demoDataFetch.class);
                                startActivity(intent);
                            }
                        });
                    }
                })
                .addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {
                        float percent = (100*snapshot.getBytesTransferred())/snapshot.getTotalByteCount();
                        dialog.setMessage("Uploaded : " + (int) percent + " %");
                    }
                });

    }
}