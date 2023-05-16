package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText uidText;
    private EditText pointStartText;
    private EditText pointEndText;
    private EditText timeStartText;
    private EditText timeEndText;
    private EditText priceText;
    private Button btn;

    private String uid;
    private String pointStart;
    private String pointEnd;
    private String timeStart;
    private String timeEnd;
    private int price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        uidText = findViewById(R.id.editUID);
        pointStartText = findViewById(R.id.editPointStart);
        pointEndText = findViewById(R.id.editPointEnd);
        timeStartText = findViewById(R.id.editTimeStart);
        timeEndText = findViewById(R.id.editTimeEnd);
        priceText = findViewById(R.id.editPrice);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uid = uidText.getText().toString();
                pointStart = pointStartText.getText().toString();
                pointEnd = pointEndText.getText().toString();
                timeStart = timeStartText.getText().toString();
                timeEnd = timeEndText.getText().toString();
                price = Integer.parseInt(priceText.getText().toString());

                Ticket ticket = new Ticket(uid, pointStart, pointEnd, timeStart, timeEnd, price);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra(Ticket.class.getSimpleName(), ticket);
                startActivity(intent);
            }
        });
    }
}
