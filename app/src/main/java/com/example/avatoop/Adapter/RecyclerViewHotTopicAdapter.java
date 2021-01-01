package com.example.avatoop.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Fragment.News.DetailsHotTopicFragment;
import com.example.avatoop.Model.ModelHotTopics;
import com.example.avatoop.R;

import java.util.List;

public class RecyclerViewHotTopicAdapter extends RecyclerView.Adapter<RecyclerViewHotTopicAdapter.HotTopicViewHolder> {

    Context mcontext;
    List<ModelHotTopics> mHotTopics;

    public RecyclerViewHotTopicAdapter(Context mcontext, List<ModelHotTopics> mHotTopics) {
        this.mcontext = mcontext;
        this.mHotTopics = mHotTopics;
    }

    @NonNull
    @Override
    public HotTopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.layout_hot_topic_item, parent, false);
        HotTopicViewHolder vHolder = new HotTopicViewHolder(v);
        vHolder.itemHotTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                DetailsHotTopicFragment detailsHotTopicFragment = new DetailsHotTopicFragment();
                FragmentTransaction fragmentTransaction = activity.getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_main_fragment_container, new DetailsHotTopicFragment());
                //when user click back it will go to previous fragment by :
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                //Toast.makeText(mcontext, "Clicked"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
            }
        });

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HotTopicViewHolder holder, int position) {

        holder.ivHotTopic.setImageResource(mHotTopics.get(position).getImageHotTopic());
        holder.tvDecHotTopic.setText(mHotTopics.get(position).getDesHotTopic());
        holder.tvTitleHotTopic.setText(mHotTopics.get(position).getTitleHotTopic());

    }

    @Override
    public int getItemCount() {
        return mHotTopics.size();
    }

    public static class HotTopicViewHolder extends RecyclerView.ViewHolder {

        private FrameLayout itemHotTopic;
        private ImageView ivHotTopic;
        private TextView tvTitleHotTopic;
        private TextView tvDecHotTopic;

        public HotTopicViewHolder(@NonNull View itemView) {
            super(itemView);

            ivHotTopic = itemView.findViewById(R.id.iv_hot_topic);
            tvTitleHotTopic = itemView.findViewById(R.id.tv_hot_topic_title);
            tvDecHotTopic = itemView.findViewById(R.id.tv_hot_topic_description);
            itemHotTopic = itemView.findViewById(R.id.item_hot_topic);
        }
    }
}
