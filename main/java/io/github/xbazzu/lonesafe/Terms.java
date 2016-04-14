package io.github.xbazzu.lonesafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terms extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);


        final Button backbtn = (Button) findViewById(R.id.back); //init back button


        backbtn.setOnClickListener(new View.OnClickListener() { //click listener
            @Override
            public void onClick(View v){

                Intent back = new Intent(Terms.this, Login.class); //on click make new intent from this class to login class
                Terms.this.startActivity(back); //open the intent
            }
        });

    }


}
