package io.github.xbazzu.lonesafe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        //init buttons and UI things
        final EditText et_username = (EditText) findViewById(R.id.et_username);
        final EditText et_password = (EditText) findViewById(R.id.et_password);
        final Button   et_login    = (Button)   findViewById(R.id.signIn);
        final TextView et_tc       = (TextView) findViewById(R.id.et_tc);

            //listener to the terms and conditions
        et_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //make a new intent and open it
                Intent tnc = new Intent(Login.this, Terms.class);
                Login.this.startActivity(tnc);


            }
        });

    }

    public void showAlert(View view) {
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("This application is designed for specific users, please see your manager if need a login, Thanks :)")
                .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setTitle("Information")
                .create();
        myAlert.show();
    }
}

