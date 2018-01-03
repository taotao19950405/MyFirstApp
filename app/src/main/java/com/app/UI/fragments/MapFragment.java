package com.app.UI.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myfristapp.R;


public class MapFragment extends Fragment implements View.OnClickListener {
    OnTextSelectedListener mCallback;
    View view;
    public interface OnTextSelectedListener {
        public void onMapTextSelected();
    }

    public void replaceMap(){
        mCallback.onMapTextSelected();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        TextView textView = (TextView) view.findViewById(R.id.mapText);
        textView.setOnClickListener(this);
        return view;
        }




    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.mapText:
                // code for button when user clicks buttonOne.
                replaceMap();
                break;

            default:
                break;
        }


    }
        @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try {
        mCallback = (OnTextSelectedListener) activity;
    } catch (ClassCastException e) {
        throw new ClassCastException(activity.toString()
                + " must implement OnHeadlineSelectedListener");
    }
}

}




