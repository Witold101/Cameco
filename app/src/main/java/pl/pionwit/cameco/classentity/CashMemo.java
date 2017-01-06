package pl.pionwit.cameco.classentity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vi_st on 13.12.2016.
 * Описывает сам товарный чек
 */

public class CashMemo {
    private Long id; // ID в базе данных
    private String name;// наименование товара
    private String title; // описание товара
    private Date date; // дата покупки товара
    private int period; // срок гарантии
    private int aktiv;// Активна ли запись
    private List<CashImg> cashImgs;

    public CashMemo() {
        cashImgs=new ArrayList<>();
    }

    public CashMemo(List<CashImg> cashImgs){
        this.cashImgs=cashImgs;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getAktiv() {
        return aktiv;
    }

    public void setAktiv(int aktiv) {
        this.aktiv = aktiv;
    }

    public List<CashImg> getCashImgs() {
        return cashImgs;
    }

    public void setCashImgs(List<CashImg> cashImgs) {
        this.cashImgs = cashImgs;
    }
}
