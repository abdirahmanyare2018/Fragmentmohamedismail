package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class barisFragment extends Fragment {

    View view;
    ImageView imagebaris;
    TextView baristext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.baris, container, false);
// get the reference of Button
        imagebaris = (ImageView) view.findViewById(R.id.imagebaris);
        baristext=(TextView) view.findViewById(R.id.baristext);

// perform setOnClickListener on second Button
        imagebaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}