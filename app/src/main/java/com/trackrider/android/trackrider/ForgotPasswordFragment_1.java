package com.trackrider.android.trackrider;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForgotPasswordFragment_1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Inflate layout for this fragment
        View view = inflater.inflate(R.layout.tr_forgot_password_fragment_1, container, false);
        MaterialButton submitButton = view.findViewById(R.id.submit_button_forgotPassword_1);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((NavigationHost) getActivity()).navigateTo(new ForgotPasswordFragment_2(),true);
            }
        });


        return view;


    }
}
