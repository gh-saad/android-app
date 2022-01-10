package com.example.navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawer;
    androidx.appcompat.widget.Toolbar toolbar;
    NavigationView navbar;
    ActionBarDrawerToggle hamburger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        navbar = (NavigationView) findViewById(R.id.navbar);

        hamburger = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(hamburger);
        hamburger.syncState();


        navbar.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.about:
                        Toast.makeText(MainActivity.this, "About Page", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home Page", Toast.LENGTH_SHORT).show();
                        break;
                }
                        return false;
            }
        });

    }
}