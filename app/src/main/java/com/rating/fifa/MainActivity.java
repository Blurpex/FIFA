package com.rating.fifa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.google.android.material.search.SearchBar;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchBar searchBar = findViewById(R.id.search_bar);
        setSupportActionBar(searchBar);

//        drawerLayout = findViewById(R.id.navigation_drawer);
        searchBar.setNavigationOnClickListener(view -> {
            Log.d("d", "draweer");
//            drawerLayout.open();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
     }
}
