package com.example.avatoop.Fragment.Profile;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.avatoop.MySingleton;
import com.example.avatoop.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class LogInFragment extends Fragment {

    View view;
    Button forgetPasswordButton;
    Button registerButton;
    Button loginButton;
    EditText etPhone;

    static String random;
    static String getPhone;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_log_in,container,false);

        forgetPasswordButton = view.findViewById(R.id.btn_login_forget_password);
        registerButton = view.findViewById(R.id.btn_login_register);
        loginButton = view.findViewById(R.id.btn_login_login);
        etPhone = view.findViewById(R.id.et_login_mobile);


        forgetPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "sadsd", Toast.LENGTH_SHORT).show();
                ForgetPasswordFragment forgetPasswordFragment = new ForgetPasswordFragment();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_main_fragment_container,forgetPasswordFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

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


                String phone = etPhone.getText().toString();
                if(!phone.matches("(\\+98|0)?9\\d{9}")){
                    Toast.makeText(getActivity(), "شماره موبایل معتبر نمی باشد!", Toast.LENGTH_SHORT).show();
                }else {
                    GetNumberFragment getNumberFragment = new GetNumberFragment();
                    FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame_main_fragment_container,getNumberFragment);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                 //   sendRequest();
                }
            }
        });
        return view;

    }

    /*private void sendRequest() {

        random = String.valueOf((int)(Math.random()*1000000));
        getPhone = etPhone.getText().toString().trim();
        String url = "https://api.kavenegar.com/v1/344E78734E6241415547413558574D42366736644A4D6736742F78322B6E5A4E6D5A542F502F796E6A2B4D3D/verify/" +
                "lookup.json?receptor="+getPhone+"&token="+random+"&template=verify";

        final ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setCancelable(false);

        Response.Listener<JSONObject> listener = new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject object = response.getJSONObject("return");
                    int result = object.getInt("status");
                    if(result ==200){
                        Toast.makeText(getActivity(), "عملیات با موفقیت انجام شد.", Toast.LENGTH_SHORT).show();
                        GetNumberFragment getNumberFragment = new GetNumberFragment();
                        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame_main_fragment_container,getNumberFragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                        progressDialog.dismiss();
                    }else {
                        Toast.makeText(getActivity(), "خطا در اتصال", Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();

                    }

                }catch (JSONException e){
                    e.printStackTrace();
                }
            }
        };

        Response.ErrorListener errorListener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), "عملیات با موفقیت انجام نشد", Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        };
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET,url,null,listener,errorListener);
        MySingleton.getInstance(getContext().);



    }*/
}
