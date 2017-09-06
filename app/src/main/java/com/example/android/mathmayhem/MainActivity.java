package com.example.android.mathmayhem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*This method is used to start the quiz.
     */
    public void openQuiz(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }

    /*This method is used to view rules.
     */
    public void openRules(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }
}
