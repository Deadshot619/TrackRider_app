package com.trackrider.android.trackrider.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.trackrider.android.trackrider.R;

public class FriendRequestViewHolder extends RecyclerView.ViewHolder {

    public TextView mUserEmail;
    public ImageView mImgBtnAccept, mImgBtnDecline;

    public FriendRequestViewHolder(@NonNull View itemView) {
        super(itemView);
        mUserEmail = itemView.findViewById(R.id.tv_user_email);
        mImgBtnAccept = itemView.findViewById(R.id.iv_btn_accept);
        mImgBtnDecline = itemView.findViewById(R.id.iv_btn_decline);
    }
}
