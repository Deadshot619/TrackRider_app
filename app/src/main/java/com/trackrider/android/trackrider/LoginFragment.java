package com.trackrider.android.trackrider;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Inflate layout for this fragment
        View view = inflater.inflate(R.layout.tr_login_fragment, container, false);

        TextView forgotPasswordButton = view.findViewById(R.id.tv_forgot_password);
        TextView signupButton = view.findViewById(R.id.tv_signup_on_login_page);

        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((NavigationHost) getActivity()).navigateTo(new ForgotPasswordFragment_1(),true);
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((NavigationHost) getActivity()).navigateTo(new SignUpFragment(),true);

            }
        });
        return view;
    }
}

