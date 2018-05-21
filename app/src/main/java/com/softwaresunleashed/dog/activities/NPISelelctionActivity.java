package com.softwaresunleashed.dog.activities;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.softwaresunleashed.dog.Preferences;
import com.softwaresunleashed.dog.R;
import com.softwaresunleashed.dog.database.DatabaseHelper;
import com.softwaresunleashed.dog.database.NPISelectionDatabaseDetails;
import com.softwaresunleashed.dog.recyclerview_npiselector.NPISelectionAdapter;
import com.softwaresunleashed.dog.recyclerview_npiselector.RecyclerTouchListener;


public class NPISelelctionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NPISelectionAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npiselelction);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("D.O.G.");
        ab.setSubtitle("Select NPI DataBase...");

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new NPISelectionAdapter(NPISelectionDatabaseDetails.db_details);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));


        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                NPISelectionDatabaseDetails npi_db_item = NPISelectionDatabaseDetails.db_details.get(position);

                // Store the selected DB Entry
                Preferences.setCurrentNPIDB(getApplicationContext(), npi_db_item.NPI_DB_Name);
                DatabaseHelper.DB_NAME = npi_db_item.NPI_DB_Name;
                Toast.makeText(getApplicationContext(), npi_db_item.getNPIDisplayName() + " is selected as current NPI DB.", Toast.LENGTH_LONG).show();

                // Close Activity
                finish();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        recyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }



}
