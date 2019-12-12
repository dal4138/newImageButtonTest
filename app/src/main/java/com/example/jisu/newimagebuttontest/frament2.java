package com.example.jisu.newimagebuttontest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class frament2 extends Fragment {
    private View view;
    private ImageView imgeview1;
    private ImageView imgeview2;
    private ImageView imgeview3;
    private ImageView imgeview4;
    private TextView textview;
    private int count = 0;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.framelsyout2, container, false);
        count = frament1.count;
        String masseg= frament1.masseg;
        imgeview1 = view.findViewById(R.id.imgeview1);
        imgeview2 = view.findViewById(R.id.imgeview2);
        imgeview3 = view.findViewById(R.id.imgeview3);
        imgeview4 = view.findViewById(R.id.imgeview4);
        textview = view.findViewById(R.id.textview);
        if (count != 0) {
            for (int i = 1; i <= count; i++) {
                switch (i) {
                    case 1:
                        imgeview1.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        imgeview2.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        imgeview3.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        imgeview4.setVisibility(View.VISIBLE);
                        break;
                }
            }
        }else if(masseg!=null) {
            textview.setText(masseg);
            Toast.makeText(view.getContext(),masseg,Toast.LENGTH_SHORT).show();
        }
        return view;
    }
}
