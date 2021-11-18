package com.example.fragment20072021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;
    OnSendData onSendData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getSupportFragmentManager();

    }

    public void addAndroid(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        AndroidFragment androidFragment = new AndroidFragment();
        Bundle bundle = new Bundle();
        bundle.putString("text","Hello Fragment Android");
        androidFragment.setArguments(bundle);
        fragmentTransaction.add(R.id.linearlayoutContainer,androidFragment);
        fragmentTransaction.commitNow();
    }

    public void addIos(View view) {
        // khi được trên xml
        IosFragment iosFragment = (IosFragment) mFragmentManager.findFragmentById(R.id.fragmentIos);
        if (iosFragment != null){
            if (onSendData != null){
                onSendData.onReceiveData("Hello Ios Fragment");
            }
        }
    }

    public void setSenData(OnSendData senData){
        this.onSendData = senData;
    }

    interface OnSendData{
        void onReceiveData(String data);
    }
}