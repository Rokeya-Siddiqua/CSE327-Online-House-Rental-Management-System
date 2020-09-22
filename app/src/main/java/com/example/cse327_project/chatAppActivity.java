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
 * any user can enter to this by entering name into the dialog box.
 */
public class chatAppActivity extends AppCompatActivity {
    ListView lvDisscussionTopics;
    ArrayList<String> listOfDisscussion = new ArrayList<String>();
    ArrayAdapter arrayAdapt;
    String userName;
    private DatabaseReference Dbr = FirebaseDatabase.getInstance().getReference().getRoot();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_app);

        lvDisscussionTopics = (ListView) findViewById(R.id.lvDisscussionTopics);
        arrayAdapt = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfDisscussion);
        lvDisscussionTopics.setAdapter(arrayAdapt);

        getUserName();

        Dbr.addValueEventListener(new ValueEventListener()
        {
            /**
             * onDataChange  represents to retrieve the topic of user's conversation from database.
             * @param dataSnapshot  represents to retrieve data from firebase database location.
             */

            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {

            Set<String> set = new HashSet<String>();
            Iterator i = dataSnapshot.getChildren().iterator();

            while(  i.hasNext()  )
            {

            set.add( ((DataSnapshot)i.next()).getKey() );

            }

            arrayAdapt.clear();
            arrayAdapt.addAll(set);
            arrayAdapt.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        lvDisscussionTopics.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
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
     */
    private void getUserName()
    {

    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    final EditText USER_NAME = new EditText(this);
    builder.setView(USER_NAME);
    builder.setPositiveButton("ok", new DialogInterface.OnClickListener()
    {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {

            userName = USER_NAME.getText().toString();

            }

    });

        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getUserName();
            }
        });

        builder.show();

    }
}