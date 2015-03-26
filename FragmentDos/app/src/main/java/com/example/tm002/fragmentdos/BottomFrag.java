package com.example.tm002.fragmentdos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.w3c.dom.Text;


public class BottomFrag extends Fragment {

    private static TextView bottomFragTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        bottomFragTextView = (TextView) view.findViewById(R.id.bottomFragTextView);
        return view;
    }

    public void setMemeText(String top) {
            bottomFragTextView.setText(top);
    }

}
