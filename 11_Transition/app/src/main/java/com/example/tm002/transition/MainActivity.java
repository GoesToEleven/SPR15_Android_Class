package com.example.tm002.transition;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;


public class MainActivity extends ActionBarActivity {

    ViewGroup buckysLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buckysLayout = (ViewGroup) findViewById(R.id.buckysLayout);
        buckysLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        moveButton();
                        return true;
                    }
                }
        );

    }

    public void moveButton() {
        View buckysButton = findViewById(R.id.buckysButton);

        TransitionManager.beginDelayedTransition(buckysLayout);

//        RelativeLayout buckysLayout = (RelativeLayout) findViewById(R.id.buckysLayout);
        buckysLayout.setBackgroundColor(Color.GREEN);

        buckysButton.setBackgroundColor(Color.YELLOW);



        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        buckysButton.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = buckysButton.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        buckysButton.setLayoutParams(sizeRules);

    }

}
