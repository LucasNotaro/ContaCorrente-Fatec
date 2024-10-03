
package DAO;


import java.util.Date;

public class movimentacao {
    private int numAge;                   // NUM_AGE
    private long numCc;                   // NUM_CC
    private Date dataMov;                 // DATA_MOV
    private String numDocto;              // NUM_DOCTO
    private char debitoCredito;            // DEBITO_CREDITO
    private int idHis;                    // ID_HIS
    private String complHis;               // COMPL_HIS
    private double valor;                  // VALOR
    private double saldo;                  // SALDO

    // Construtor
    public movimentacao(int numAge, long numCc, Date dataMov, String numDocto, 
                        char debitoCredito, int idHis, String complHis, 
                        double valor, double saldo) {
        this.numAge = numAge;
        this.numCc = numCc;
        this.dataMov = dataMov;
        this.numDocto = numDocto;
        this.debitoCredito = debitoCredito;
        this.idHis = idHis;
        this.complHis = complHis;
        this.valor = valor;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        this.numAge = numAge;
    }

    public long getNumCc() {
        return numCc;
    }

    public void setNumCc(long numCc) {
        this.numCc = numCc;
    }

    public Date getDataMov() {
        return dataMov;
    }

    public void setDataMov(Date dataMov) {
        this.dataMov = dataMov;
    }

    public String getNumDocto() {
        return numDocto;
    }

    public void setNumDocto(String numDocto) {
        this.numDocto = numDocto;
    }

    public char getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(char debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        this.idHis = idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public void setComplHis(String complHis) {
        this.complHis = complHis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

