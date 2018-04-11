package com.example.student.p253;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout container;
    LinearLayout container2;
    LinearLayout container3;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeui();
    }

    private void makeui() {
        container = findViewById(R.id.container);
        inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    public void clickBt(View v){
        View v1 = inflater.inflate(R.layout.sub, container, true);

        container2 = v1.findViewById(R.id.container2);
        container3 = v1.findViewById(R.id.container3);

        View v2 = inflater.inflate(R.layout.sub2, container2, true);
        View v3 = inflater.inflate(R.layout.sub3, container3, true);

        TextView stv = v1.findViewById(R.id.stv);
        stv.setText("Button Click");
        Button sbt1 = v1.findViewById(R.id.sbt1);
        Button sbt2 = v1.findViewById(R.id.sbt2);
        sbt1.setText("Sub Button 1");
        sbt2.setText("Sub Button 2");

        sbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sub2로 변경", Toast.LENGTH_SHORT).show();
                container2.setVisibility(View.VISIBLE);
                container3.setVisibility(View.INVISIBLE);
            }
        });
        sbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sub3로 변경", Toast.LENGTH_SHORT).show();
                container2.setVisibility(View.INVISIBLE);
                container3.setVisibility(View.VISIBLE);
            }
        });
    }
}
