package com.example.blue;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameInput = findViewById(R.id.nameInput);
        final Button button = (Button) findViewById(R.id.go);
        final TextView textView = (TextView) findViewById(R.id.hello);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                textView.setText("Hello " + name +"😁");
            }
        });
    }
}
