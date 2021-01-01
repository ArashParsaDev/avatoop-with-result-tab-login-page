package com.example.avatoop.Fragment.Profile;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.avatoop.R;

public class GetNumberFragment extends Fragment {
     View view;

     Button confirmButton,retryButton;
    EditText getCodeEt;
    TextView textCountTime;

    String getCode;
    String getCodeEditText;




     SharedPreferences preferences;
     SharedPreferences.Editor editor;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_get_number,container,false);
        confirmButton = view.findViewById(R.id.btn_getNumber_confirm);
        retryButton = view.findViewById(R.id.btn_getNumber_retry);
        getCodeEt = view.findViewById(R.id.et_getNumber_getCode);
        textCountTime = view.findViewById(R.id.tv_getNumber_textCountTime);



        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        CountDownTimer countDownTimer = new CountDownTimer(120000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textCountTime.setText(String.valueOf(millisUntilFinished/1000)+" " +  " ثانیه تا ارسال مجدد کد تایید");


            }

            @Override
            public void onFinish() {
                Toast.makeText(getActivity(), "زمان شما به پایان رسید", Toast.LENGTH_SHORT).show();
                retryButton.setVisibility(View.VISIBLE);

            }
        };
        countDownTimer.start();


      /*  preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        boolean login = preferences.getBoolean("HasSignUp",false);
        if(login){
            Toast.makeText(getActivity(), "شما قبلا ثبت نام کرده اید", Toast.LENGTH_SHORT).show();

        }*/

        return view;
    }
}
