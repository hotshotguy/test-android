package com.example.hh_app;


import org.w3c.dom.Text;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity1 extends Activity {
	private TextView date;

	private int year;
	private int month;
	private int day;

	static final int DATE_DIALOG_ID = 100;
	public static final String EXTRA_MESSAGE = "com.example.hh_app.MESSAGE";

	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity1_main);

    	Spinner spinnerSex = (Spinner) findViewById(R.id.spinnerSex);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sex, android.R.layout.simple_spinner_dropdown_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        // Apply the adapter to the spinner
        spinnerSex.setAdapter(adapter);
        spinnerSex.setPromptId(R.string.prompt);

        addTextVeiwListener();
    }

    private void addTextVeiwListener() {
		date = (TextView) findViewById(R.id.textAddBirth);

		date.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				showDialog(DATE_DIALOG_ID);
			}
		});
    }
    @Override
    protected Dialog onCreateDialog(int id) {

    	switch (id) {
    	case DATE_DIALOG_ID:
    		// set date picker as current date
    		return new DatePickerDialog(this, datePickerListener, year, month,day);
    	}
    	return null;
    }

    private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
    	// when dialog box is closed, below method will be called.
    	public void onDateSet(DatePicker view, int selectedYear,int selectedMonth, int selectedDay) {
    		year = selectedYear;
    		month = selectedMonth;
    		day = selectedDay;
    		// set selected date into Text View
    		date.setText(new StringBuilder().append(day)
    				.append(".").append(month + 1).append(".").append(year).append(" г."));
    	}
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity1, menu);
	return true;
    }

    public void onClickNameText(View v) {
    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.NameLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editName);
    	editText.setVisibility(View.VISIBLE);
    	editLayout.setVisibility(View.VISIBLE);
    }

    public void onClickNameButton(View v) {

    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.NameLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editName);
    	TextView textView = (TextView) findViewById(R.id.textAddName);

    	if(!editText.getText().toString().isEmpty()){
    		textView.setText(editText.getText());
    	}
    	editText.setVisibility(View.GONE);
    	editLayout.setVisibility(View.GONE);
    	//Получаем системную службу - менеджер метода ввода
    	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    	//Указываем менеджеру в качестве параметра WindowToken нужного EditTextView
    	imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void onClickPositionText(View v) {
    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.PositionLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editPosition);
    	editText.setVisibility(View.VISIBLE);
    	editLayout.setVisibility(View.VISIBLE);
    }

    public void onClickPositionButton(View v) {

    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.PositionLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editPosition);
    	TextView textView = (TextView) findViewById(R.id.textAddPosittion);

    	if(!editText.getText().toString().isEmpty()){
    		textView.setText(editText.getText());
    	}
    	editText.setVisibility(View.GONE);
    	editLayout.setVisibility(View.GONE);
    	//Получаем системную службу - менеджер метода ввода
    	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    	//Указываем менеджеру в качестве параметра WindowToken нужного EditTextView
    	imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void onClickSalaryText(View v) {
    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.SalaryLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editSalary);
    	editText.setVisibility(View.VISIBLE);
    	editLayout.setVisibility(View.VISIBLE);
    }

    public void onClickSalaryButton(View v) {

    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.SalaryLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editSalary);
    	TextView textView = (TextView) findViewById(R.id.textAddSalary);

    	if(!editText.getText().toString().isEmpty()){
    		textView.setText(editText.getText());
    	}
    	editText.setVisibility(View.GONE);
    	editLayout.setVisibility(View.GONE);
    	//Получаем системную службу - менеджер метода ввода
    	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    	//Указываем менеджеру в качестве параметра WindowToken нужного EditTextView
    	imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void onClickPhoneText(View v) {
    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.PhoneLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editPhone);
    	editText.setVisibility(View.VISIBLE);
    	editLayout.setVisibility(View.VISIBLE);
    }

    public void onClickPhoneButton(View v) {

    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.PhoneLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editPhone);
    	TextView textView = (TextView) findViewById(R.id.textAddPhone);

    	if(!editText.getText().toString().isEmpty()){
    		textView.setText(editText.getText());
    	}
    	editText.setVisibility(View.GONE);
    	editLayout.setVisibility(View.GONE);
    	//Получаем системную службу - менеджер метода ввода
    	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    	//Указываем менеджеру в качестве параметра WindowToken нужного EditTextView
    	imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

public void onClickEmailText(View v) {
    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.EmailLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editEmail);
    	editText.setVisibility(View.VISIBLE);
    	editLayout.setVisibility(View.VISIBLE);
    }

    public void onClickEmailButton(View v) {

    	LinearLayout editLayout = (LinearLayout) findViewById(R.id.EmailLayoutEdit);
    	EditText editText = (EditText) findViewById(R.id.editEmail);
    	TextView textView = (TextView) findViewById(R.id.textAddEmail);

    	if(!editText.getText().toString().isEmpty()){
    		textView.setText(editText.getText());
    	}
    	editText.setVisibility(View.GONE);
    	editLayout.setVisibility(View.GONE);
    	//Получаем системную службу - менеджер метода ввода
    	InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

    	//Указываем менеджеру в качестве параметра WindowToken нужного EditTextView
    	imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void onClickSubmitCV(View v) {
    	TextView name = (TextView) findViewById(R.id.textAddName);
    	TextView birthdate = (TextView) findViewById(R.id.textAddBirth);
    	TextView position = (TextView) findViewById(R.id.textAddPosittion);
    	TextView salary = (TextView) findViewById(R.id.textAddSalary);
    	TextView phone = (TextView) findViewById(R.id.textAddPhone);
    	TextView email = (TextView) findViewById(R.id.textAddEmail);
    	String userData = new StringBuilder()
	    .append("Имя: ").append(name.getText().toString()).append("\n")
	    .append("Дата рождения: ").append(birthdate.getText().toString()).append("\n")
	    .append("Должность: ").append(position.getText().toString()).append("\n")
	    .append("З/П: ").append(salary.getText().toString()+"руб.").append("\n")
	    .append("Телефон: ").append(phone.getText().toString()).append("\n")
	    .append("Email: ").append(email.getText().toString()).append("\n")
	    .toString();
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	intent.putExtra(EXTRA_MESSAGE, userData);
    	startActivity(intent);
    }

}
