package com.example.tm002.fragmentdos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity implements TopFrag.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top) {
        BottomFrag bottomFrag = (BottomFrag) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomFrag.setMemeText(top);
    }
}
