package com.example.testapp.UI.Main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testapp.R;
import com.example.testapp.pojo.PostModel;

import java.util.ArrayList;

public class PostsAdaptor extends RecyclerView.Adapter<PostsAdaptor.ViewHolder> {
    private ArrayList<PostModel> arrayList = new ArrayList<>();

    @NonNull
    @Override
    public PostsAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostsAdaptor.ViewHolder holder, int position) {
        holder.userId.setText(Integer.toString(arrayList.get(position).getUserId()));
        holder.userTitle.setText(arrayList.get(position).getTitle());
        holder.userBody.setText(arrayList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView userId;
        public TextView userTitle;
        public TextView userBody;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userId);
            userTitle = itemView.findViewById(R.id.userTitle);
            userBody = itemView.findViewById(R.id.userBody);
        }
    }

    public void setList(ArrayList<PostModel> list) {
        this.arrayList = list;
        notifyDataSetChanged();
    }
}
