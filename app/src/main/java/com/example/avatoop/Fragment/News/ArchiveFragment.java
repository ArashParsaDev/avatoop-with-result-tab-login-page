package com.example.avatoop.Fragment.News;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.avatoop.R;

public class ArchiveFragment extends Fragment {
    View myfragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return myfragment = inflater.inflate(R.layout.fragment_archive,container,false);
    }
}
