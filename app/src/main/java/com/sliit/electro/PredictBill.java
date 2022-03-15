package com.sliit.electro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PredictBill extends AppCompatActivity {

    Spinner buildingTypeSpinner;
    private static final String[] paths = {"One Story", "Two Story"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predict_bill);

        buildingTypeSpinner  = findViewById(R.id.buildingType);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getResources()
                .getStringArray(R.array.building_array));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        buildingTypeSpinner.setAdapter(adapter);
        buildingTypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

    }
}