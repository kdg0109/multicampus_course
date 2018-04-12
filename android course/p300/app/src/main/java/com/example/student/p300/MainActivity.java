package com.example.student.p300;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    public void clickBt(View v) {
        String name = editText.getText().toString();
        Toast.makeText(this, name + "", Toast.LENGTH_SHORT).show();
        intent = new Intent(this, MyService.class);
        intent.putExtra("command", "start");
        intent.putExtra("name", name);
        startService(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(intent != null) {
            stopService(intent);
        }
    }
}
