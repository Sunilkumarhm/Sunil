package com.example.adminpc.app_ui;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class StartScreen2 extends ActionBarActivity {


    Button btn,btnpre,btnnxt;

    Button btnpre31,btnnxt31;
    Button btnpre41,btnnxt41;
    Button btnpre51,btnnxt51;
    Button btnpre61,submit61;

    RelativeLayout rl01,rl02,rl03,rl04,rl05,rl06;
    DataItem[] dataItems;
    WaxItems[] waxItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen2);
        setTitle("Beautician Service For Women");

        rl01= (RelativeLayout)findViewById(R.id.rl1);
        btn=(Button)findViewById(R.id.btnnext);

        rl02=(RelativeLayout)findViewById(R.id.rl2);
        btnpre=(Button)findViewById(R.id.btnprev1);
        btnnxt=(Button)findViewById(R.id.btnnext1);


        rl03=(RelativeLayout)findViewById(R.id.rl3);
        btnpre31=(Button)findViewById(R.id.btnprev31);
        btnnxt31=(Button)findViewById(R.id.btnnext31);

        rl04=(RelativeLayout)findViewById(R.id.rl4);
        btnpre41=(Button)findViewById(R.id.btnprev41);
        btnnxt41=(Button)findViewById(R.id.btnnext41);

        rl05=(RelativeLayout)findViewById(R.id.rl5);
        btnpre51=(Button)findViewById(R.id.btnprev51);
        btnnxt51=(Button)findViewById(R.id.btnnext51);

        rl06=(RelativeLayout)findViewById(R.id.rl6);
        btnpre61=(Button)findViewById(R.id.btnprev61);
        submit61=(Button)findViewById(R.id.btnnext61);

        dataItems = new DataItem[8];
        dataItems[0] = new DataItem( "Wax", "(Rs 70 - Rs 1200)");
        dataItems[1] = new DataItem("Facial","(Rs 750 - Rs 2000)");
        dataItems[2] = new DataItem("Manicure", "(Rs 300 - Rs 700)");
        dataItems[3] = new DataItem( "Pedicure", "(Rs 400 - Rs 800)");
        dataItems[4] = new DataItem("Bleach","(Rs 400 - Rs 1300)");
        dataItems[5] = new DataItem("Massage", "(Rs 400 - Rs 1700)");
        dataItems[6] = new DataItem( "Threading", "(Rs 100)");
        dataItems[7] = new DataItem("Hair Treatment","(Rs 300 - Rs 400)");

        final ListView listView = (ListView) findViewById(R.id.listView1);
        CustomAdapter adapter = new CustomAdapter(this, dataItems);
        listView.setAdapter(adapter);


        waxItems = new WaxItems[6];
        waxItems[0] = new WaxItems( "Underarms", "(Rs 70)");
        waxItems[1] = new WaxItems("Hands - Full","(Rs 250)");
        waxItems[2] = new WaxItems("Legs - Full", "(Rs 400)");
        waxItems[3] = new WaxItems( "Stomach", "(Rs 300)");
        waxItems[4] = new WaxItems("Back","(Rs 350)");
        waxItems[5] = new WaxItems("Full Body", "(Rs 1200)");

        ListView listView1 = (ListView) findViewById(R.id.lvMain);
        ListAdapter adapter1 = new ListAdapter(this, waxItems);
        listView1.setAdapter(adapter1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl01.setVisibility(View.GONE);
                rl02.setVisibility(View.VISIBLE);
                /*txt11.setVisibility(View.GONE);
                txt12.setVisibility(View.GONE);
                txt13.setVisibility(View.GONE);
                txt14.setVisibility(View.GONE);
                txt15.setVisibility(View.GONE);
                txt16.setVisibility(View.GONE);
                v1.setVisibility(View.GONE);
                btn.setVisibility(View.GONE);

                txt21.setVisibility(View.VISIBLE);
                v2.setVisibility(View.VISIBLE);
                btnpre.setVisibility(View.VISIBLE);

                btnnxt.setVisibility(View.VISIBLE);*/



            }
        });

        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl02.setVisibility(View.GONE);
                rl01.setVisibility(View.VISIBLE);
               /* txt11.setVisibility(View.VISIBLE);
                txt12.setVisibility(View.VISIBLE);
                txt13.setVisibility(View.VISIBLE);
                txt14.setVisibility(View.VISIBLE);
                txt15.setVisibility(View.VISIBLE);
                txt16.setVisibility(View.VISIBLE);
                v1.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);

                txt21.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                btnpre.setVisibility(View.GONE);
                btnnxt.setVisibility(View.GONE);*/

            }
        });

        btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                rl02.setVisibility(View.GONE);
                rl03.setVisibility(View.VISIBLE);

                /*txt31.setVisibility(View.VISIBLE);
                v3.setVisibility(View.VISIBLE);
                btnpre31.setVisibility(View.VISIBLE);
                btnnxt31.setVisibility(View.VISIBLE);

                txt21.setVisibility(View.GONE);
                v2.setVisibility(View.GONE);
                btnpre.setVisibility(View.GONE);
                btnnxt.setVisibility(View.GONE);*/

            }
        });



        btnpre31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl03.setVisibility(View.GONE);
                rl02.setVisibility(View.VISIBLE);

            }
        });
        btnnxt31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl03.setVisibility(View.GONE);
                rl04.setVisibility(View.VISIBLE);
            }
        });


        btnpre41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl04.setVisibility(View.GONE);
                rl03.setVisibility(View.VISIBLE);

            }
        });
        btnnxt41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl04.setVisibility(View.GONE);
                rl05.setVisibility(View.VISIBLE);
            }
        });


        btnpre51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl05.setVisibility(View.GONE);
                rl04.setVisibility(View.VISIBLE);

            }
        });
        btnnxt51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl05.setVisibility(View.GONE);
                rl06.setVisibility(View.VISIBLE);
            }
        });

        btnpre61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rl06.setVisibility(View.GONE);
                rl05.setVisibility(View.VISIBLE);

            }
        });


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_screen2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
