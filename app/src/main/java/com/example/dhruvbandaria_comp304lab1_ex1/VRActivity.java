package com.example.dhruvbandaria_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);
        tv1=findViewById(R.id.textView9);
        tv2=findViewById(R.id.textView10);
        tv3=findViewById(R.id.textView11);
        tv4=findViewById(R.id.textView12);
        tv1.setText(R.string.on_create);
    }

    @Override
    protected void onStart() {
        super.onStart();
        tv2.setText(R.string.on_start);
    }

    @Override
    protected void onStop() {
        super.onStop();
        tv3.setText(R.string.on_stop);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv4.setText(R.string.on_destroy);
    }
}