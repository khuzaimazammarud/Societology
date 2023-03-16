package com.example.societology.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class MYDB extends SQLiteOpenHelper {

    public MYDB(Context context) {
        super(context, "society_db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase MYDBS) {

        //creating table Society

        MYDBS.execSQL("CREATE TABLE users(userid INTEGER primary key autoincrement,name Text,email TEXT,password TEXT)");


        //creating table society

        MYDBS.execSQL("create table member(memberid integer primary key autoincrement,membername TEXT,memberage int,userid int default null,societyid int default null,memberroleid int default null," +
                "CONSTRAINT fk_name foreign key (societyid) references society(societyid) on delete set null, CONSTRAINT user_name foreign key (userid) references users(userid) on delete set null," +
                "CONSTRAINT role_name foreign key (memberroleid) references memberrole(memberroleid) on delete set null)");

        MYDBS.execSQL("create table society(societyid integer primary key autoincrement,societyname TEXT unique,societyfullname TEXT unique,startdate TEXT)");


        MYDBS.execSQL("create table annoucement(annoucid integer primary key autoincrement,annouctitle TEXT unique,Describtion TEXT,startdate TEXT)");

        //creating table events
        MYDBS.execSQL("create table event(eventid integer primary key autoincrement,eventname TEXT unique,describtion TEXT,venue,startdate TEXT,enddate TEXT, societyid integer default null," +
                "CONSTRAINT fk_name foreign key (societyid) references society(societyid) on delete set null)");

        MYDBS.execSQL("create table memberrole(memberroleid integer primary key autoincrement,membername TEXT unique)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase MYDBS, int i, int i1) {
        MYDBS.execSQL("drop table if exists users");
    }

    public void addUser(String name,String email,String password){
        SQLiteDatabase MYDBMS = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",name);
        values.put("email",email);
        values.put("password",password);

        MYDBMS.insert("users",null,values);
        MYDBMS.close();
    }

}