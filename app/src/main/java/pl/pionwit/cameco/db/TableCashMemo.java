package pl.pionwit.cameco.db;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import pl.pionwit.cameco.classentity.CashMemo;

/**
 * Created by vi_st on 14.12.2016.
 * Класс описывает таблицу CashMemo
 */

public class TableCashMemo {
    private SQLiteDatabase sqLiteDatabase;
    private List<CashMemo> table ;
    ContentValues contentValues = new ContentValues();
    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");


    public TableCashMemo(SQLiteDatabase sqLiteDatabase) {
        this.sqLiteDatabase=sqLiteDatabase;
    }

    public void Add(CashMemo record) {
        contentValues.put(DBHelper.KEY_NAME,record.getName());
        contentValues.put(DBHelper.KEY_TITLE,record.getTitle());
        contentValues.put(DBHelper.KEY_DATE_BAY,dateFormat.format(record.getDate()));
        contentValues.put(DBHelper.KEY_DATE_FINISH,dateFormat.format(record.getDate().getDate()+1));// Надо переделать для корректой установки периода
        contentValues.put(DBHelper.KEY_AKTIV,1);// Надо переделать для правильного заполнения значения активности записи.
    }

    public void Dell(CashMemo record) {

    }

    public void DellToId(Long id) {

    }

    public void Edit(CashMemo record) {
    }

    public CashMemo GetElementToId(Long id) {
        return null;
    }

    public List<CashMemo> GetTable() {
        return table;
    }

}
