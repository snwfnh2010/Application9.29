package com.example.snwfnh.application929;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){

        switch (view.getId()){
            case R.id.btn_F1:

                break;
            case R.id.btn_F2:

                break;
            case R.id.btn_F3:
                break;
            default:
                break;
        }

    }

    public void detailFragment(String str){
        MyFragment my=new MyFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction transaction=fm.beginTransaction();
        transaction.add(R.id.tv_show,my);
    }

}
