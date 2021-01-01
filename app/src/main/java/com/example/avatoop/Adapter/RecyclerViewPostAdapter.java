package com.example.avatoop.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Model.ModelPost;
import com.example.avatoop.R;

import java.util.List;

public class RecyclerViewPostAdapter extends RecyclerView.Adapter<RecyclerViewPostAdapter.MyViewHolder> {

    Context mcontext;
    List<ModelPost> mposts;

    public RecyclerViewPostAdapter(Context mcontext, List<ModelPost> mposts) {
        this.mcontext = mcontext;
        this.mposts = mposts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.layout_post_item,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.post.setImageResource(mposts.get(position).getImagePost());
        holder.iconPost.setImageResource(mposts.get(position).getImageIcon());
        holder.postTitle.setText(mposts.get(position).getPostTitle());

    }

    @Override
    public int getItemCount() {
        return mposts.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView iconPost;
        private ImageView post;
        private TextView postTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            iconPost = itemView.findViewById(R.id.image_icon_post);
            post = itemView.findViewById(R.id.image_post);
            postTitle = itemView.findViewById(R.id.tv_post_title);
        }
    }
}
