package lje.costomerviewdemo;


import java.util.Arrays;
import java.util.List;

import static javafx.scene.input.KeyCode.R;


public class MainActivity extends Activity {

	private List<String> mDatas = Arrays.asList("Android", "Java");
	private List<String> mData = Arrays.asList("Android", "Java");
	private List<String> Data = Arrays.asList("Android", "Java");

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}



}
