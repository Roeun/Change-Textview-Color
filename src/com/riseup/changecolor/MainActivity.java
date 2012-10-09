package com.riseup.changecolor;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btnRed;
	Button btnPink;
	Button btnBlue;
	RadioButton rdoRed;
	RadioButton rdoBlue, rdoPink;
	TextView txtView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnRed = (Button) this.findViewById(R.id.btnRed);
    	btnPink = (Button) this.findViewById(R.id.btnPink); 
    	btnBlue = (Button) this.findViewById(R.id.btnBlue);
    	rdoRed = (RadioButton) this.findViewById(R.id.rdoRed);
    	rdoBlue = (RadioButton) this.findViewById(R.id.rdoBlue);
    	rdoPink = (RadioButton) this.findViewById(R.id.rdoPink);
    	txtView = (TextView) this.findViewById(R.id.txtView);
    	
    	btnBlue.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText("Blue color is changed by Button");
				blueColor();
				return false;
			}
		});
    	
    	btnRed.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText("Red color is changed by Button");
				redColor();
				return false;
			}
		});
    	
    	btnPink.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText("Pink color is changed by Button");
				pinkColor();
				return false;
			}
		});
    	
    	rdoBlue.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText("Blue color is changed by RadioButton");
				blueColor();
				return false;
			}
		});

    	rdoRed.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText("Red color is changed by RadioButton");
				redColor();
				return false;
			}
		});

		rdoPink.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText("Pink color is changed by RadioButton");
				pinkColor();
				return false;
			}
		});

    }
    
    public void blueColor() {
		txtView.setBackgroundColor(Color.BLUE);
	}
    public void redColor() {
		txtView.setBackgroundColor(Color.RED);
	}
    public void pinkColor() {
		txtView.setBackgroundColor(Color.rgb(255,192,203));
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
