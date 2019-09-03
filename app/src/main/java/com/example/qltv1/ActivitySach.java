package com.example.qltv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySach extends AppCompatActivity {
    Button btnThoatSach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sach);
        btnThoatSach = (Button) findViewById(R.id.btnThoatSach2);
        btnThoatSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySach.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
