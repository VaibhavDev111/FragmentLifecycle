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
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("vabhi", "onAttach First");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("vabhi", "onCreate First");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.i("vabhi","onCreateView First");

        return inflater.inflate(R.layout.fragment_first, container, false);
    }



    @Override
    public void onStart() {
        super.onStart();
        Log.i("vabhi", "onStart First");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("vabhi", "onResume First");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.i("vabhi", "onPause First");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("vabhi", "onStop First");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("vabhi", "onDetach First");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("vabhi", "onDestroy First");
    }


}
