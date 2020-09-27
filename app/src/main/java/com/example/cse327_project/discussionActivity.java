package com.example.cse327_project;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This page  will appear by clicking the topic name of chatAppActivity.
 * here user will give his message to the admin.
 * Their message will be stored in the database.
 * And also retrieve the all the message and will be displayed to this UI.
 * The user name they have put to the dialog box of chatAppActivity
 * that will also be retrieve from database and will display to this page.
 */
public class discussionActivity extends AppCompatActivity {

    Button btnSendMsg;
    EditText etMsg;
    ListView lvDiscussion;
    ArrayList<String> listConversation = new ArrayList<String>();
    ArrayAdapter<String> arrayAdpt;

    String UserName,SelectedTopic, user_msg_key ;
    private DatabaseReference dbr;

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discussion);
        btnSendMsg = (Button) findViewById(R.id.btnSendMsg);
        etMsg = (EditText) findViewById(R.id.etMessage);
        lvDiscussion = (ListView) findViewById(R.id.lvConversation);
        arrayAdpt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listConversation);
        lvDiscussion.setAdapter(arrayAdpt);

        UserName = getIntent().getExtras().get("user_name").toString();
        SelectedTopic = getIntent().getExtras().get("selected_topic").toString();
        setTitle("Topic: " + SelectedTopic);
        dbr = FirebaseDatabase.getInstance().getReference().child(SelectedTopic);

        /**
         * setOnClickListener is called to set action through a button.
         * Here all the message form user will be stored by clicking the button
         * @param View.OnClickListener  Interface definition for a callback to be invoked when a view is clicked.
         * This function call a new function named onClick.
         */
        btnSendMsg.setOnClickListener(new View.OnClickListener() {
            /**
             * This method will get all the message form user
             * and store to the database.
             * If user give send new message that will also be stored in the database.
             * @param v  The view that was clicked.
             */
            @Override

            public void onClick(View v)
            {

            Map<String, Object> map = new HashMap<String, Object>();
            user_msg_key = dbr.push().getKey();
            dbr.updateChildren(map);

            DatabaseReference dbr2 = dbr.child(user_msg_key);
            Map<String, Object> map2 = new HashMap<String, Object>();
            map2.put("msg",etMsg.getText().toString());
            map2.put("user",UserName);
            dbr2.updateChildren(map2);
            etMsg.setText(null);
            }
        });


        dbr.addChildEventListener(new ChildEventListener() {

            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName)
            {
                updateConversation(snapshot);
            }
            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName)
            {
                updateConversation(snapshot);
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot)
            {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName)
            {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    /**
     * updateConversation retrieve all the conversation from database and display into the app.
     * This method will retrieve all the message from database which user have sent
     * will display to this Ui.
     * Admin will replay message of user's, will be appear to this page.
     * User can see their own message in this page as wll.
     * @param snapshot  retrieve values from database.
     */
    public void updateConversation(DataSnapshot snapshot)
    {
        String msg, user,conversation;
        Iterator i = snapshot.getChildren().iterator();

        while (i.hasNext())
        {

        msg = (String) ((DataSnapshot)i.next()).getValue();
        user = (String)((DataSnapshot)i.next()).getValue();
        conversation = user + ": " + msg;
        arrayAdpt.insert(conversation, 0);
        arrayAdpt.notifyDataSetChanged();

        }
    }
}
