package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class canjelloFragment extends Fragment {

    View view;
    ImageView imagecanjello;
    TextView canjellotext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.canjello, container, false);
// get the reference of Button
        imagecanjello = (ImageView) view.findViewById(R.id.imagecanjello);
        canjellotext=(TextView) view.findViewById(R.id.canjellotext);

// perform setOnClickListener on second Button
        imagecanjello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}