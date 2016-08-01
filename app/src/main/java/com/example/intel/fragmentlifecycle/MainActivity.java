package com.example.intel.fragmentlifecycle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addFirst,addSecond,removeFirst,removeSecond,attach,detach,replaceWithFirst,replaceWithSecond,popUpDialog;
    FragmentTransaction transaction;
    FirstFragment firstFragment;
    SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init views
        addFirst = (Button) findViewById(R.id.addfirst);
        addSecond = (Button) findViewById(R.id.addsecond);
        removeFirst = (Button) findViewById(R.id.removeFirst);
        removeSecond =  (Button) findViewById(R.id.removeSecond);
        attach = (Button) findViewById(R.id.attach);
        detach = (Button) findViewById(R.id.detach);
        replaceWithFirst = (Button) findViewById(R.id.replacewithfirst);
        replaceWithSecond = (Button) findViewById(R.id.replacewithsecond);
        popUpDialog = (Button) findViewById(R.id.popupdialog);

        addFirst.setOnClickListener(this);
        addSecond.setOnClickListener(this);
        removeFirst.setOnClickListener(this);
        removeSecond.setOnClickListener(this);
        attach.setOnClickListener(this);
        detach.setOnClickListener(this);
        replaceWithFirst.setOnClickListener(this);
        replaceWithSecond.setOnClickListener(this);
        popUpDialog.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("vabhi", "onStart Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("vabhi", "onResume Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("vabhi", "onPause Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("vabhi", "onStop Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("vabhi", "onDestroy Actity");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.addfirst:
              transaction = getSupportFragmentManager().beginTransaction();
                firstFragment = new FirstFragment();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.add(R.id.fragmentFrame, firstFragment);
                //transaction.addToBackStack("firstAdded");
                transaction.commit();
                break;

            case R.id.addsecond:
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                secondFragment = new SecondFragment();
                transaction.add(R.id.fragmentFrame,secondFragment);
                transaction.commit();
                break;

            case R.id.removeFirst:
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.remove(firstFragment);
                transaction.commit();
                break;
            case R.id.removeSecond:
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.remove(secondFragment);
                transaction.commit();
                break;
            case R.id.attach:
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.attach(firstFragment);
                transaction.commit();
                break;
            case R.id.detach:
                transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.detach(firstFragment);
                transaction.commit();

                break;
            case R.id.replacewithfirst:
              transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.replace(R.id.fragmentFrame,secondFragment);
                transaction.commit();
                break;
            case R.id.replacewithsecond:
               transaction = getSupportFragmentManager().beginTransaction();
                transaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                transaction.replace(R.id.fragmentFrame,firstFragment);
                transaction.commit();
                break;

            case R.id.popupdialog:
                HelloDialog helloDialog = new HelloDialog();
                helloDialog.show(getSupportFragmentManager(),"dialog");
                break;

        }
    }

}
