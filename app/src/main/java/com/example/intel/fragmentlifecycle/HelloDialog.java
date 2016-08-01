package com.example.intel.fragmentlifecycle;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloDialog extends DialogFragment {

    TextView textView;

    public HelloDialog() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("vabhi", "onAttach Dialog");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("vabhi", "onCreate Dialog");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("vabhi","onCreateView Dialog");
        View view = inflater.inflate(R.layout.fragment_hello_dialog, container, false);
        textView = (TextView) view.findViewById(R.id.textViewHello);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Log.i("vabhi","onCreateDialog Dialog");

        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("vabhi", "onStart Dialog");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("vabhi", "onResume Dialog");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.i("vabhi", "onPause Dialog");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("vabhi", "onStop Dialog");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("vabhi", "onDetach Dialog");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("vabhi", "onDestroy Dialog");
    }


}
