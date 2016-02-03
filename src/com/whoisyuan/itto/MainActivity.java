package com.whoisyuan.itto;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        try {
            String packageName = "com.whoisyuan.itto";
            String versionName = getApplicationContext().getPackageManager().getPackageInfo(packageName, 0).versionName;
            TextView version = (TextView) findViewById(R.id.version);
            version.setText(String.format(getResources().getString(R.string.version), versionName));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void startProcessActivity(View v) {
        startActivity(new Intent(MainActivity.this, ProcessActivity.class));
    }

    public void startITTOActivity(View v) {
        startActivity(new Intent(MainActivity.this, ITTOActivity.class));
    }
}
