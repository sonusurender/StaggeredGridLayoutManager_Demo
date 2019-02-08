package com.androidstaggeredgridlayoutmanager_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private static Button staggeredRecyclerView, horizontalRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        staggeredRecyclerView = (Button)findViewById(R.id.staggeredRecyclerViewBtn);
        horizontalRecyclerView = (Button)findViewById(R.id.horizontalRecyclerViewBtn);

        staggeredRecyclerView.setOnClickListener(this);
        horizontalRecyclerView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.staggeredRecyclerViewBtn:
                OpenRecyclerViewActivity("staggered");
                break;
            case R.id.horizontalRecyclerViewBtn:
                OpenRecyclerViewActivity("horizontal");
                break;

        }

    }

    //Open Recycler View activity and pass a string to notify which recyclerview is to setup
    private void OpenRecyclerViewActivity(String navigateFrom){
        Intent in = new Intent(MainActivity.this, RecyclerView_Activity.class);
        in.putExtra("navigateFrom",navigateFrom);
        startActivity(in);
    }
}
