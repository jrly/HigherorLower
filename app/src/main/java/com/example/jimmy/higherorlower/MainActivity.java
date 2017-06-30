package com.example.jimmy.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnum;

    public void clickFunction(View view) {

        EditText userinput1 = (EditText) findViewById(R.id.input);

        String userinput2 = userinput1.getText().toString();

        int userinput3 = Integer.parseInt(userinput2);

        if (userinput3 == randomnum){
            Toast.makeText(getApplicationContext(),"Winner!",Toast.LENGTH_LONG).show();
        }
        else if (userinput3 > randomnum){
            Toast.makeText(getApplicationContext(),"Lower!",Toast.LENGTH_LONG).show();
        }
        else if (userinput3 < randomnum ){
            Toast.makeText(getApplicationContext(),"Higher!",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_LONG).show();
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random createrandom = new Random();
        randomnum = createrandom.nextInt(21);

    }
}
