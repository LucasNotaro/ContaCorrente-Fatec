
package DAO;


public class usuarios {
    private String id;        // ID
    private String senha;     // SENHA
    private int numAge;       // NUM_AGE
    private long numCc;       // NUM_CC

    // Construtor
    public usuarios(String id, String senha, int numAge, long numCc) {
        this.id = id;
        this.senha = senha;
        this.numAge = numAge;
        this.numCc = numCc;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

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
}

    

