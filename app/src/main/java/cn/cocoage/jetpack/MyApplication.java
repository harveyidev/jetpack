package cn.cocoage.jetpack;

import android.app.Application;
import android.util.Log;

import androidx.lifecycle.ProcessLifecycleOwner;

public class MyApplication extends Application {

    private static final String TAG = "Log";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"---MyApplication---onCreate---");
        ProcessLifecycleOwner.get().getLifecycle()
                .addObserver(new ApplicationObserver());
    }
}
