package com.example.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private TextView nameText;
    private EditText enterName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.button);
        nameText = findViewById(R.id.textView);
        enterName = findViewById(R.id.editTextName);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String name = enterName.getText().toString();
                if (name.isEmpty()){
                    nameText.setText("Hello Empty namer!");
                }else{
                    nameText.setText("Hello , "+name + "!");
                }

            }
        });
    }
}