package com.example.student.p300;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "MyService ========";

    public MyService() {
        Log.d(TAG, "Service MyService .....");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Service onCreate .....");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "Service onStartCommand .....");
        if(intent == null){
            return Service.START_STICKY;
        }else{
            processCommand(intent);
        }
        return super.onStartCommand(intent, flags, startId);
    }

    private void processCommand(Intent intent) {
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");
        Log.d(TAG, "Service processCommand ....." +
                command +
                name);


        final Intent sintent = new Intent(getApplicationContext(), MainActivity.class);

        //FLAG_ACTIVITY_SINGLE_TOP과 FLAG_ACTIVITY_CLEAR_TOP를 사용해야 이미 떠있는 MainActivity 사용
        sintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                    Intent.FLAG_ACTIVITY_SINGLE_TOP |
                    Intent.FLAG_ACTIVITY_CLEAR_TOP);


        Runnable run = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    Log.d(TAG, "Process: " + i);
                    sintent.putExtra("command", "cmd");
                    sintent.putExtra("cnt", i);
                    startActivity(sintent);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Service onDestroy .....");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}