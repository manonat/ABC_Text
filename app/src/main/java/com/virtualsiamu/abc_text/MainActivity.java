package com.virtualsiamu.abc_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textView;
    private Button btnA, btnB, btnC, btnD, btnE;
    private TextView textView2;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitialWidget ();
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);


    }

    private void intitialWidget() {
        textView2 = (TextView) findViewById(R.id.textView2);
        btnA = (Button) findViewById(R.id.btnA);
        btnB = (Button) findViewById(R.id.btnB);
        btnC = (Button) findViewById(R.id.btnC);
        btnD = (Button) findViewById(R.id.btnD);
        btnE = (Button) findViewById(R.id.btnE);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnA:
                textView2.setText(MainActivity.this.getString(R.string.a));
                break;

            case R.id.btnB:
                textView2.setText(MainActivity.this.getString(R.string.b));
                break;

            case R.id.btnC:
                textView2.setText(MainActivity.this.getString(R.string.c));
                break;

            case R.id.btnD:
                textView2.setText(MainActivity.this.getString(R.string.d));
                break;

            case R.id.btnE:
                textView2.setText(MainActivity.this.getString(R.string.e));
                break;





        }
    }
}
