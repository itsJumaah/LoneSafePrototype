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

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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
        assert et_tc != null;
        et_tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //make a new intent and open it
                Intent tnc = new Intent(Login.this, Terms.class);
                Login.this.startActivity(tnc);


            }
        });


        assert et_login != null;
        et_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String username = et_username.getText().toString();
                final String password = et_password.getText().toString();
                Response.Listener<String> response = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            System.out.print("THE RESPONSE IS " + response);
                            JSONObject jsonR = new JSONObject(response);
                            boolean success = jsonR.getBoolean("success");
                                //test

                            if(success) {

                                //if the login correct

                                String name         = jsonR.getString("name");
                                int levelOfRisk  = jsonR.getInt("level_of_risk");

                                Intent home = new Intent(Login.this, Home.class);
                                home.putExtra("name", name);
                                home.putExtra("username", username);
                                home.putExtra("level_of_risk", levelOfRisk);

                                Login.this.startActivity(home);

                            }

                            else {
                                //error of the login


                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };


                Request request = new Request(username, password, response);
                RequestQueue Q = Volley.newRequestQueue(Login.this);
                Q.add(request);

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

