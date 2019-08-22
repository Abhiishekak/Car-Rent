package com.example.abhishek.carapplication1;

/**
 * Created by Juned on 3/13/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME="UserDataBase";

    public static final String TABLE_NAME="UserDetail";

    public static final String Table_Col_1="id";

    public static final String Table_Col_2="name";

    public static final String Table_Col_3="email";

    public static final String Table_Col_4="password";

    public static final String Table_Col_5="phone";

    public SQLiteHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("+Table_Col_1+" INTEGER PRIMARY KEY AUTOINCREMENT, "+Table_Col_2+" VARCHAR, "+Table_Col_3+" VARCHAR, "+Table_Col_4+" VARCHAR ," + Table_Col_5 +" VARCHAR )";
        database.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(database);

    }
    public boolean insertData(String name, String email, String password, String contact) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Table_Col_2, name);
        cv.put(Table_Col_3,email );
        cv.put(Table_Col_4,password );
        cv.put(Table_Col_5, contact);
        long result = database.insert(TABLE_NAME, null, cv);
        if (result == -1){
            return false;}

        else
            return true;
    }
}
