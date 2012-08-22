package com.fsck.k9.externalprovider.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ExternalBroadcastsReceiver extends BroadcastReceiver {
	public static final String TAG = "ExternalBroadcastsReceiver";	
	
	@Override
	public void onReceive(Context context, Intent intent) {
		String accountName = intent.getStringExtra("com.fsck.k9.intent.extra.ACCOUNT");
		if(accountName == null) 
			accountName = "";

		String folderName = intent.getStringExtra("com.fsck.k9.intent.extra.FOLDER");
		if(folderName == null) 
			folderName = "";

		Log.d(TAG, "Received " + intent.getAction() + ", accountName=" + accountName + ", folderName=" + folderName);
	}
}
