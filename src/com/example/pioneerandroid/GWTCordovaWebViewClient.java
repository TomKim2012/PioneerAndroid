package com.example.pioneerandroid;

import org.apache.cordova.CordovaWebViewClient;
import org.apache.cordova.DroidGap;

import android.util.Log;
import android.webkit.WebView;

public class GWTCordovaWebViewClient extends CordovaWebViewClient {
	/*--Implementation of our own web Client--*/
		public GWTCordovaWebViewClient(DroidGap ctx) {
			super(ctx);
		}
		
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			  if(url.startsWith("file://"))
		       {
			   Log.v("URL Loading", ">>>Overide done: "+url);
		       return false;
		       }
			  Log.v("URL Loading", ">>>URL Unmatched!");
		      return super.shouldOverrideUrlLoading(view, url);
		}
		
}
