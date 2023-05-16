package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView data;
    Button btn;

    Ticket ticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();

        data = findViewById(R.id.data);
        btn = findViewById(R.id.btn);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
            ticket = (Ticket) bundle.getSerializable(Ticket.class.getSimpleName());

        data.setText("UID - " + ticket.getUid() +
                "\nМесто отправления - " + ticket.getPointStart() +
                "\nМесто прибытия - " + ticket.getPointEnd() +
                "\nВремя отправдения - " + ticket.getTimeStart() +
                "\nВремя прибытия - " + ticket.getTimeEnd() +
                "\nСтоимость - " + ticket.getPrice());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
