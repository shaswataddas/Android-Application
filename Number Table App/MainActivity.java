package com.example.timetableapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mylist;

    public final void generate(int timetableNumber){
        ArrayList<String> content = new ArrayList<String>();
        for (int j=1;j<=100;j++){
            content.add(timetableNumber+" * "+j+" = "+Integer.toString(j*timetableNumber));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,content);
        mylist.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SeekBar seekBar = findViewById(R.id.seekBar);
        mylist = findViewById(R.id.mylistview);

        seekBar.setMax(20);
        seekBar.setProgress(10);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                int timetableNumber;
                if (progress<min){
                    timetableNumber = min;
                    seekBar.setProgress(min);
                }
                else{
                    timetableNumber = progress;
                }
                Log.i("current pos",Integer.toString(timetableNumber));

                generate(timetableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}