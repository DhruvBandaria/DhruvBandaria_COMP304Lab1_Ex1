package com.example.dhruvbandaria_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.textView13);
        tv2=findViewById(R.id.textView14);
        tv3=findViewById(R.id.textView15);
        tv4=findViewById(R.id.textView16);
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