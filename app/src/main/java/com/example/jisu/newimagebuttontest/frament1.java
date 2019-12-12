package com.example.jisu.newimagebuttontest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class frament1 extends Fragment implements View.OnClickListener {
    private View view;
    private Button btn;
    private EditText edtText;
    static int count=0;
    static String masseg;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.framelsyout1, container, false);
        btn=view.findViewById(R.id.btnSave);
        edtText=view.findViewById(R.id.edtText);
        btn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSave:
                if(edtText.getText().toString().equals("")||edtText.getText().toString()==null){
                    Toast.makeText(v.getContext(),"입력후 눌러주세요",Toast.LENGTH_SHORT).show();
                }else if(count < 4 ){
                    count+=1;
                }else {
                    count = 0;
                    masseg="완주";
                }
                break;
        }
    }
}
