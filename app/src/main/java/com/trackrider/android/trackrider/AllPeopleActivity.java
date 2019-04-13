package com.trackrider.android.trackrider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.mancj.materialsearchbar.MaterialSearchBar;
import com.trackrider.android.trackrider.Interface.IFirebaseLoadDone;
import com.trackrider.android.trackrider.ViewHolder.UserViewHolder;
import com.trackrider.android.trackrider.utils.User;

import java.util.ArrayList;
import java.util.List;

public class AllPeopleActivity extends AppCompatActivity {

    FirebaseRecyclerAdapter<User, UserViewHolder> adapter, searchAdapter;
    RecyclerView recycler_all_user;
    IFirebaseLoadDone firebaseLoadDone;


    MaterialSearchBar mSearchBar;
    List<String> mSuggestList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tr_all_people);

        //Init view
        mSearchBar = findViewById(R.id.sv_material_search_all_people);
        //MaterialSearchBar function
        mSearchBar.setCardViewElevation(10);
        mSearchBar.addTextChangeListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                List<String> suggest = new ArrayList<>();
                for (String search:mSuggestList){
                    if (search.toLowerCase().contains(mSearchBar.getText().toLowerCase())){
                        suggest.add(search);
                    }
                }
                mSearchBar.setLastSuggestions(suggest);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        mSearchBar.setOnSearchActionListener(new MaterialSearchBar.OnSearchActionListener() {
            @Override
            public void onSearchStateChanged(boolean enabled) {
                
            }

            @Override
            public void onSearchConfirmed(CharSequence text) {

            }

            @Override
            public void onButtonClicked(int buttonCode) {

            }
        });


    }
}
