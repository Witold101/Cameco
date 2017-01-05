package pl.pionwit.cameco.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import pl.pionwit.cameco.classentity.CashImg;

/**
 * Created by vi_st on 14.12.2016.
 * Класс описывает таблицу CashImg
 */

public class TableCashImg{

    private SQLiteDatabase sqLiteDatabase;
    private List<CashImg> table ;

    public TableCashImg(SQLiteDatabase sqLiteDatabase) {
        this.sqLiteDatabase=sqLiteDatabase;
    }

    public void Add(CashImg record) {

    }

    public void Dell(CashImg record) {

    }

    public void DellToId(Long id) {

    }

    public void Edit(CashImg record) {
    }

    public CashImg GetElementToId(Long id) {
        return null;
    }

    public List<CashImg> GetTable() {
        return table;
    }
}
