package com.trackrider.android.trackrider;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SignUpFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tr_signup_fragment, container, false);
        MaterialButton cancelButton = view.findViewById(R.id.btn_cancel_signup);
        final TextInputEditText username = view.findViewById(R.id.et_username_signup);
        final TextInputEditText email = view.findViewById(R.id.et_email_signup);
        final TextInputEditText password = view.findViewById(R.id.et_password_signup);


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username.setText("");
                email.setText("");
                password.setText("");
            }
        });

        return view;
    }
}
