package com.example.fagment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity implements MenuFrag.IFragmentClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onMenuItemClick(int position) {
        ContentFrag content = (ContentFrag)getSupportFragmentManager().findFragmentById(R.id.ContentFrag);
        if(content != null)
            content.updateContent(position);
    }
}