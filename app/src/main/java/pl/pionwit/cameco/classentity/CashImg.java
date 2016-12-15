package pl.pionwit.cameco.classentity;

/**
 * Created by vi_st on 14.12.2016.
 * Класс описывает картинку которая привязана к чеку
 */

public class CashImg {
    private Long id; // ID в базе данных
    private String path;// путь к файлу картинки
    private int main; // признак основной картинки
    private int cashId; // привязка к описанию

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getMain() {
        return main;
    }

    public void setMain(int main) {
        this.main = main;
    }

    public int getCashId() {
        return cashId;
    }

    public void setCashId(int cashId) {
        this.cashId = cashId;
    }
}
