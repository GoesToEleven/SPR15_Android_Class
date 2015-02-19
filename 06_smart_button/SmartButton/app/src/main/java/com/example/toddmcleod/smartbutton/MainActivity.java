package com.example.toddmcleod.smartbutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buckysButton = (Button)findViewById(R.id.buckysButton);
        Button toddsButton = (Button)findViewById(R.id.toddsButton);

        buckysButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView buckysText = (TextView)findViewById(R.id.buckysText);
                        buckysText.setText("Good Job");
                    }
                }
        );

        toddsButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView buckysText = (TextView)findViewById(R.id.buckysText);
                        buckysText.setText("Todos Mas!!!");
                    }
                }
        );

        buckysButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v) {
                        TextView buckysText = (TextView)findViewById(R.id.buckysText);
                        buckysText.setText("That was a long click.");
                        return false;
                    }
                }
        );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
