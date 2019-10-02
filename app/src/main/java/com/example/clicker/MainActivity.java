package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView counterView=findViewById(R.id.сounter);
        if (savedInstanceState!=null){
            counterView.setText(savedInstanceState.getInt("keyOne")+"");
        }

    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    public void onClickButtonAddStudents(View view){
        number++;
        TextView counterView=(TextView)findViewById(R.id.сounter);
        counterView.setText(number+"");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("keyOne",number);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        number = savedInstanceState.getInt("keyOne");
    }
}
