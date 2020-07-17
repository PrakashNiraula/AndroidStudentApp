package com.example.assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private List<Student> studentList;

    public StudentAdapter(Context mContext, List<Student> student) {
        // this.mContext = mContext;
        this.studentList = student;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.studentdetail,parent,false);
return new StudentViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {

        Student stdclass=studentList.get(position);
        //holder.imageview.setImageResource();
        holder.name.setText(stdclass.getName());
        holder.address.setText(stdclass.getAddress());
        holder.age.setText(stdclass.getAge());
        holder.gender.setText(stdclass.getGender());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}


class StudentViewHolder extends  RecyclerView.ViewHolder{

    ImageView imageview;
    TextView name,age,gender,address;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        imageview=itemView.findViewById(R.id.imageview);
        name=itemView.findViewById(R.id.labelname);
        age=itemView.findViewById(R.id.labelage);
        gender=itemView.findViewById(R.id.lalgender);
        address=itemView.findViewById(R.id.address);

    }
}
