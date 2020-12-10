package com.stevehomes.sreeniavask.todaybtech;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class syll_cse_year extends AppCompatActivity {
    ActionBar actionBar;
    Button btn1_1, btn1_2,btn2_1,btn2_2,btn3_1,btn3_2,btn4_1,btn4_2;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.syll_cse_year);

//        actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#212121")));


        btn1_1 = findViewById(R.id.syll_cse_1_1_btn);
        btn1_2 = findViewById(R.id.syll_cse_1_2_btn);
        btn2_1 = findViewById(R.id.syll_cse_2_1_btn);
        btn2_2 = findViewById(R.id.syll_cse_2_2_btn);
        btn3_1 = findViewById(R.id.syll_cse_3_1_btn);
        btn3_2 = findViewById(R.id.syll_cse_3_2_btn);
        btn4_1 = findViewById(R.id.syll_cse_4_1_btn);
        btn4_2 = findViewById(R.id.syll_cse_4_2_btn);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("  ToDayBtech");
        toolbar.setSubtitle("     SteveBrains");
        toolbar.setLogo(R.drawable.tool_icon);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu2);

//        toolbar.setNavigationIcon(R.drawable.back);




        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
            btn1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syll_cse_year.this, B_syll_cse_1_1.class);
                    startActivity(intent);
                }
            });

        }
        else {
            
            connected = false;

            btn1_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(syll_cse_year.this, NetFail.class);
                    startActivity(intent);
                }
            });
        }




        btn1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_1_2.class);
                startActivity(intent);
            }
        });

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_2_1.class);
                startActivity(intent);
            }
        });

        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_2_2.class);
                startActivity(intent);
            }
        });

        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_3_1.class);
                startActivity(intent);
            }
        });


        btn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_3_2.class);
                startActivity(intent);
            }
        });


        btn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_4_1.class);
                startActivity(intent);
            }
        });

        btn4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(syll_cse_year.this, B_syll_cse_4_2.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_manu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Intent intent=new Intent(this,features.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Toast.makeText(this, "You are at Home ", Toast.LENGTH_SHORT).show();
                break;

            case android.R.id.home:
                finish();
                break;
        }


        return super.onOptionsItemSelected(item);

    }


}



