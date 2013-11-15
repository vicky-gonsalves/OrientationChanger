/**
 * Created by Vicky Gonsalves on 11/15/13.
 * i-XL Technologies, Mumbai, India
 * +91-8097598395
 * http://stackoverflow.com/users/1548301/vicky-gonsalves
 */


package com.vickygonsalves.OrientationChanger;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.LOG;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.pm.ActivityInfo;


public class OrientationChanger extends CordovaPlugin {
	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		String mode = null;
		if ("changeorientation".equals(action)) {
			try {
				mode = args.getString(0);
				changeOrientation(callbackContext, mode);
			} catch (Exception e) {
				LOG.d("changeOrientation", "Text parameter not valid");
			}
			return true;
		}
		return false;
	}
	

	public void changeOrientation(CallbackContext callbackContext, String mode) {
		LOG.d("changeOrientation", mode);
		try {
			System.out.println("changeorientation " + mode);
			if (mode.equals("portrait")) {
				cordova.getActivity().setRequestedOrientation(
						ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
			} else {
				cordova.getActivity().setRequestedOrientation(
						ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
			}
			callbackContext.success();
		} catch (Exception e) {
			callbackContext.error("Error while changeOrientation");
		}
	}

}