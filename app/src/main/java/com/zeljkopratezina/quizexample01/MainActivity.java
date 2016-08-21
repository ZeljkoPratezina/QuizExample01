package com.zeljkopratezina.quizexample01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1996 (View view){
        Toast.makeText(this, "Wrong, try again!", Toast.LENGTH_SHORT ).show();
    }
    public void onClick1998 (View view){
        Toast.makeText(this, "Correct, well done!", Toast.LENGTH_SHORT ).show();
    }
    public void onClick2000 (View view){
        Toast.makeText(this, "Wrong, try again!", Toast.LENGTH_SHORT ).show();
    }
    public void onClick2002 (View view){
        Toast.makeText(this, "Wrong, try again!", Toast.LENGTH_SHORT ).show();
    }

}
