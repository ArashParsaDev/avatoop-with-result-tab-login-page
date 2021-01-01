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
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Model.ModelGamesTable;
import com.example.avatoop.Model.ModelHotTopics;
import com.example.avatoop.R;

import java.util.List;

public class RecyclerViewGamesTableAdapter extends RecyclerView.Adapter<RecyclerViewGamesTableAdapter.GamesTableViewHolder> {

    Context mcontext;
    List<ModelGamesTable> mGamesTable;

    public RecyclerViewGamesTableAdapter(Context mcontext, List<ModelGamesTable> mGamesTable) {
        this.mcontext = mcontext;
        this.mGamesTable = mGamesTable;
    }

    @NonNull
    @Override
    public GamesTableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.layout_games_table_item,parent,false);
        GamesTableViewHolder vHolder =new GamesTableViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GamesTableViewHolder holder, int position) {

        holder.iconLeage.setImageResource(mGamesTable.get(position).getImageIconLeague());
        holder.iconTeam1.setImageResource(mGamesTable.get(position).getImageIconTeam1());
        holder.iconTeam2.setImageResource(mGamesTable.get(position).getImageIconTeam2());
        holder.iconTeam3.setImageResource(mGamesTable.get(position).getImageIconTeam3());
        holder.iconTeam4.setImageResource(mGamesTable.get(position).getImageIconTeam4());
        holder.tvLeague.setText(mGamesTable.get(position).getTitleLeage());
        holder.tvTeam1.setText(mGamesTable.get(position).getTitleTeam1());
        holder.tvTeam2.setText(mGamesTable.get(position).getTitleTeam2());
        holder.tvTeam3.setText(mGamesTable.get(position).getTitleTeam3());
        holder.tvTeam4.setText(mGamesTable.get(position).getTitleTeam4());
        holder.timeGame1.setText(mGamesTable.get(position).getGame1Time());
        holder.timeGame2.setText(mGamesTable.get(position).getGame2Time());

    }

    @Override
    public int getItemCount() {
        return mGamesTable.size();
    }

    public static class GamesTableViewHolder extends RecyclerView.ViewHolder {

        //private FrameLayout itemGamesTable;
        private ImageView iconLeage;
        private ImageView iconTeam1;
        private ImageView iconTeam2;
        private ImageView iconTeam3;
        private ImageView iconTeam4;
        private TextView tvLeague;
        private TextView tvTeam1;
        private TextView tvTeam2;
        private TextView tvTeam3;
        private TextView tvTeam4;
        private TextView timeGame1;
        private TextView timeGame2;




        public GamesTableViewHolder(@NonNull View itemView) {
            super(itemView);

            iconLeage = itemView.findViewById(R.id.iv_game_table_icon_league);
            iconTeam1 = itemView.findViewById(R.id.iv_game_table_icon_team1);
            iconTeam2 = itemView.findViewById(R.id.iv_game_table_icon_team2);
            iconTeam3 = itemView.findViewById(R.id.iv_game_table_icon_team3);
            iconTeam4 = itemView.findViewById(R.id.iv_game_table_icon_team4);
            tvLeague = itemView.findViewById(R.id.tv_league);
            tvTeam1 = itemView.findViewById(R.id.tv_game_table_team1);
            tvTeam2 = itemView.findViewById(R.id.tv_game_table_team2);
            tvTeam3 = itemView.findViewById(R.id.tv_game_table_team3);
            tvTeam4 = itemView.findViewById(R.id.tv_game_table_team4);
            timeGame1 = itemView.findViewById(R.id.tv_game_table_time_game1);
            timeGame2 = itemView.findViewById(R.id.tv_game_table_time_game2);

        }
    }
}
