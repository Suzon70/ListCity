package com.example.simpleparadox.listycity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class showActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        TextView textView;
        Button button = null;
        Bundle bundle = getIntent().getExtras();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);
        textView = findViewById(R.id.button);
        button.setText("Back");
        textView.setText(bundle.getString("cityname"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showActivity.this.finish();
            }
        });

    }
}
