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
    }
    public void onClickAddFacultyBTN(View v){
        Intent intent = new Intent(this, addFaculty.class);
        startActivity(intent);
    }
}