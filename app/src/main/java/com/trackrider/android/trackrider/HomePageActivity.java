package com.trackrider.android.trackrider;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class HomePageActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    private GoogleSignInClient mGoogleSignInClient;
    CardView mCreateRoom, mShowRoom, mFriends, mHistory, mShowRequest, mShowPeople;

    //inflate menu bar with menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tr_activity_home_page);

        mGoogleSignInClient = GoogleSignIn.getClient(this, GoogleSignInOptions.DEFAULT_SIGN_IN);

        mCreateRoom = findViewById(R.id.cv_create_room);
        mShowRoom = findViewById(R.id.cv_show_room);
        mHistory = findViewById(R.id.cv_history);
        mShowPeople = findViewById(R.id.cv_show_people);
        mShowRequest = findViewById(R.id.cv_show_request);
        mFriends = findViewById(R.id.cv_friends);
//        mAuthListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                Toast.makeText(getApplicationContext(), "Auth listener initiated", Toast.LENGTH_LONG).show();
//                if (firebaseAuth.getCurrentUser() == null){
//                    startActivity(new Intent(HomePageActivity.this, ChooseLoginType.class));
//                    finish();
//                }
//            }
//        };


        mCreateRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this, "Feature Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });
        mShowRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this, "Feature Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });
        mHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePageActivity.this, "Feature Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });
        mShowPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, AllPeopleActivity.class));
            }
        });
        mShowRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, FriendRequestActivity.class));
            }
        });
        mFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePageActivity.this, FriendListActivity.class));
            }
        });
    }

    //clicklistener on menus
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.logout:
                logout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Logs user out of app
    private void logout() {
        mAuth = FirebaseAuth.getInstance();
        mAuth.signOut();
        signOut();
        revokeAccess();
    }

    private void updateUi() {
        startActivity(new Intent(HomePageActivity.this, ChooseLoginType2Activity.class));
        Toast.makeText(getApplicationContext(), "User logout successful", Toast.LENGTH_LONG).show();
        finish();
    }


    //clears which account is connected to the app. To sign in again, the user must choose their account again.
    private void signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        // ...
                    }
                });
    }

    //provide users that signed in with Google the ability to disconnect their Google account from app.
    //If the user deletes their account, it deletes the information that app obtained from the Google APIs.
    private void revokeAccess() {
        mGoogleSignInClient.revokeAccess()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        updateUi();
                    }
                });
    }
}
