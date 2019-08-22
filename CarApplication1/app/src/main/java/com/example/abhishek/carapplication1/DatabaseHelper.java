package com.example.abhishek.carapplication1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "cars.db";
    public static final String TABLE_NAME="cars_tables";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "CONTACT_NUMBER";
    public static final String COL_4 = "FROM_LOCATION";
    public static final String COL_5 = "TO_LOCATION";
    public static final String COL_6 = "CAR_REG";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT , NAME TEXT,CONTACT_NUMBER TEXT ,FROM_LOCATION TEXT,TO_LOCATION TEXT,CAR_REG TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String contact, String fromloc, String toloc, String carreg) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2, name);
        cv.put(COL_3, contact);
        cv.put(COL_4, fromloc);
        cv.put(COL_5, toloc);
        cv.put(COL_6, carreg);
        long result = db.insert(TABLE_NAME, null, cv);
        if (result == -1){
            return false;}

        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    public boolean updateData(String id, String name, String contact, String fromloc, String toloc, String carreg) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1, id);
        cv.put(COL_2, name);
        cv.put(COL_3, contact);
        cv.put(COL_4, fromloc);
        cv.put(COL_5, toloc);
        cv.put(COL_6, carreg);
        db.update(TABLE_NAME, cv,"ID=?",new String[] {id});
        return  true;
    }
public Integer deleteData(String id){
    SQLiteDatabase db = this.getWritableDatabase();
    return db.delete(TABLE_NAME,"ID=?",new String[] {id} );
}
}