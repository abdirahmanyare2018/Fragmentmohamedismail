package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class bananaFragment extends Fragment {

    View view;
    ImageView imagebanana;
    TextView bananatext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.banana, container, false);
// get the reference of Button
        imagebanana = (ImageView) view.findViewById(R.id.imagebanana);
        bananatext=(TextView) view.findViewById(R.id.bananatext);

// perform setOnClickListener on second Button
        imagebanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}