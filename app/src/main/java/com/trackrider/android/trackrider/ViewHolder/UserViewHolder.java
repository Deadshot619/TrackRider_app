package com.trackrider.android.trackrider.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.trackrider.android.trackrider.Interface.IRecyclerItemClickListener;
import com.trackrider.android.trackrider.R;

public class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView mUserEmail;
    public ImageView mMoreBtn;
    IRecyclerItemClickListener iRecyclerItemClickListener;

    public void setiRecyclerItemClickListener(IRecyclerItemClickListener iRecyclerItemClickListener) {
        this.iRecyclerItemClickListener = iRecyclerItemClickListener;
    }

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        mUserEmail = itemView.findViewById(R.id.tv_user_email);
        mMoreBtn = itemView.findViewById(R.id.iv_btn_more);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        iRecyclerItemClickListener.onItemClickListener(view, getAdapterPosition());
    }
}
