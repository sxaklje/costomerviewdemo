package lje.costomerviewdemo;

import android.app.Activity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity
{

	private List<String> mDatas = Arrays.asList("Android", "Java");

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}



}
