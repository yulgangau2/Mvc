package com.example.kai.mvc.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kai.mvc.R;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class FragmentMainSecond extends Fragment {
    TextView tvhello;
    String value;
    public FragmentMainSecond() {
        super();
    }

    public static FragmentMainSecond newInstance() {
        FragmentMainSecond fragment = new FragmentMainSecond();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_2_main, container, false);
        initInstances(rootView);
        return rootView;
    }

    private void initInstances(View rootView) {
       // String value;
        // Init 'View' instance(s) with rootView.findViewById here

        value = getActivity().getIntent().getStringExtra("x");







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
}
