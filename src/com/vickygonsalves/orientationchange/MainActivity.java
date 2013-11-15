/**
 * Created by Vicky Gonsalves on 11/15/13.
 * i-XL Technologies, Mumbai, India
 * +91-8097598395
 * http://stackoverflow.com/users/1548301/vicky-gonsalves
 */


package com.vickygonsalves.orientationchange;

import org.apache.cordova.DroidGap;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//This will lock screen to LANDSCAPE
		super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//This will lock screen to PORTRAIT
		super.loadUrl("file:///android_asset/www/index.html", 60000);
	}
}
