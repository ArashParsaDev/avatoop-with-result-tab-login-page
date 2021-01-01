package com.example.avatoop.Fragment.News;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Adapter.RecyclerViewHotTopicAdapter;
import com.example.avatoop.Model.ModelHotTopics;
import com.example.avatoop.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class HotTopicsFragment extends Fragment {
    View myfragment;


    //RV :
    RecyclerView recyclerViewHotTopic;
    List<ModelHotTopics> modelHotTopics;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myfragment = inflater.inflate(R.layout.fragment_hot_topics,container,false);
        recyclerViewHotTopic = myfragment.findViewById(R.id.rv_hot_topics);
        RecyclerViewHotTopicAdapter adapter = new RecyclerViewHotTopicAdapter(getContext(),modelHotTopics);
        recyclerViewHotTopic.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewHotTopic.setAdapter(adapter);
        return myfragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        modelHotTopics = new ArrayList<>();
        modelHotTopics.add(new ModelHotTopics(1,R.drawable.ronaldo,"تسنيم","آخرین بازی کریستیانو رونالدو برای تیم فوتبال یوونتوس مقابل تیم فیورنتینا می\u200Cباشد. این بازی با نتیجه یوونتوس (0 - 3) فیورنتینا به پایان رسید."));
        modelHotTopics.add(new ModelHotTopics(2,R.drawable.inter_hot_topic,"تسنيم","آمادگی اینتر برای به خدمت گرفتن مهاجم لیورپول "));
        modelHotTopics.add(new ModelHotTopics(3,R.drawable.casta_hot_topic,"تسنيم","کاستا خواهان جدایی زودهنگام از اتلتیکومادرید "));
        modelHotTopics.add(new ModelHotTopics(4,R.drawable.jam_hot_topic,"تسنيم","جام حذفی از چه زمانی شروع میشود؟"));
        modelHotTopics.add(new ModelHotTopics(5,R.drawable.hot_topic1,"تسنيم","حضور مشاور هیئت مدیره و نظارت ویژه فکری "));
        modelHotTopics.add(new ModelHotTopics(6,R.drawable.hot_topic2,"خبرگزاري مهر","برد ۲ بر یک خیبر خرمآباد مقابل آرمان گهر سیرجان "));

    }

}
