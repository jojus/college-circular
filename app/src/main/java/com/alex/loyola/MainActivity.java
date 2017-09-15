package com.alex.loyola;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Fragment {
    Toolbar toolbar;
    ActionBar actionBar;
    TextView mHeader;
    TextView nxtPage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        nxtPage = (TextView) view.findViewById(R.id.totalmsgtoday);

        nxtPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AdminHomeActivity.class);
                startActivity(i);

            }
        });
        return view;
    }

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mHeader=(TextView) toolbar.findViewById(R.id.toolbar_title);
        mHeader.setText("Home");
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        nxtPage=(TextView)findViewById(R.id.totalmsgtoday);

        nxtPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),AdminHomeActivity.class);
                startActivity(i);
                finish();
            }
        });
    }}*/
}