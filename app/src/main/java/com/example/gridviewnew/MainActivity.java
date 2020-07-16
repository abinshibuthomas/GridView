package com.example.gridviewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView grill;
    String[] numberword={"one","two","three","four","five","six","seven","eight","nine","Ten","hhh"};
    int[] numberimage={R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes,R.drawable.tomatoes};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grill=findViewById(R.id.grid);
        MainAdapter adapter= new MainAdapter(MainActivity.this,numberword,numberimage);
        grill.setAdapter(adapter);



        grill.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You Clicked"+numberword[+position],
            Toast.LENGTH_SHORT).show();
            }
        });

    }
}