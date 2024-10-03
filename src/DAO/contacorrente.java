
package DAO;


public class contacorrente {
    private int numAge;      // NUM_AGE
    private long numCc;      // NUM_CC
    private int idCli;       // ID_CLI
    private double saldo;     // SALDO

    // Construtor
    public contacorrente(int numAge, long numCc, int idCli, double saldo) {
        this.numAge = numAge;
        this.numCc = numCc;
        this.idCli = idCli;
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

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

    
