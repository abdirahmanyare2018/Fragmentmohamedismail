package com.example.dd.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView pitsaFragment,pastaFragment,greanteaFragment,pashionFragment,appleFragment,bananaFragment,heelFragment,canjelloFragment,barisFragment,mangoFragment,pineappleFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of Button's

        appleFragment = (TextView) findViewById(R.id.appleFragment);
        pashionFragment = (TextView) findViewById(R.id.pashionFragment);
        bananaFragment = (TextView) findViewById(R.id.bananaFragment);
        heelFragment = (TextView) findViewById(R.id.heelFragment);
        canjelloFragment = (TextView) findViewById(R.id.canjelloFragment);
        barisFragment = (TextView) findViewById(R.id.barisFragment);
        greanteaFragment = (TextView) findViewById(R.id.greanteatext);
        mangoFragment = (TextView) findViewById(R.id.mangoFragments);
        pastaFragment = (TextView) findViewById(R.id.pastaFragments);
        pineappleFragment = (TextView) findViewById(R.id.pineappleFragments);
        pitsaFragment = (TextView) findViewById(R.id.pineappleFragments);
        pitsaFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pitsaFragment());
            }
        });
        pineappleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pineappleFragment());
            }
        });
        pastaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new pastaFragment());
            }
        });
        mangoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new mangoFragment());
            }
        });
        greanteaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new greanteaFragment());
            }
        });
        barisFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new barisFragment());
            }
        });
        appleFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new appleFragment());
            }
        });

        bananaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new bananaFragment());
            }
        });
    }

        private void loadFragment(Fragment fragment) {
// create a FragmentManager
            FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit(); // save the changes
        }
    }