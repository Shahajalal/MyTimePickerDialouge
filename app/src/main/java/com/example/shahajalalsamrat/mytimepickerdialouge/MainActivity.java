package com.example.shahajalalsamrat.mytimepickerdialouge;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    TextView textview;
    TimePickerDialog timepickerdialoug;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.buttonid);
        textview= (TextView) findViewById(R.id.textid);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TimePicker timepicker =new TimePicker(this);
        int currentminute=timepicker.getCurrentMinute();
        int currenthour=timepicker.getCurrentHour();

        timepickerdialoug=new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener(){

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textview.setText(hourOfDay+":"+ minute);
                    }
                },currenthour,currentminute,true);
        timepickerdialoug.show();
    }
}
