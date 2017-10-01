package com.example.dd.fragmentexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class heelFragment extends Fragment {

    View view;
    ImageView imageheel;
    TextView heeltext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.heel, container, false);
// get the reference of Button
        imageheel = (ImageView) view.findViewById(R.id.imageheel);
        heeltext=(TextView) view.findViewById(R.id.heeltext);

// perform setOnClickListener on second Button
        imageheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// display a message by using a Toast
                Toast.makeText(getActivity(), "ll", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}