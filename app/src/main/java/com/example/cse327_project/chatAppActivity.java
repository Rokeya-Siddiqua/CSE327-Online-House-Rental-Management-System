package com.example.cse327_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * chatAppActivity represents the conversation of user and admin.
 * User can contact with the admin for any help through live chat .
 * User have to visit demo page first
 * and by clicking the chat button,they can enter this page.
 * user will have set a name into the dialogue box and can proceed to choose topic for conversation .
 * And this name will be stored in the database and will show this name when send any message.
 * By clicking the topic name,it will take user to the discussion page to for the conversation.
 * Any user can enter to this by entering name into the dialog box and can see the topic name for conversation.
 */
public class chatAppActivity extends AppCompatActivity {
    ListView lvDisscussionTopics;
    ArrayList<String> listOfDisscussion = new ArrayList<String>();
    ArrayAdapter arrayAdapt;
    String userName;
    private DatabaseReference Dbr = FirebaseDatabase.getInstance().getReference().getRoot();

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_app);

        lvDisscussionTopics = (ListView) findViewById(R.id.lvDisscussionTopics);
        arrayAdapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfDisscussion);
        lvDisscussionTopics.setAdapter(arrayAdapt);
        getUserName();

        /**
         * addValueEventListener is called to set action with firebase database.
         * It will fetch all the topic name from the database to console.
         * ValueEventListener Interface definition for a callback to be invoked when a dataSnapshot is clicked.
         * This function call a new function named onDataChange.
         */
        Dbr.addValueEventListener(new ValueEventListener()
        {
            /**
             * onDataChange  represents to retrieve the topic of user's conversation from database
             * and display all the topic name to the user.
             * @param dataSnapshot  represents to retrieve data from firebase database location.
             */
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {

            Set<String> set = new HashSet<String>();
            Iterator i = dataSnapshot.getChildren().iterator();

            while( i.hasNext() )
            {

            set.add( ((DataSnapshot)i.next()).getKey() );

            }
            arrayAdapt.clear();
            arrayAdapt.addAll(set);
            arrayAdapt.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(DatabaseError databaseError)
            {

            }
        });

        /**
         * setOnItemClickListener is called to set action through a button.
         * by clicking any topic from listview it wll take to that particular discussion page.
         * AdapterView.OnItemClickListener is a Interface definition for a callback to be invoked the method.
         * This function call a new function named onItemClick.
         */
        lvDisscussionTopics.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            /**
             * All the topic will shown to this page
             * From where user can choose any of this topic.
             * By clicking any topic from listview it wll take to that discussion page.
             * @param parent  will get the adapterView interface.
             * @param view  the view that was clicked.
             * @param position  will get a position.
             * @param id  will get and assign the id.
             */
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

            Intent i = new Intent(getApplicationContext(), discussionActivity.class);
            i.putExtra("selected_topic", ((TextView)view).getText().toString());
            i.putExtra("user_name", userName);
            startActivity(i);

            }
        });
    }

    /**
     * getUserName represents to get which user wants to give a message.
     * this method will show user a dialog box where user have to put their name.
     * And user name will be stored in the database.
     * If user don't put their will not let them enter to show the discussion topic.
     */
    private void getUserName()
    {

    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    final EditText USER_NAME = new EditText(this);
    builder.setView(USER_NAME);

        /**
         * This will set the ok button to the dialog box.
         * DialogInterface.OnClickListener will set action to this button.
         * When user will click this they can proceed to next page.
         */
    builder.setPositiveButton("ok", new DialogInterface.OnClickListener()
    {
        /**
         * This onclick method will accept the name which will be given by user.
         * @param dialogInterface  invoke the interface.
         * @param i  set a integer value.
         */
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {

            userName = USER_NAME.getText().toString();

            }

    });

        /**
         * This will set the cancel button to the dialog box.
         * DialogInterface.OnClickListener will set action to this button.
         * When user will click this they can proceed to next page.
         */
    builder.setNegativeButton( "cancel", new DialogInterface.OnClickListener()
    {
        /**
         * This onclick method will not accept to  go further and will appear again to user
         * and ask for attention and give their name to dialog box.
         * @param dialogInterface  invoke the interface.
         * @param i  set a integer value.
         */
      @Override
      public void onClick( DialogInterface dialogInterface, int i)
      {

      getUserName();

      }

    });
    builder.show();

    }
}