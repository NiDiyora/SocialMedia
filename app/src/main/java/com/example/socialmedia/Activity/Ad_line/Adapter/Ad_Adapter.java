package com.example.socialmedia.Activity.Ad_line.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmedia.R;

public class Ad_Adapter extends RecyclerView.Adapter<Ad_Adapter.ViewHolder>{

    Context context;
    int[] list;

    public Ad_Adapter(FragmentActivity context, int[] list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ads, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.view.setImageDrawable(context.getResources().getDrawable(list[position]));

    }

    @Override
    public int getItemCount() {
        return list.length;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView.findViewById(R.id.image);
        }
    }
}
