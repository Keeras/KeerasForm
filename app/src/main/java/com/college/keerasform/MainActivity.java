package com.college.keerasform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinDistrict;
    private EditText name;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("District");
        setContentView(R.layout.activity_main);

        spinDistrict = findViewById(R.id.spinDistrict);
        name = findViewById(R.id.Name);

        btnSave = findViewById(R.id.btnSave);

        String district[] = {"Kathmandu", "Lalitpur", "Bhaktapur", "Surkhet", "Dailekh"};
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, district);
        spinDistrict.setAdapter(adapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Result.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("district",spinDistrict.getSelectedItem().toString());
                startActivity(intent);
            }
        });
    }
}
