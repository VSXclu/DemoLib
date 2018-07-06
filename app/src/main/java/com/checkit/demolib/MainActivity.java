package com.checkit.demolib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.checkit.dlib.AddOp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int val_1 = 2;
        int val_2 = 10;

        Log.e("added value : ", "val_1 is : "+val_1+", val_2 is : "+val_2+", And Added result is : "+ new AddOp().addOperation(val_1, val_2));
    }
}
