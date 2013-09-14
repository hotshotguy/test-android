package com.example.hh_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_activity1);
	
    	Spinner spinnerSex = (Spinner) findViewById(R.id.spinnerSex);
        
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sex, android.R.layout.simple_spinner_dropdown_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        // Apply the adapter to the spinner
        spinnerSex.setAdapter(adapter);
        spinnerSex.setPromptId(R.string.prompt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity1, menu);
	return true;
    }

    public void onClickNameText(View v) {
    	LinearLayout editNameLayout = (LinearLayout) findViewById(R.id.NameLayoutEdit);
    	EditText editNameText = (EditText) findViewById(R.id.editText1);
    	editNameText.setVisibility(View.VISIBLE);
    	editNameLayout.setVisibility(View.VISIBLE);
    }
    
    public void onClickNameButton(View v) {
    	
    	LinearLayout editNameLayout = (LinearLayout) findViewById(R.id.NameLayoutEdit);
    	EditText editNameText = (EditText) findViewById(R.id.editText1);
    	TextView textViewName = (TextView) findViewById(R.id.textAddName);

    	if(!editNameText.getText().toString().isEmpty()){
    		textViewName.setText(editNameText.getText());	
    	}
    	editNameText.setVisibility(View.GONE); 
    	editNameLayout.setVisibility(View.GONE);
    	//Получаем системную службу - менеджер метода ввода
    	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    	//Указываем менеджеру в качестве параметра WindowToken нужного EditTextView
    	imm.hideSoftInputFromWindow(editNameText.getWindowToken(), 0);
    }
    
    
}
