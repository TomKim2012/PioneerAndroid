package com.example.pioneerandroid;

import org.apache.cordova.CordovaChromeClient;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.DroidGap;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends DroidGap {

	/* Called when activity is first Created */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

	/*
	 * @Override public void init() { super.init(new CordovaWebView(this), new
	 * CordovaWebViewClient(this) {
	 * 
	 * @Override public boolean shouldOverrideUrlLoading(WebView view, String
	 * url) { return url.startsWith("file://") ?
	 * false:super.shouldOverrideUrlLoading(view, url); } }, new
	 * CordovaChromeClient(this)); }
	 */

	/*@Override
	public void init() {
		Log.v(TAG, ">>>Called the Init method");
		//super.init(new CordovaWebView(this), new GWTCordovaWebViewClient(this),
				new CordovaChromeClient(this));
	}*/

}
