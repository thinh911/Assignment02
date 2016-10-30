package com.caramelthunder.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity02 extends AppCompatActivity {
    public final static String PERSON_NAMES_02= "PERSON_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity02);

        EditText editText_names= (EditText) findViewById(R.id.getname02);
        final String names=(String) editText_names.getText().toString();


        Button button_add02=(Button) findViewById(R.id.add02);
        button_add02.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent=new Intent(getApplicationContext(),MainScreen.class);
                intent.putExtra(PERSON_NAMES_02,names);

                startActivity(intent);
            }
        });
    }


}
