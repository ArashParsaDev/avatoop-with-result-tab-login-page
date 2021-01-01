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

import com.example.avatoop.Adapter.RecyclerViewGamesResultAdapter;
import com.example.avatoop.Adapter.RecyclerViewGamesTableAdapter;
import com.example.avatoop.Model.ModelGamesResults;
import com.example.avatoop.Model.ModelGamesTable;
import com.example.avatoop.R;

import java.util.ArrayList;
import java.util.List;

public class GameResultsFragment extends Fragment {
    View myfragment;

    RecyclerView recyclerViewGamesResult;
    List<ModelGamesResults> modelGamesResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myfragment = inflater.inflate(R.layout.fragment_games_result,container,false);


        recyclerViewGamesResult = myfragment.findViewById(R.id.rv_games_result);
        RecyclerViewGamesResultAdapter adapter = new RecyclerViewGamesResultAdapter(getContext(),modelGamesResult);
        recyclerViewGamesResult.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewGamesResult.setAdapter(adapter);
        return myfragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        modelGamesResult = new ArrayList<>();
        modelGamesResult.add(new ModelGamesResults(1,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","1","1","3","1"));
        modelGamesResult.add(new ModelGamesResults(2,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","3","2","0","2"));
        modelGamesResult.add(new ModelGamesResults(3,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","1","4","6","4"));
        modelGamesResult.add(new ModelGamesResults(4,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","3","3","3","1"));
        modelGamesResult.add(new ModelGamesResults(5,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","2","1","3","3"));
        modelGamesResult.add(new ModelGamesResults(6,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","2","2","2","1"));
        modelGamesResult.add(new ModelGamesResults(7,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","0","1","1","0"));
        modelGamesResult.add(new ModelGamesResults(8,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","1","0","0","2"));
        modelGamesResult.add(new ModelGamesResults(9,R.drawable.bundesliga,R.drawable.real_madrid,R.drawable.barcelona,R.drawable.manchester_united,R.drawable.bayern_munich,"بوندسلیگا","رئال مادرید","بارسلونا","منچستر یونایتد","بایرن مونیخ","1","1","1","0"));
            }
}
