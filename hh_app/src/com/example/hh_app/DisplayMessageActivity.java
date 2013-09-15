package com.example.hh_app;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.text.util.Linkify;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import android.content.Intent;
import android.os.Build;

public class DisplayMessageActivity extends Activity {
	AlertDialog.Builder builder;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.response_activity);
		// Show the Up button in the action bar.
		setupActionBar();
		Intent intent = getIntent();
	    String message = intent.getStringExtra(Activity1.EXTRA_MESSAGE);

	    TextView textView = (TextView) findViewById(R.id.userData);
	    textView.setText(message);
	    textView.setAutoLinkMask(Linkify.PHONE_NUMBERS);
	    Linkify.addLinks(textView, Linkify.EMAIL_ADDRESSES);
	    
        String title = "Ответ отправлен";
        TextView response = (TextView) findViewById(R.id.editResponse);
        builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
        .setMessage(response.getText())
        .setCancelable(false)
        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int id) {
        		// do something if OK
        	}
        }).setNegativeButton("Cancel",
        		new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int id) {
        		// do something if Cancel
        	}
        });
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void onClick(View v) {
		builder.create().show();
	}
	
}
