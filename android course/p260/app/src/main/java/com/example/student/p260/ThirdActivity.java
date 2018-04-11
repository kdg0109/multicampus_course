package com.example.student.p260;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView textView3;
    int num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView3 = findViewById(R.id.textView3);

        Intent intent = getIntent();
        num1 = intent.getIntExtra("num1", 0);
        textView3.setText(num1+"");

        resultMethod();
    }
    public void resultMethod(){
        int result = num1 * 2000;
        Intent intent = new Intent();
        intent.putExtra("result", result);
        setResult(RESULT_OK, intent);
        finish();
    }
}
