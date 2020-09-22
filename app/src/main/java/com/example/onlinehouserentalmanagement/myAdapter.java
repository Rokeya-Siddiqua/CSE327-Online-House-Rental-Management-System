package com.example.onlinehouserentalmanagement;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * myAdapter provide a binding from an app-specific data set to views that are displayed within a RecyclerView.
 * it is called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
 */
public class myAdapter extends FirebaseRecyclerAdapter<record,myAdapter.myViewHolder> {


    /**
     * Constructs and Initialize the FirebaseRecyclerOptions.
     * @param options  a specific object type FirebaseRecyclerOptions.
     */
    public myAdapter(@NonNull FirebaseRecyclerOptions<record> options) {
        super(options);
    }

    /**
     * onBindViewHolder is called by RecyclerView to display the data at the specified position.
     * The new ViewHolder will be used to display items of the adapter and it will be re-used to display different items in the data set.
     * update the RecyclerView.ViewHolder contents with the item at the given position.
     * also sets up some private fields to be used by RecyclerView.
     * @param holder  The view holder whose contents should be updated.
     * @param position  The position of the holder with respect to this adapter.
     * @param model  The object of a class whose contents will be uploaded.
     */
    @Override
    protected void onBindViewHolder(@NonNull final myViewHolder holder, final int position, @NonNull final record model) {

        holder.location.setText("House location: " + model.getLocation());
        holder.size.setText("House size: " + model.getSize() + " sq/ft");
        holder.price.setText("House price: " + model.getPrice() + " taka");
        Glide.with(holder.img.getContext()).load(model.getPuri()).into(holder.img);


        /**
         * setOnClickListener is called to set action through a button.
         * here button will show the details information for a specific house which will be clicked by the user.
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick
         */
        holder.button.setOnClickListener(new View.OnClickListener()
        {

            /**
             * Called when a view has been clicked.
             * @param view   The view that was clicked.
             */
            @Override
            public void onClick(View view) {
                final DialogPlus dialogPlus = DialogPlus.newDialog(holder.img.getContext())
                        .setContentHolder(new ViewHolder(R.layout.dialog_contect))
                        .setExpanded(true,1100)
                        .create();

                View myView = dialogPlus.getHolderView();
                TextView loc = (TextView) myView.findViewById(R.id.location_dialog_ID);
                TextView siz = (TextView) myView.findViewById(R.id.size_dialog_ID);
                TextView pri = (TextView) myView.findViewById(R.id.price_dialog_ID);


                TextView room = (TextView) myView.findViewById(R.id.room_dialog_ID);
                TextView bathroom = (TextView) myView.findViewById(R.id.bathroom_dialog_ID);
                TextView garage = (TextView) myView.findViewById(R.id.garage_dialog_ID);
                TextView resident = (TextView) myView.findViewById(R.id.resident_dialog_ID);
                TextView service = (TextView) myView.findViewById(R.id.service_dialog_ID);
                TextView facing = (TextView) myView.findViewById(R.id.facing_dialog_ID);
                TextView nearby = (TextView) myView.findViewById(R.id.nearby_dialog_ID);
                TextView other = (TextView) myView.findViewById(R.id.other_dialog_ID);
                TextView ptime = (TextView) myView.findViewById(R.id.ptime_dialog_ID);
                TextView pet = (TextView) myView.findViewById(R.id.pet_dialog_ID);
                TextView contact = (TextView) myView.findViewById(R.id.contact_dialog_ID);


                loc.setText("House location: " + model.getLocation());
                siz.setText("House size: " + model.getSize() + " sq/ft");
                pri.setText("House price: " + model.getPrice() + " taka");


                room.setText("Total Room: " + model.getRoom());
                bathroom.setText("Total Bathroom: " + model.getBathroom());
                garage.setText("Have garage: " + model.getGarage());
                resident.setText("Resident Type: " + model.getResident());
                service.setText("Include service charge: " + model.getService());
                facing.setText("House facing Direction: " + model.getFacing());
                nearby.setText("House nearby: " + model.getNearby());
                other.setText("Other Information: " + model.getOther());
                ptime.setText("Preferred visiting time: " + model.getPtime());
                pet.setText("Pet allowed: " + model.getPet());
                contact.setText("Contact number: " + model.getContact());


                dialogPlus.show();
            }
        });

        /*holder.trackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(demoDataFetch.class,googleMap.class);
                startActivity(intent);
            }
        });*/
    }


    /**
     * Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent an item.
     * This new ViewHolder should be constructed with a new View that can represent the items of the given type.
     * You can either create a new View manually or inflate it from an XML layout file.
     * @param parent  The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param viewType  The view type of the new View.
     * @return myViewHolder  a new ViewHolder that holds a View of the given view type.
     */
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        return new myViewHolder(view);
    }


    /**
     * myViewHolder will take the reference of all the views created in a xml file for a single row of a RecyclerView.
     */
    class myViewHolder extends RecyclerView.ViewHolder{

        //Initialize variables
        CircleImageView img;
        TextView location,size,price;
        Button button/*, trackButton*/;

        /**
         * Constructs and Initialize a view.
         * @param itemView  given view created in a xml file for a single row of a RecyclerView.
         */
        public myViewHolder(@NonNull View itemView)
        {
            super(itemView);

            //Assign variables
            img = (CircleImageView) itemView.findViewById(R.id.Image_singleRow_ID) ;
            location = (TextView) itemView.findViewById(R.id.location_singleRow_ID);
            size = (TextView) itemView.findViewById(R.id.size_singleRow_ID);
            price = (TextView) itemView.findViewById(R.id.price_singleRow_ID);

            button = (Button) itemView.findViewById(R.id.DetailsButton_singleRow_ID);
            //trackButton = (Button) itemView.findViewById(R.id.googleMap_dialog_ID);
        }
    }
}
