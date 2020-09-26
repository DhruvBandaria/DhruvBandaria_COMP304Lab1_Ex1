package com.example.dhruvbandaria_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ARActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_r);
        tv1=findViewById(R.id.textView3);
        tv2=findViewById(R.id.textView4);
        tv3=findViewById(R.id.textView5);
        tv4=findViewById(R.id.textView7);
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