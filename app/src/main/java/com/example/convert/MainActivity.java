package com.example.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText mm,in;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        mm=(EditText) findViewById(R.id.millimeters);
        in=(EditText) findViewById(R.id.centimeters);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmitButton();
            }
        });
    }
    private void onSubmitButton() {
        if (mm.getText().toString().isEmpty()){
            double cent=Double.valueOf(in.getText().toString());
            double answer1=(cent/25.4);
            mm.setText(String.valueOf(answer1));
        }else if(in.getText().toString().isEmpty()){
            double mil=Double.valueOf(mm.getText().toString());
            double answer1=mil*25.4;
            in.setText("");
            in.setText(String.valueOf(answer1));
        }
    }
}
