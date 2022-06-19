package org.tensorflow.lite.uniosun.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import org.tensorflow.lite.examples.detection.R;
import org.tensorflow.lite.examples.detection.readActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Enter = findViewById(R.id.entButton);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);
        // Do something after 5s = 5000ms
        Intent intent = new Intent(MainActivity.this,readActivity.class);


        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                startActivity(intent);

            }
        });




    }

}
