package com.example.assignment2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class home_fragment extends Fragment {

    public home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home_fragment, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.viewlist);

        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Ram Shrestha","Bhaktapur","Male",40,2));
        studentList.add(new Student("Ram Shrestha","Bhaktapur","Male",40,2));
        studentList.add(new Student("Ram Shrestha","Bhaktapur","Male",40,2));
        studentList.add(new Student("Ram Shrestha","Bhaktapur","Male",40,2));
StudentAdapter adapter=new StudentAdapter(getContext(),studentList);
recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }

}
