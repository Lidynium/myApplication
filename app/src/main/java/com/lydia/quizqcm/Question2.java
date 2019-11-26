package com.lydia.quizqcm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Question2 extends AppCompatActivity implements View.OnClickListener {
    Button btn_Suiv;
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        btn_Suiv = (Button) FindViewById(R.id.btn_Suiv);
        rg = (RadioGroup) FindViewById(R.id.radio);
        btn_Suiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
