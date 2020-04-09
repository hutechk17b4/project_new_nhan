package com.example.ungdungdatvexemphim.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ungdungdatvexemphim.R;
import com.google.android.material.tabs.TabLayout;

public class AccountActivity extends AppCompatActivity {

    TabLayout tabLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        tabLayout1 = findViewById(R.id.tabLayout);



    }
}
