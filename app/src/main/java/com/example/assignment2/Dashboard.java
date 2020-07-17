package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {
    BottomNavigationView nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        nav=findViewById(R.id.bottom_nav);


        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               Fragment selectedfragment=null;


               switch (item.getItemId()){
                   case R.id.home:
                       selectedfragment=new home_fragment();
                               break;

                   case R.id.add:
                       selectedfragment=new add_fragment();
                       break;

                   case R.id.search:
                       selectedfragment=new  search_fragment();
                       break;
               }
               getSupportFragmentManager().beginTransaction().replace(R.id.viewarea,selectedfragment).commit();
               return true;
            };
        });
    }


}
