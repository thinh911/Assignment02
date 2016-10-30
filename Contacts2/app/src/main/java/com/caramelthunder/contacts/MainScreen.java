package com.caramelthunder.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainScreen extends AppCompatActivity {

    private static Button button_add01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        TextView maintitle =(TextView) findViewById(R.id.maintitle);
        OnClickButtonListener();

    }
///////////////////////////////////////////////////////////////////////////////
    public void OnClickButtonListener()
    {
        button_add01=(Button)findViewById(R.id.add01);
        button_add01.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent=new Intent("com.caramelthunder.contacts.activity02");
                        startActivity(intent);
                    }
                }
        );
    }
/////////////////////////////////////////////////////////////////////////////////////

}
