package com.example.mirimidolmanagement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {
    //DB생성
    public MyDBHelper(@Nullable Context context) {
        super(context, "groupDB", null, 1);
    }

    //table생성
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table groupTBL(gName CHAR(20) PRIMARY KEY, gNumber INTEGER);");
    }

    //db가 upgrade되었을 때 기존의 table을 삭제하고 새로 생성
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists groupTBL");
        onCreate(db);
    }
}
