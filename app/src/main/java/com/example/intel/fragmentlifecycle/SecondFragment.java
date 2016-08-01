package com.example.intel.fragmentlifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("vabhi", "onAttach Second");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("vabhi", "onCreate Second");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("vabhi", "onCreateView Second");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("vabhi", "onStart Second");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("vabhi", "onResume Second");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e("vabhi", "onPause Second");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("vabhi", "onStop Second");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("vabhi", "onDetach Second");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("vabhi", "onDestroy Second");
    }

}
