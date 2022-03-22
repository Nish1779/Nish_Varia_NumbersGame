package com.example.nish_varia_numbersgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   //button reset,button1,button2,button3,utton1button1button1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btntap(android.view.View view){
        Log.i("Button","Button Clicked");
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Log.i("Button","Button is :" + buttonText);
        int cno = Integer.parseInt(buttonText);
        if(cno < 5)
        { cno = cno + 1;
        }
        else if(cno > 5)
        { cno = cno - 1;
        }
        else
        { cno = cno;
        }
        button.setText(Integer.toString(cno));
    }
    public void resetbtn(android.view.View v1)
    {
        // fetching the btns
        Button btn1 = (Button) findViewById(R.id.button4);
        Button btn2 = (Button) findViewById(R.id.button9);
        Button btn3 = (Button) findViewById(R.id.button6);
        Button btn4 = (Button) findViewById(R.id.button7);
        Button btn5 = (Button) findViewById(R.id.button8);
        Button btn6 = (Button) findViewById(R.id.button9);
        Button btn7 = (Button) findViewById(R.id.button10);
        Button btn8 = (Button) findViewById(R.id.button11);
        Button btn9 = (Button) findViewById(R.id.button3);
        // to reset value
        btn1.setText("2");
        btn2.setText("0");
        btn3.setText("0");
        btn4.setText("5");
        btn5.setText("0");
        btn6.setText("4");
        btn7.setText("2");
        btn8.setText("6");
        btn9.setText("6");
    }
}