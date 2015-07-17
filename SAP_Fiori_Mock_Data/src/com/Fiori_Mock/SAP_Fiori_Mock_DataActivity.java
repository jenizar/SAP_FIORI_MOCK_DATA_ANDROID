package com.Fiori_Mock;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;

public class SAP_Fiori_Mock_DataActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("loadUrlTimeoutValue", 60000);        
//        setContentView(R.layout.main);
        super.loadUrl("file:///android_asset/www/index.html");          
    }
}