package com.example.socialmedia.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmedia.R;

import java.util.List;

public class Tag_Friend_Adapter extends RecyclerView.Adapter<Tag_Friend_Adapter.ViewHolder> {
    Context context;
    String[] list;
    public Tag_Friend_Adapter(String[] list,Context context) {
        this.list=list;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.tag_friend_layout, parent, false);
            ViewHolder viewHolder = new ViewHolder(view);
            return viewHolder;
        }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.view.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView.findViewById(R.id.txt_name);
        }
    }
}
