package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder>
{
    private DataModel[] listdata;


    public MoviesAdapter(DataModel[] dataModel) {
        this.listdata = dataModel;
    }

    @NonNull
    @Override
    public MoviesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_show, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.ViewHolder holder, int position) {
        final DataModel myListData = listdata[position];
        holder.movie_name.setText(listdata[position].getMovie_name());
        holder.year.setText(listdata[position].getYear());
        holder.rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"click on item: "+myListData.getMovie_name(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView movie_name;
        public TextView year;
        public Button rating;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.movie_name = itemView.findViewById(R.id.movie);
            this.year = itemView.findViewById(R.id.year);
            this.rating = itemView.findViewById(R.id.rating);
        }
    }
}
