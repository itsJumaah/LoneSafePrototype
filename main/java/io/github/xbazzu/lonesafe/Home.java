package io.github.xbazzu.lonesafe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private String slected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        final TextView et_name          = (TextView) findViewById(R.id.et_name);
        final TextView et_username      = (TextView) findViewById(R.id.et_username);
        final TextView et_level_of_risk = (TextView) findViewById(R.id.RLHere);


      //  Intent intent = getIntent();

       // String name     = intent.getStringExtra("user");
        //String username = "user";
        //int level_of_risk = intent.getIntExtra("level_of_risk", 5); //5 is default value

       // String welcome = "Welcome " + "Ash";
       // String logged  = "You are logged in as " + "user";
       // String lvl     = "You're risk of level is " + level_of_risk;

       // et_name.setText(welcome);
       // et_username.setText(logged);

    }

    public void showSOSAlert(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are about to activate an alarm, Are you sure you want to do this?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setTitle("Warning!!")
                .create();
        myAlert.show();
    }
    //Goes to settings page when buton clicked
    public void GoToSettings (View view) {
        Intent settings = new Intent(Home.this, Settings.class);
        Home.this.startActivity(settings);
    }

}
