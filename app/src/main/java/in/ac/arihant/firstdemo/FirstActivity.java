package in.ac.arihant.firstdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {


    String TAG = "FirstDemo";


    int index = 1;

    TextView textView1;
    TextView textView2;


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "I'm in onCreate()");

        textView1 = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("You clicked me: " + index++ );
                textView2.setText("Im at second: " + (index * 2) );
            }
        });


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

    public void gotoSecondActivity(View view) {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
