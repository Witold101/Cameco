package pl.pionwit.cameco.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import pl.pionwit.cameco.classentity.CashImg;
import pl.pionwit.cameco.classentity.CashMemo;

/**
 * Created by vi_st on 05.01.2017.
 * Класс описывающий работу всей БД со всеми таблицами
 */
public class DbBase {

    private TableCashMemo tableCashMemo;// Таблица CashMemo
    private TableCashImg tableCashImg;// Таблица CashImg

    private static DBHelper dbHelper;
    private SQLiteDatabase sqLiteDatabase;

    private static DbBase ourInstance ;

    public static DbBase getInstance() {
        if (ourInstance==null){
            return ourInstance=new DbBase(dbHelper);
        }else return ourInstance;
    }

    private DbBase(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
        this.sqLiteDatabase = dbHelper.getWritableDatabase();
        tableCashMemo = new TableCashMemo(sqLiteDatabase);
        tableCashImg = new TableCashImg(sqLiteDatabase);
    }

    public void addCashMemo (CashMemo cashMemo){
        tableCashMemo.Add(cashMemo);
    }

    public void addCashImg (CashImg cashImg){
        tableCashImg.Add(cashImg);
    }

    public void editCashMemo (CashMemo cashMemo){
        tableCashMemo.Edit(cashMemo);
    }

    public void editCashImg (CashImg cashImg){
        tableCashImg.Edit(cashImg);
    }

}
