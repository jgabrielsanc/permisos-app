package com.example.jsanchez.nombreaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonToGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView = findViewById(R.id.textViewMain);
        buttonToGo = findViewById(R.id.buttonToGo);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String greeting = bundle.getString("greeting");
            Toast.makeText(SecondActivity.this, greeting, Toast.LENGTH_LONG).show();
            textView.setText(greeting);
        }else {
            Toast.makeText(SecondActivity.this, "NOTHING", Toast.LENGTH_LONG).show();
        }

        buttonToGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGo = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intentGo);
            }
        });

    }
}
