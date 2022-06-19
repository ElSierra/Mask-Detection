package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import org.tensorflow.lite.uniosun.detection.DetectorActivity;
import org.tensorflow.lite.uniosun.detection.MainActivity;

public class readActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        TextView textView = findViewById(R.id.textView);
        Intent intent = new Intent(readActivity.this, DetectorActivity.class);



        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setText("Getting Ready Blazeface Framework");

            }
        }, 1000);
        final Handler zandler = new Handler();
        zandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);

            }
        }, 5000);

    }

}