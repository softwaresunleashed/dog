package com.softwaresunleashed.dog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.softwaresunleashed.dog.database.NPISelectionDatabaseDetails;
import com.softwaresunleashed.dog.recyclerview.NPISelectionAdapter;


public class NPISelelctionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NPISelectionAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npiselelction);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new NPISelectionAdapter(NPISelectionDatabaseDetails.db_details);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();
    }



}
