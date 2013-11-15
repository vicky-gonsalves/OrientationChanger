OrientationChanger
==================

Phonegap Plugin for changing orientation


Change in your Android Mainfest:
<activity
            android:configChanges="orientation|screenSize|keyboardHidden"
            android:windowSoftInputMode="adjustResize|stateHidden"
            
            ..
            ..
            ..
 </activity>
 
 
 
 Add plugin in config.xml
 
  <plugin name="OrientationChanger" value="com.vickygonsalves.OrientationChanger.OrientationChanger" />



In MainActivity.java set orientation

	super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//This will lock screen to LANDSCAPE
	super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//This will lock screen to PORTRAIT
