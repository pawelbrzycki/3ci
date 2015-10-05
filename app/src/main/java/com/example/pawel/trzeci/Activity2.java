package com.example.pawel.trzeci;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;


public class Activity2 extends ActionBarActivity {
    private static Button buttonSbm;
    private static DigitalClock digital;
    private static AnalogClock analog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        OnButtonClickListener();

    }

   public void OnButtonClickListener()
        {
            buttonSbm = (Button)findViewById(R.id.button2);
            digital = (DigitalClock)findViewById(R.id.digitalClock);
            analog = (AnalogClock)findViewById(R.id.analogClock);

            buttonSbm.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View v){
                            if(digital.getVisibility() == DigitalClock.GONE){
                                digital.setVisibility(DigitalClock.VISIBLE);
                                analog.setVisibility(AnalogClock.GONE);
                            } else {
                                digital.setVisibility(DigitalClock.GONE);
                                analog.setVisibility(AnalogClock.VISIBLE);
                            }

                        }
                    }
            );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
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


