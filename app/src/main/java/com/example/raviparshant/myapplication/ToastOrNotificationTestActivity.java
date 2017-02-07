package com.example.raviparshant.myapplication;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.raviparshant.myapplication.MyAccessibilityService.Constants;

public class ToastOrNotificationTestActivity extends Activity {

    private static final String TAG = "ToastOrNotificationTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // verifyStoragePermissions(this);
        final IntentFilter mIntentFilter = new IntentFilter(Constants.ACTION_CATCH_NOTIFICATION);
        mIntentFilter.addAction(Constants.ACTION_CATCH_TOAST);
        registerReceiver(toastOrNotificationCatcherReceiver, mIntentFilter);
         //Log.v(TAG, "r.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(toastOrNotificationCatcherReceiver);
    }


   /* private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    //persmission method.
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have read or write permission
        int writePermission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int readPermission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (writePermission != PackageManager.PERMISSION_GRANTED || readPermission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }
*/
    private final BroadcastReceiver toastOrNotificationCatcherReceiver = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {
           /* Log.v(TAG, "Received message");
            Log.v(TAG, "intent.getAction() :: " + intent.getAction());
            Log.v(TAG, "intent.getStringExtra(Constants.EXTRA_PACKAGE) :: " + intent.getStringExtra(Constants.EXTRA_PACKAGE));
            Log.v(TAG, "intent.getStringExtra(Constants.EXTRA_MESSAGE) :: " + intent.getStringExtra(Constants.EXTRA_MESSAGE));*/
        }
    };
}
