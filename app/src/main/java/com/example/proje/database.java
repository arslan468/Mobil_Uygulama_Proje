package com.example.proje;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {


    public database(@Nullable Context context) {
        super(context, "dataDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

        String sorgu = "CREATE TABLE datam(id INTEGER PRIMARY KEY AUTOINCREMENT, Ad TEXT,  Password INTEGER)";
        db.execSQL(sorgu);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1)
    {
        db.execSQL("drop Table if exists datam");
    }

    public Boolean insertData(String Ad, Integer Pasword )
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put( "Ad",Ad);
        contentValues.put( "Password",Pasword);
        long result = db.insert("datam",null,contentValues);
        if (result == -1) return  false;
        else
            return true;

    }

    public  Boolean checkUserdata(String Ad)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from datam where Ad=?", new String[]{Ad});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public  Boolean checkAdandPassword(String Ad, Integer Password)
    {
        SQLiteDatabase  db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from datam where Ad=? and Password=?", new String[]{Ad, String.valueOf(Password)});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }


    protected  void ekleme(kapsul kap) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Ad", kap.getName());
        cv.put("Password", kap.getPassword());
        db.insert("datam", null, cv );
        db.close();
    }


}
