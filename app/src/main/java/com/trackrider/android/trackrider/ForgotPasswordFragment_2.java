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

public class ForgotPasswordFragment_2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Inflate layout for this fragment
        View view = inflater.inflate(R.layout.tr_forgot_password_fragment_2, container, false);
        final TextInputEditText sentCode = view.findViewById(R.id.et_code);
        final TextInputEditText newPassword = view.findViewById(R.id.et_new_password);
        final TextInputEditText confirmPassword = view.findViewById(R.id.et_confirm_new_password);

        MaterialButton cancelButton = view.findViewById(R.id.btn_cancel_forgot_pwd);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sentCode.setText("");
                newPassword.setText("");
                confirmPassword.setText("");
            }
        });


        return view;

    }

}
