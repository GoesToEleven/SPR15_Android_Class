package com.example.tm002.intentexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Bacon extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle baconData = getIntent().getExtras();
        if (baconData == null) return;

        String name = baconData.getString("name");
        String address = baconData.getString("address");
        String city = baconData.getString("city");
        String state = baconData.getString("state");
        String zip = baconData.getString("zip");

        final TextView nameView = (TextView)findViewById(R.id.nameView);
        final TextView addressView = (TextView)findViewById(R.id.addressView);
        final TextView cityView = (TextView)findViewById(R.id.cityView);
        final TextView stateView = (TextView)findViewById(R.id.stateView);
        final TextView zipView = (TextView)findViewById(R.id.zipView);

        nameView.setText(name);
        addressView.setText(address);
        cityView.setText(city);
        stateView.setText(state);
        zipView.setText(zip);
        
    }

}
