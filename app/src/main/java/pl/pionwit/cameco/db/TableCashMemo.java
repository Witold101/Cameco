package pl.pionwit.cameco.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import pl.pionwit.cameco.classentity.CashMemo;

/**
 * Created by vi_st on 14.12.2016.
 * Класс описывает таблицу CashMemo
 */

public class TableCashMemo {
    private SQLiteDatabase sqLiteDatabase;
    private List<CashMemo> table ;
    private ContentValues contentValues = new ContentValues();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");


    public TableCashMemo(SQLiteDatabase sqLiteDatabase) {
        this.sqLiteDatabase=sqLiteDatabase;
        initTable();
    }

    public void Add(CashMemo record) {
        contentValues.put(DBHelper.KEY_NAME,record.getName());
        contentValues.put(DBHelper.KEY_TITLE,record.getTitle());
        contentValues.put(DBHelper.KEY_DATE_BAY,dateFormat.format(record.getDate()));
        contentValues.put(DBHelper.KEY_DATE_FINISH,dateFormat.format(record.getDate().getDate()+1));// Надо переделать для корректой установки периода
        contentValues.put(DBHelper.KEY_AKTIV,1);// Надо переделать для правильного заполнения значения активности записи.
        sqLiteDatabase.insert(DBHelper.TABLE_CASH,null,contentValues);

    }

    // Процедура синхронизирует значения в таблице БД и в поле table обьекта.
    private void initTable() {
        table = null;
        table = new ArrayList<>();

        Cursor cursor = sqLiteDatabase.query(DBHelper.TABLE_CASH, null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            int idIndex = cursor.getColumnIndex(DBHelper.ID);
            int nameIndex = cursor.getColumnIndex(DBHelper.KEY_NAME);
            int titleIndex = cursor.getColumnIndex(DBHelper.KEY_TITLE);
            int dateBayIndex = cursor.getColumnIndex(DBHelper.KEY_DATE_BAY);
            int dateFinishIndex = cursor.getColumnIndex(DBHelper.KEY_DATE_FINISH);
            int aktivIndex = cursor.getColumnIndex(DBHelper.KEY_AKTIV);

            do {
                CashMemo cashMemo = new CashMemo();
                cashMemo.setId(cursor.getLong(idIndex));
                cashMemo.setName(cursor.getString(nameIndex));
                cashMemo.setTitle(cursor.getString(titleIndex));
                cashMemo.setDate(new Date(cursor.getString(dateBayIndex))); // Дописать. Сюда попадают не корректные данные
                cashMemo.setPeriod(new Date().getDate());  // Дописать. Сюда попадают не корректные данные
                cashMemo.setAktiv(cursor.getInt(aktivIndex));
                table.add(cashMemo);
            }
            while (cursor.moveToNext());
            cursor.close();
        }
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
