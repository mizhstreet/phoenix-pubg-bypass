package com.mb.darkphoenix;

import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExecution {
    public Timer timer;
    public TimerTask timerTask;
    public Handler handler = new Handler();

    public void stopTimer(){
        if(timer != null){
            timer.cancel();
            timer.purge();
        }
    }

    public void startTimer(){
        timer = new Timer();
        timerTask = new TimerTask() {
            public void run() {
                handler.post(new Runnable() {
                    public void run(){
                        Command c = new Command();
                        c.execute();
                    }
                });
            }
        };
        timer.schedule(timerTask, 1000, 1000*60*5);
    }
}
