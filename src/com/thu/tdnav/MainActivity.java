package com.thu.tdnav;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);	
    }
    
    //debug dialog
    public void showDebugDialog()
    {
  		AlertDialog builder = new AlertDialog.Builder(this)
  		.setTitle("notice")
  		.setMessage("code uncompleted")
  		.setPositiveButton("I know",null)
  		.show();
    }
	
	//2d query
	public void inputby2d(View view)
	{
		showDebugDialog();
	}
	
	//start place voice query
	public void inputbyvoice_start(View view)
	{
		showDebugDialog();
	}
	
	//destination voice query
	public void inputbyvoice_end(View view)
	{
		showDebugDialog();
	}
	
	//menu
	public void menuonclick(View view)
	{
		showDebugDialog();
	}
	
	//search
	public void searchonclick(View view)
	{
		showDebugDialog();
	}
}
