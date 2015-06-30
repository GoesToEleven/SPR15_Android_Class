package com.example.tm002.intentexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Apples extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);

        Button submitButton = (Button) findViewById(R.id.submitButton);

        final Context c = this;

        submitButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {
                        Intent i = new Intent(c, Bacon.class);

                        final EditText nameText = (EditText) findViewById(R.id.nameText);
                        final EditText addressText = (EditText) findViewById(R.id.addressText);
                        final EditText cityText = (EditText) findViewById(R.id.cityText);
                        final EditText stateText = (EditText) findViewById(R.id.stateText);
                        final EditText zipText = (EditText) findViewById(R.id.zipText);

                        String name = nameText.getText().toString();
                        String address = addressText.getText().toString();
                        String city = cityText.getText().toString();
                        String state = stateText.getText().toString();
                        String zip = zipText.getText().toString();

                        i.putExtra("name", name);
                        i.putExtra("address", address);
                        i.putExtra("city", city);
                        i.putExtra("state", state);
                        i.putExtra("zip", zip);

                        startActivity(i);
                    }
                }
        );

    }
}
