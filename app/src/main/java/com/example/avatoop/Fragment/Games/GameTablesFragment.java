package com.example.avatoop.Fragment.Games;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Adapter.RecyclerViewGamesTableAdapter;
import com.example.avatoop.Adapter.RecyclerViewHotTopicAdapter;
import com.example.avatoop.Model.ModelGamesTable;
import com.example.avatoop.Model.ModelHotTopics;
import com.example.avatoop.R;

import java.util.ArrayList;
import java.util.List;

public class GameTablesFragment extends Fragment {
    View myfragment;

    RecyclerView recyclerViewGamesTable;
    List<ModelGamesTable> modelGamesTable;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myfragment = inflater.inflate(R.layout.fragment_games_tables,container,false);
        recyclerViewGamesTable = myfragment.findViewById(R.id.rv_games_table);
        RecyclerViewGamesTableAdapter adapter = new RecyclerViewGamesTableAdapter(getContext(),modelGamesTable);
        recyclerViewGamesTable.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewGamesTable.setAdapter(adapter);
        return myfragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        modelGamesTable = new ArrayList<>();
        modelGamesTable.add(new ModelGamesTable(1,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(2,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(3,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(4,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(5,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(6,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(7,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));
        modelGamesTable.add(new ModelGamesTable(8,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","12:30","15:45"));


    }
}
