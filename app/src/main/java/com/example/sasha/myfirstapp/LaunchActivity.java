package com.example.sasha.myfirstapp;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LaunchActivity extends AppCompatActivity {

    private Button btn;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.test);
        }

        final String mytxt = getString(R.string.teext);

        ContextCompat.getColor( this, R.color.test);

        btn = findViewById(R.id.bt1);
        //txt = findViewById(R.id.tv1);



        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LaunchActivity.this, "Что-то тут наверное должно быть...", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void Showmessage(String mytext)
    {
        Toast.makeText(LaunchActivity.this, mytext, Toast.LENGTH_SHORT).show();
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
                switch(id){
                    case R.id.action_settings :
                        Showmessage("Настройки");
                        return true;
                    case R.id.open_settings:
                        Showmessage("Открыть");
                        return true;
                    case R.id.save_settings:
                        Showmessage("Сохранить");
                        return true;
                }
        return super.onOptionsItemSelected(item);
    }

       // Bundle bundle = new Bundle();
       // bundle.putString("key", "1234566");

}

