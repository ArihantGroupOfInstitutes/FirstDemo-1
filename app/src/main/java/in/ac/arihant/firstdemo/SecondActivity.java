package in.ac.arihant.firstdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private String TAG = "SecondDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG, "I'm in onCreate()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "I'm in onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "I'm in onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "I'm in onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "I'm in onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "I'm in onStop()");
    }


    @Override
    protected void onDestroy() {
        Log.e(TAG, "I'm in onDestroy()");
        super.onDestroy();
    }
}
