package com.example.user.myfragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void ChangFragment(View view){
        Fragment fragment;
        if(view==findViewById(R.id.btnid1)){
            fragment= new FragmentOne();
            getFragmentManager().beginTransaction().replace(R.id.fragment_replace,fragment).commit();
        }
        if(view==findViewById(R.id.btnid2)){
            fragment= new FragmentTwo();
            getFragmentManager().beginTransaction().replace(R.id.fragment_replace,fragment).commit();
        }

    }
}
