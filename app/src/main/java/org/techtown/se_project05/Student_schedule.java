package org.techtown.se_project05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Student_schedule extends AppCompatActivity {

    private Spinner sch_year,sch_month,sch_day;
    private Button btn_schedule_check,btn_schedule_undo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_schedule);

        sch_year = (Spinner)findViewById(R.id.sch_year);
        sch_month = (Spinner)findViewById(R.id.sch_month);
        sch_day = (Spinner)findViewById(R.id.sch_day);


    }
}