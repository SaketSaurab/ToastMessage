package com.example.displaytoastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void  displayToast(View v){
        Toast.makeText(MainActivity.this,"Button one is clicked",Toast.LENGTH_SHORT).show();
    }
    public  void  displayToast2(View v){
        Toast.makeText(MainActivity.this,"Button Two is clicked",Toast.LENGTH_SHORT).show();

}
    public  void  displayToast3(View v){
        Toast.makeText(MainActivity.this,"Button Three is clicked",Toast.LENGTH_SHORT).show();
}
}