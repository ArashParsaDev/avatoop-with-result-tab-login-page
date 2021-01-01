package com.example.avatoop.Fragment;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avatoop.Adapter.RecyclerViewPostAdapter;
import com.example.avatoop.EndDrawerToggle;
import com.example.avatoop.Model.ModelPost;
import com.example.avatoop.R;
import com.google.android.material.button.MaterialButton;
import com.like.LikeButton;
import com.like.OnLikeListener;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment  {

    View view;

    private LikeButton heartBtn;

    //rv post

    private RecyclerView recyclerViewPost;
    private List<ModelPost> listposts;



    private EndDrawerToggle drawerToggle;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_home,container,false);
        recyclerViewPost = view.findViewById(R.id.rv_post);
        RecyclerViewPostAdapter adapter = new RecyclerViewPostAdapter(getContext(),listposts);
        recyclerViewPost.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewPost.setAdapter(adapter);

        heartBtn = view.findViewById(R.id.btn_item_post_heart);
       /* heartBtn.setOnLikeListener(new OnLikeListener() {
            @Override
            public void liked(LikeButton likeButton) {

            }

            @Override
            public void unLiked(LikeButton likeButton) {

            }
        });*/



        return view;
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = view.findViewById(R.id.toolbar_home);
        toolbar.setTitle("");
        // toolbar.setNavigationIcon(R.drawable.ic_baseline_menu_24);
        AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
        appCompatActivity.setSupportActionBar(toolbar);
        DrawerLayout drawerLayout = view.findViewById(R.id.drawerlayout_Home);

        //For ltr DrawerLayout::
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.draweropen, R.string.drawerclose);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        //For rtl DrawerLayout + Add EndDrawerToggle Class ::
       /* drawerToggle = new EndDrawerToggle(getActivity(),
                drawerLayout,
                toolbar,
                R.string.draweropen,
                R.string.drawerclose);

        drawerLayout.addDrawerListener(drawerToggle);*/
    }

    //search button
    //Enable options menu in this fragment :

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);

        listposts = new ArrayList<>();
        listposts.add(new ModelPost(1,R.drawable.abi,R.drawable.ronaldo,"Ronaldo"));
        listposts.add(new ModelPost(2,R.drawable.abi,R.drawable.messi,"Messi"));
        listposts.add(new ModelPost(3,R.drawable.abi,R.drawable.neymar,"Neymar"));
        listposts.add(new ModelPost(1,R.drawable.abi,R.drawable.ronaldo,"Ronaldo"));
        listposts.add(new ModelPost(2,R.drawable.abi,R.drawable.messi,"Messi"));
        listposts.add(new ModelPost(3,R.drawable.abi,R.drawable.neymar,"Neymar"));



    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        //inflate menu
        inflater.inflate(R.menu.menu_search, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //handle menu item clicks
        int id  = item.getItemId();
        if(id == R.id.action_search){
            Toast.makeText(getActivity(), "search", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


    //Post RV
   /* private void setUpPost() {
        adapterPost = new AdapterPost(getActivity(), modelPosts);
        recyclerViewPost.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        recyclerViewPost.setAdapter(adapterPost);
        recyclerViewPost.setHasFixedSize(true);

        modelPosts.add(new ModelPost(1,"https://uupload.ir/files/0j7t_zard.png","https://uupload.ir/files/qee7_messi.png","Lionel Messi"));
        modelPosts.add(new ModelPost(1,"https://uupload.ir/files/0j7t_zard.png","https://uupload.ir/files/qee7_messi.png","Lionel Messi"));
        modelPosts.add(new ModelPost(1,"https://uupload.ir/files/0j7t_zard.png","https://uupload.ir/files/qee7_messi.png","Lionel Messi"));
        modelPosts.add(new ModelPost(2,"https://uupload.ir/files/7x25_abi.jpg","https://uupload.ir/files/c23m_ronaldo.png","Cristiano Ronlado"));
        modelPosts.add(new ModelPost(3,"https://uupload.ir/files/0j7t_zard.png","https://uupload.ir/files/jq7g_neymar.png","Neymar"));
        modelPosts.add(new ModelPost(4,"https://uupload.ir/files/0j7t_zard.png","https://uupload.ir/files/jq7g_neymar.png","Neymar"));
        modelPosts.add(new ModelPost(5,"https://uupload.ir/files/0j7t_zard.png","https://uupload.ir/files/jq7g_neymar.png","Neymar"));
        adapterPost.notifyDataSetChanged();
    }*/

   /* public void usingCustomIcons() {

        //shown when the button is in its default state or when unLiked.
        commentButton.setUnlikeDrawable(new BitmapDrawable(getResources(), new IconicsDrawable(this, CommunityMaterial.Icon.cmd_emoticon).colorRes(android.R.color.darker_gray).sizeDp(25).toBitmap()));

        //shown when the button is liked!
        commentButton.setLikeDrawable(new BitmapDrawable(getResources(), new IconicsDrawable(this, CommunityMaterial.Icon.cmd_emoticon).colorRes(android.R.color.holo_purple).sizeDp(25).toBitmap()));
    }

*/
}