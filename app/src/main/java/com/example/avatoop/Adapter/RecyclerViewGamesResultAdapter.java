package com.example.avatoop.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Model.ModelGamesResults;
import com.example.avatoop.Model.ModelGamesTable;
import com.example.avatoop.R;

import java.util.List;

public class RecyclerViewGamesResultAdapter extends RecyclerView.Adapter<RecyclerViewGamesResultAdapter.GamesTableViewHolder> {

    Context mcontext;
    List<ModelGamesResults> mGamesResults;

    public RecyclerViewGamesResultAdapter(Context mcontext, List<ModelGamesResults> mGamesResults) {
        this.mcontext = mcontext;
        this.mGamesResults = mGamesResults;
    }

    @NonNull
    @Override
    public GamesTableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.layout_games_results_item,parent,false);
        GamesTableViewHolder vHolder =new GamesTableViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GamesTableViewHolder holder, int position) {

        holder.iconLeage.setImageResource(mGamesResults.get(position).getImageIconLeague());
        holder.iconTeam1.setImageResource(mGamesResults.get(position).getImageIconTeam1());
        holder.iconTeam2.setImageResource(mGamesResults.get(position).getImageIconTeam2());
        holder.iconTeam3.setImageResource(mGamesResults.get(position).getImageIconTeam3());
        holder.iconTeam4.setImageResource(mGamesResults.get(position).getImageIconTeam4());
        holder.tvLeague.setText(mGamesResults.get(position).getTitleLeage());
        holder.tvTeam1.setText(mGamesResults.get(position).getTitleTeam1());
        holder.tvTeam2.setText(mGamesResults.get(position).getTitleTeam2());
        holder.tvTeam3.setText(mGamesResults.get(position).getTitleTeam3());
        holder.tvTeam4.setText(mGamesResults.get(position).getTitleTeam4());
        holder.resultGame1.setText(mGamesResults.get(position).getGame1Result());
        holder.resultGame2.setText(mGamesResults.get(position).getGame2Result());
        holder.resultGame3.setText(mGamesResults.get(position).getGame3Result());
        holder.resultGame4.setText(mGamesResults.get(position).getGame4Result());

    }

    @Override
    public int getItemCount() {
        return mGamesResults.size();
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
        private TextView resultGame1;
        private TextView resultGame2;
        private TextView resultGame3;
        private TextView resultGame4;





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
            resultGame1 = itemView.findViewById(R.id.tv_game_result_time_game1);
            resultGame2 = itemView.findViewById(R.id.tv_game_result_time_game2);
            resultGame3 = itemView.findViewById(R.id.tv_game_result_time_game3);
            resultGame4 = itemView.findViewById(R.id.tv_game_result_time_game4);

        }
    }
}
