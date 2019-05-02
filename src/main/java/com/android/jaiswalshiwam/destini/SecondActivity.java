package com.android.jaiswalshiwam.destini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView end;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        int kath=intent.getIntExtra("KEY",0);
        end=findViewById(R.id.end);
        end.setText(kath);



    }
}
