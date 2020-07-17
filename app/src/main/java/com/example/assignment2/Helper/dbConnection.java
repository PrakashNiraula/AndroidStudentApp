package com.example.assignment2.Helper;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;


import androidx.annotation.Nullable;

public class dbConnection  extends  SQLiteOpenHelper{



    public dbConnection(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
        String query="  CREATE TABLE TBL_STUDENTS ( ID INTEGER NOT NULL PRIMARY KEY, NAME TEXT (50), AGE  INTEGER, GENDER TEXT(10), ADDRESS  TEXT (50)) ";

            db.execSQL(query);
        }
        catch (SQLException e){
            e.printStackTrace();
        }


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public Boolean insertData(String name, Integer age,String gender,String address ,SQLiteDatabase db) {
        try {
            String query = "insert into TBL_STUDENTS values('"+name+"','"+age+"','"+gender+"','"+address+"')";
            db.execSQL(query);
            return  true;
        } catch (SQLException e) {
            e.printStackTrace();
            return  false;
        }

    }
}
