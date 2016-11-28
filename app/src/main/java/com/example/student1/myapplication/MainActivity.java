package com.example.student1.myapplication;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String answer=R.string.answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("asfast", String.valueOf(R.string.app_name));
        Log.e("and", "Hello world");
        Button btn= (Button)findViewById(R.id.bt1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("button is pressed", "onClick: ");
                Toast.makeText(MainActivity.this, R.string.tost, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
