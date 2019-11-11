package com.college.keerasform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private TextView nameDetails,districtDetails;
    private String name, district;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        nameDetails = findViewById(R.id.nameDetails);
        districtDetails = findViewById(R.id.districtDetails);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("name");
            district = bundle.getString("district");

            nameDetails.setText("name "+name);
            districtDetails.setText("District "+district);
        }
    }
}
