package pl.pionwit.cameco.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vi_st on 13.12.2016.
 * Класс отвечает за оработу с базой данных SQLite на самом девайсе.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSISON = 1;
    public static final String DATABASE_NAME = "cashDB";

    public static final String TABLE_CASH ="table_cash";
    public static final String TABLE_IMG = "table_img";

    public static final String ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_TITLE = "title";
    public static final String KEY_DATE_BAY = "date_bay";
    public static final String KEY_DATE_FINISH = "date_finish";
    public static final String KEY_AKTIV = "aktiv";
    public static final String KEY_PATH = "path";
    public static final String KEY_MAIN = "main";
    public static final String KEY_CASH_ID = "cash_id";



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSISON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ TABLE_CASH + "(" + ID + " integer primary key AUTOINCREMENT, " +
                KEY_NAME+" text, "+KEY_TITLE+" text, "+KEY_DATE_BAY+" text, "+KEY_DATE_FINISH+" text, "+KEY_AKTIV+" integer)");
        db.execSQL("create table "+ TABLE_IMG + "(" + ID + " integer primary key AUTOINCREMENT, " +
                KEY_PATH+" text, "+KEY_MAIN+" integer, "+KEY_CASH_ID+" integer, FOREIGN KEY("+KEY_CASH_ID+") REFERENCES "+
                TABLE_CASH+" ("+ID+") ON DELETE CASCADE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+ TABLE_CASH);
        db.execSQL("drop table if exists "+ TABLE_IMG);

        onCreate(db);
    }
}
