package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button click_button;
    private TextView show_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click_button = (Button)(findViewById(R.id.button1));
        show_text = (TextView)(findViewById(R.id.container));
        show_text . setText("0");
        click_button . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t = Integer.parseInt(show_text . getText() . toString());
                t ++;
                show_text . setText(t + "");


            }
        });


    }
}
