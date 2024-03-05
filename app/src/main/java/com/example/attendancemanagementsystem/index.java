package com.example.attendancemanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Button addfacultyBTN = findViewById(R.id.addfacultyBTN);
        addfacultyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickAddFacultyBTN(v);
            }
        });

        Button addStudentBTN = findViewById(R.id.addStudentBTN);
        addStudentBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickAddStudentBTN(v);
            }
        });
    }
    public void onClickAddFacultyBTN(View v){
        Intent intent = new Intent(this, addFaculty.class);
        startActivity(intent);
    }
    public void onClickAddStudentBTN(View v){
        Intent intent = new Intent(this, addStudent.class );
        startActivity(intent);
    }
}