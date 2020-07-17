package com.example.assignment2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.assignment2.Helper.MyHelper;
import com.example.assignment2.Helper.dbConnection;


public class add_fragment extends Fragment {

    Button savedata;
    EditText name, age, address;
    RadioGroup sex;
    String gender;
    RadioButton radio;

    public add_fragment() {

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.fragment_add_fragment, container, false);
        savedata = view.findViewById(R.id.savedata);
        name = view.findViewById(R.id.fullname);
        age = view.findViewById(R.id.age);
        address = view.findViewById(R.id.address);
        sex = view.findViewById(R.id.sexgroup);
        savedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = sex.getCheckedRadioButtonId();
                radio = view.findViewById(selectedId);
                gender = (String) radio.getText();


                insertdata(name.getText().toString(), Integer.parseInt(age.getText().toString()), gender, address.getText().toString());
            }
        });

        return view;

    }

    private void insertdata(String fullname, Integer ageinint, String genderofperson, String addressintext) {
        final dbConnection dbConnection = new dbConnection(getContext(), "student", null, 1);
        SQLiteDatabase dbs = dbConnection.getWritableDatabase();

        Boolean result = dbConnection.insertData(fullname, ageinint, genderofperson, addressintext, dbs);
        String message;
        if (result) {
            message = "Inserted Successfully";
        } else {
            message = "Insert Failed";
        }
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();

    }


}
