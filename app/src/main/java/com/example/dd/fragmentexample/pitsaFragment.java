package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class pitsaFragment extends Fragment {

    View view;
    ImageView imagepitsa;
    TextView pitsatext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.pasta, container, false);
// get the reference of Button
        imagepitsa = (ImageView) view.findViewById(R.id.imagepitsa);
        pitsatext=(TextView) view.findViewById(R.id.pitsatext);

// perform setOnClickListener on second Button
        imagepitsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}