package com.example.toddmcleod.memecreator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by toddmcleod on 2/18/15.
 */

public class BottomPictureFragment extends Fragment {

    private static TextView topMemeText;
    private static TextView bottomMemeText;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeText = (TextView) view.findViewById(R.id.topMemeText);
        bottomMemeText = (TextView) view.findViewById(R.id.bottomMemeText);
        return view;
    }

    public void setMemeText(String top, String bottom) {
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }
}
