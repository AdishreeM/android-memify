package com.adishree.mazapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText topText;
    private EditText bottomText;
    private Button button;
    private TextView t1;
    private TextView t2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topText = (EditText) findViewById(R.id.TopText);
        bottomText = (EditText) findViewById(R.id.BottomText);
        button = (Button) findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView3);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        t1.setText(topText.getText().toString());
                        t2.setText(bottomText.getText().toString());
                    }
                }
        );
    }

}
