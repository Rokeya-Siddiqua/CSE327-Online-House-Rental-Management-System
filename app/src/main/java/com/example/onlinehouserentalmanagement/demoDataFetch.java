package com.example.onlinehouserentalmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

/**
 * demoDataFetch will show some information of all the stored vacant houses in the portal through a list.
 * after clicking that tenant can view the details information about that particular house.
 * tenant can also search for houses.
 */
public class demoDataFetch extends AppCompatActivity {

    //Initialize variable
    RecyclerView recyclerView;
    myAdapter adapter;

    /**
     * onCreate function is Called when the activity is first created.
     * This method also provides a Bundle containing the activity's previously frozen state, if there was one.
     * Always followed by onStart().
     * @param savedInstanceState  it is a Bundle containing the activity's previously frozen state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_data_fetch);
        this.setTitle("Search For House");

        recyclerView = (RecyclerView) findViewById(R.id.RecyclerView_ID);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<record> options = new FirebaseRecyclerOptions.
                Builder<record>().
                setQuery(FirebaseDatabase.getInstance().getReference().child("House Information"),record.class).build();

        adapter = new myAdapter(options);
        recyclerView.setAdapter(adapter);
    }

    /**
     * onStart is called when the activity is becoming visible to the user.
     * Followed by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.
     */
    protected void onStart()
    {
        super.onStart();
        adapter.startListening();
    }

    /**
     * 	onStop is called when the activity is no longer visible to the user.
     * 	when a new activity is being started on top, an existing one is being brought in front of this one, or this one is being destroyed.
     * 	This is typically used to stop animations and refreshing the UI, etc.
     * Followed by either onRestart() if this activity is coming back to interact with the user, or onDestroy() if this activity is going away.
     */
    protected void onStop()
    {
        super.onStop();
        adapter.stopListening();
    }

    /**
     * it will create a option named Search in the menu
     * through this search option tenant can search for houses only location wise
     * @param menu  it will push the search option in the menu bar.
     * @return  true if the task is successful else false.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search_menu,menu);

        MenuItem item = menu.findItem(R.id.search_Menu_ID);

        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            /**
             * onQueryTextSubmit is called when the user submits the query.
             * @param s  the query text that is to be submitted.
             * @return  true if the query has been handled by the listener, false to let the SearchView perform the default action.
             */
            @Override
            public boolean onQueryTextSubmit(String s) {
                processSearch(s);
                return false;
            }

            /**
             * onQueryTextChange is called when the query text is changed by the user.
             * @param s  the new content of the query text field.
             * @return  false if the SearchView should perform the default action of showing any suggestions if available, true if the action was handled by the listener.
             */
            @Override
            public boolean onQueryTextChange(String s) {
                processSearch(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    /**
     * processSearch is called to search the houses location given by the tenant from the stored vacant houses.
     * @param s  it is the start point for searching houses.
     */
    private void processSearch(String s) {

        FirebaseRecyclerOptions<record> options = new FirebaseRecyclerOptions.
                Builder<record>().
                setQuery(FirebaseDatabase.getInstance().getReference().child("House Information").orderByChild("location").startAt(s).endAt(s+"\uf8ff"),record.class).build();

        adapter = new myAdapter(options);
        adapter.startListening();
        recyclerView.setAdapter(adapter);
    }
}
