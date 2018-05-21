package com.softwaresunleashed.dog.recyclerview_npiselector;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.softwaresunleashed.dog.R;
import com.softwaresunleashed.dog.database.NPISelectionDatabaseDetails;

import java.util.List;

public class NPISelectionAdapter extends RecyclerView.Adapter<NPISelectionAdapter.MyViewHolder> {

    private List<NPISelectionDatabaseDetails> NPI_List;

    public NPISelectionAdapter(List<NPISelectionDatabaseDetails> NPI_List) {
        this.NPI_List = NPI_List;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.npi_list, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        NPISelectionDatabaseDetails NPI_entry = NPI_List.get(position);
        holder.npi_list_item.setText(NPI_entry.getNPIDisplayName());
        holder.npi_db_name.setText(NPI_entry.getNPI_DB_Name());
    }

    @Override
    public int getItemCount() {
        return NPI_List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView npi_list_item, npi_db_name;

        public MyViewHolder(View view) {
            super(view);
            npi_list_item = (TextView) view.findViewById(R.id.npi_list_item);
            npi_db_name = (TextView) view.findViewById(R.id.npi_db_name);

        }
    }
}
