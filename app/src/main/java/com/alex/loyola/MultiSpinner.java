package com.alex.loyola;

/**
 * Created by Justin Joy (jojus) on 19-09-2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

public class MultiSpinner extends Fragment implements
        MultiSelectionSpinner.OnMultipleItemsSelectedListener {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_activity);
        String[] array = {"BSC","BCA","MCA","MSC","B.com","BBA","BA"};
        MultiSelectionSpinner multiSelectionSpinner = (MultiSelectionSpinner) findViewById(R.id
        .spinner);
        multiSelectionSpinner.setItems(array);
        multiSelectionSpinner.setSelection(new int[]{2, 6});
        multiSelectionSpinner.setListener(this);
    }*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.send_activity, container, false);
        String[] array = {"BSC", "BCA", "MCA", "MSC", "B.com", "BBA", "BA"};
        MultiSelectionSpinner multiSelectionSpinner = (MultiSelectionSpinner) view.findViewById(
                R.id.spinner);
        multiSelectionSpinner.setItems(array);
        //multiSelectionSpinner.setSelection(new int[]{2, 6});
        multiSelectionSpinner.setListener(this);
        return view;
    }
    @Override
    public void selectedIndices(List<Integer> indices) {

    }

    @Override
    public void selectedStrings(List<String> strings) {
        Toast.makeText(getContext(), strings.toString(), Toast.LENGTH_LONG).show();
    }


}