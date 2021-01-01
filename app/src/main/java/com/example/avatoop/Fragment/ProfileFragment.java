package com.example.avatoop.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.avatoop.Fragment.Profile.ForgetPasswordFragment;
import com.example.avatoop.Fragment.Profile.LogInFragment;
import com.example.avatoop.Fragment.Profile.RegisterFragment;
import com.example.avatoop.R;

public class ProfileFragment extends Fragment {

    View myFragment;
    Button registerButton;
    Button loginButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment =  inflater.inflate(R.layout.fragment_profile, container, false);
        registerButton = myFragment.findViewById(R.id.btn_profile_register);
        loginButton = myFragment.findViewById(R.id.btn_profile_log_in);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(getActivity(), "sadsd", Toast.LENGTH_SHORT).show();
                RegisterFragment registerFragment = new RegisterFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_main_fragment_container,registerFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Toast.makeText(getActivity(), "sadsd", Toast.LENGTH_SHORT).show();
                LogInFragment logInFragment = new LogInFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_main_fragment_container,logInFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });






        return  myFragment;
    }
}
