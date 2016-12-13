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
    private static final String DATABASE_NAME = "cashDB";
    private static final String ID = "_id";

    private static final String TABLE_CASH ="cash";
    private static final String TABLE_IMG = "table_img";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSISON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_CASH+ "(" + ID + " integer primary key, name text," +
                " title text, date_bay text, date_finish text, aktiv integer");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+ TABLE_CASH);

        onCreate(db);
    }
}
