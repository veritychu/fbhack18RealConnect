package com.example.veritychu.realconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get ListView object from xml.
        ListView eventListView = (ListView) findViewById(R.id.event_list);

        // Initialize an adapter.
        EventAdapter adapter = new EventAdapter(this);

        // Assign adapter to ListView.
        eventListView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Life cycle test", "lols at onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Life cycle test", "lols at onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Life cycle test", "lols at onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Life cycle test", "lols at onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Life cycle test", "lols at onDestroy()");
    }

}
