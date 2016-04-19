package io.github.xbazzu.lonesafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        final TextView et_name          = (TextView) findViewById(R.id.et_name);
        final TextView et_username      = (TextView) findViewById(R.id.et_username);
        final TextView et_level_of_risk = (TextView) findViewById(R.id.et_level_of_risk);
        //final Button et_remember_me     = (TextView) findViewById(R.id.et_remember_me);

        Intent intent = getIntent();

       // String name     = intent.getStringExtra("user");
        //String username = "user";
        //int level_of_risk = intent.getIntExtra("level_of_risk", 5); //5 is default value

       // String welcome = "Welcome " + "Ash";
       // String logged  = "You are logged in as " + "user";
       // String lvl     = "You're risk of level is " + level_of_risk;

       // et_name.setText(welcome);
       // et_username.setText(logged);
       // et_level_of_risk.setText(lvl);

    }
}
