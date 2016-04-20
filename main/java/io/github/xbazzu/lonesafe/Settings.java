package io.github.xbazzu.lonesafe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;


public class Settings extends AppCompatActivity {

    private Spinner spinner;
    private static final String[]paths = { " 1", " 2", " 3", " 4", " 5"};
    public String selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

       // Spinner staticSpinner = (Spinner) findViewById(R.id.RLSetter);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(Settings.this,
                android.R.layout.simple_spinner_item,paths);


        Spinner dynamicSpinner = (Spinner) findViewById(R.id.RLSetter);

        dynamicSpinner.setAdapter(adapter);

        dynamicSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
                selected = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

    }




}
