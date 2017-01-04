package com.example.ngoc.uiwidget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    private Button b;
    private TextView textView;
    private RadioGroup rg1;
    private RadioGroup rg2;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private RadioButton rb6;
    private ImageButton ib1;
    private ImageButton ib2;
    private ToggleButton tb1;
    private ToggleButton tb2;
    private ToggleButton tb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        textView =(TextView) findViewById(R.id.textView);
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
        rb6 = (RadioButton) findViewById(R.id.radioButton6);
        ib1 = (ImageButton) findViewById(R.id.imageButton1);
        ib2 = (ImageButton) findViewById(R.id.imageButton2);
        tb1 = (ToggleButton) findViewById(R.id.toggleButton1);
        tb2 = (ToggleButton) findViewById(R.id.toggleButton2);
        tb3 = (ToggleButton) findViewById(R.id.toggleButton3);
        rg1 = (RadioGroup) findViewById(R.id.RadioGroup1);
        rg2 = (RadioGroup) findViewById(R.id.RadioGroup2);
        ib1.setOnClickListener(new onclick1());
        rb1.setOnClickListener(new onclick21());
        ib2.setOnClickListener(new onclick3());
        rb2.setOnClickListener(new onclick22());
        rb3.setOnClickListener(new onclick23());
        rb4.setOnClickListener(new onclick31());
        rb5.setOnClickListener(new onclick32());
        rb6.setOnClickListener(new onclick33());
        b.setOnClickListener(new onclick());
        tb1.setOnClickListener(new onclicktb1());
        tb2.setOnClickListener(new onclicktb2());
        tb3.setOnClickListener(new onclicktb3());
    }

    private class onclick1 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
            rg2.clearCheck();
            textView.setBackgroundColor(Color.RED);
        }

    }

    private class onclick3 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
            rg2.clearCheck();
            textView.setBackgroundColor(Color.BLUE);
        }

    }

    private class onclick21 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg2.clearCheck();
            textView.setBackgroundColor(Color.RED);
        }

    }

    private class onclick22 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg2.clearCheck();
            textView.setBackgroundColor(Color.YELLOW);
        }

    }

    private class onclick23 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg2.clearCheck();
            textView.setBackgroundColor(Color.BLUE);
        }

    }

    private class onclick31 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
        }

    }
    private class onclick32 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
        }

    }
    private class onclick33 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
        }
    }
    private class onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int idChecked = rg2.getCheckedRadioButtonId();
            switch (idChecked) {
                case R.id.radioButton4:
                    textView.setBackgroundColor(Color.RED);
                    break;
                case R.id.radioButton5:
                    textView.setBackgroundColor(Color.YELLOW);
                    break;
                case R.id.radioButton6:
                    textView.setBackgroundColor(Color.BLUE);
                    break;
                default:
                    textView.setBackgroundColor(Color.WHITE);
            }
        }
    }
    private class onclicktb1 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
            rg2.clearCheck();
            if(tb1.isChecked()==(true)) {
                textView.setBackgroundColor(Color.RED);
            }else textView.setBackgroundColor(Color.BLACK);
        }

    }private class onclicktb2 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
            rg2.clearCheck();
            if(tb2.isChecked()==(true)) {
                textView.setBackgroundColor(Color.YELLOW);
            }else textView.setBackgroundColor(Color.BLACK);
        }

    }private class onclicktb3 implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rg1.clearCheck();
            rg2.clearCheck();
            if(tb3.isChecked()==(true)) {
                textView.setBackgroundColor(Color.BLUE);
            }else textView.setBackgroundColor(Color.BLACK);
        }

    }
}







