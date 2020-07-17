package com.example.assignment2;




public class Student{

  private  String name,address,gender;
    private int age,imageid;

    public Student(String name,String address, String gender,int age,int imageid){
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.imageid=imageid;
        this.age=age;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
