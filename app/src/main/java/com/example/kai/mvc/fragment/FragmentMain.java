package com.example.kai.mvc.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kai.mvc.R;
import com.example.kai.mvc.activity.SecondActivity;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class FragmentMain extends Fragment implements View.OnClickListener {
    Button btnlogin;
    Editable x;
    EditText username;

    public FragmentMain() {
        super();
    }

    public static FragmentMain newInstance() {
        FragmentMain fragment = new FragmentMain();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
        // Init 'View' instance(s) with rootView.findViewById here
        btnlogin = (Button) rootView.findViewById(R.id.BtnLogin);
        username = (EditText) rootView.findViewById(R.id.EditTextUserName);
        x = username.getText();

    btnlogin.setOnClickListener(this);

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore Instance State here
        }
    }


    @Override
    public void onClick(View view) {
        if (view == btnlogin) {

           Intent intent = new Intent(getContext(),SecondActivity.class);

            intent.putExtra("x", x+" ");
            Toast.makeText(getContext(), " "+ x, Toast.LENGTH_SHORT).show();
            getActivity().finish();
            startActivity(intent);


        }
    }
}
