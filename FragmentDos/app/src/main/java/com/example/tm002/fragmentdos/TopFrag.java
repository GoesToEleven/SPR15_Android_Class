package com.example.tm002.fragmentdos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TopFrag extends Fragment {

    private static EditText topTextInput;

    public interface TopSectionListener {
        public void createMeme(String top);
    }

    TopSectionListener activityCommander;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        topTextInput = (EditText) view.findViewById(R.id.topFragEditText);
        final Button button = (Button) view.findViewById(R.id.topFragButton);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View view) {
        activityCommander.createMeme(topTextInput.getText().toString());

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }
}
