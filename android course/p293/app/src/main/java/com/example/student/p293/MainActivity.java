package com.example.student.p293;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Date;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
//        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        restoreState();
    }

    private void restoreState() {
        sp = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if(sp != null){
            if(sp.contains("cnt")){
                int rcnt = sp.getInt("cnt", 0);
                Toast.makeText(this, rcnt + "", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void saveState() {
        SharedPreferences.Editor editor = sp.edit();

        if(sp != null){
            if(sp.contains("cnt")){
                int rcnt = sp.getInt("cnt", 0);
                editor.putInt("cnt", ++rcnt);
                editor.commit();
            }else{
                int cnt = 0;
                editor.putInt("cnt", ++cnt);
                editor.commit();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
 //       Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        saveState();
    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

       // Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Message !!");
        builder.setMessage("Are you want to exit & clear");
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                SharedPreferences.Editor editor = sp.edit();
                editor.clear();
                editor.commit();
                finish();
            }
        });
        builder.show();
    }
}
