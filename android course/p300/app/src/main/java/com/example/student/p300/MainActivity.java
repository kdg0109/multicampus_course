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

    //Service로 부터 intent받는다
    @Override
    protected void onNewIntent(Intent intent) {
        processIntent(intent);
    }

    private void processIntent(Intent intent) {
        if(intent != null){
            String command = intent.getStringExtra("command");
            int cnt = intent.getIntExtra("cnt", 0);
            Toast.makeText(this, ""+command + " " + cnt, Toast.LENGTH_SHORT).show();
        }
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
