package com.luqman.tom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonCompass(View view) {
    	 Intent intent = new Intent(this, CompassActivity.class);
    	 startActivity(intent);
    }
    public void onButtonTracker(View view) {
   	 	Intent intent = new Intent(this, GPSTrackingActivity.class);
   	 	startActivity(intent);
    }
    public void onButtonQR(View view) {
   	 	Intent intent = new Intent(this, QRScanActivity.class);
   	 	startActivity(intent);
    }
}