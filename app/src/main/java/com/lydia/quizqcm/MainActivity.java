package com.lydia.quizqcm;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_Suiv;
    RadioGroup rg;
    RadioButton rb;
    int Score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Suiv = (Button) FindViewById(R.id.btn_Suiv);
        rg = (RadioGroup) FindViewById(R.id.radio);
        btn_Suiv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Switch (v.getId())
        {
            case R.id.btn_Suiv ;
                int id = rg.getCheckedRadioButtonId();
                rb = (radioButton) findViewById(id);
                if (rb.getText().toString().equals("3"))
            {
                Score =1;
            }
                intent i = new intent(this,Question2.class);
                i.putExtra("acore",Score);
                startActivity(i);




        }

    }
}
