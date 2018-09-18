package com.fs.library;

import android.util.Log;

public class HelloUtil {

    public static final String TAG = HelloUtil.class.getSimpleName();

    public static void sayHello() {
        Log.d(TAG, "Hello from fs library");
    }
}
