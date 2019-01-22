package com.example.user.foodfix_12.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

public class RestoratorExitActivity extends AppCompatActivity {
    private TextView textView;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoratorexit);

        textView = findViewById(R.id.textView);

        btnExit = findViewById(R.id.btnLogin);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RestoratorExitActivity.this, RestMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
