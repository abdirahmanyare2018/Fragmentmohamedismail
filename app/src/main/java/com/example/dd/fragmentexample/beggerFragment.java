package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class beggerFragment extends Fragment {

    View view;
    ImageView imagebegger;
    TextView beggertext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.begger, container, false);
// get the reference of Button
        imagebegger = (ImageView) view.findViewById(R.id.imagebegger);
        beggertext=(TextView) view.findViewById(R.id.beggertext);

// perform setOnClickListener on second Button
        imagebegger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}