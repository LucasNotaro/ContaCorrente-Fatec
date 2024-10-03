
package DAO;


public class historicos {
    private int idHis;          // ID_HIS
    private String desHis;      // DES_HIS

    // Construtor
    public historicos(int idHis, String desHis) {
        this.idHis = idHis;
        this.desHis = desHis;
    }

    // Getters e Setters
    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getDesHis() {
        return desHis;
    }

    public void setDesHis(String desHis) {
        this.desHis = desHis;
    }
}

