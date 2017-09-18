package com.alex.loyola;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Justin Joy (jojus) on 18-09-2017.
 */

public class SendActivity extends Fragment {
     private EditText content;
     private Spinner spinner;
     private Button send;
     private  String[] department = new String[] {"BSC","BCA","MCA","MSC","B.com","BBA","BA"};
   // @Override
   /* protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_activity);
        content = (EditText) findViewById(R.id.content);
        spinner = (Spinner) findViewById(R.id.spinner);
        send = (Button) findViewById(R.id.send);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, department);

        spinner.setAdapter(adapter);
    }*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.send_activity, container, false);
        content = (EditText) view.findViewById(R.id.content);
        spinner = (Spinner) view.findViewById(R.id.spinner);
        send = (Button) view.findViewById(R.id.send);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, department);

        spinner.setAdapter(adapter);

        return view;
    }
}
