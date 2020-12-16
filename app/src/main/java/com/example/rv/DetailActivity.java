package com.example.rv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detail = (TextView) findViewById(R.id.detail);

        Intent intent = getIntent();
        String data =  intent.getStringExtra("ARG_ITEM_ID");
        for (DummyContent.DummyItem item: DummyContent.ITEMS) {
            if (item.id.equals(data)) {
                detail.setText(item.details);
                break;
            }
        }
    }
}