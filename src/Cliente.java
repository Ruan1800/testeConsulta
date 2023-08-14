public class Cliente {

    String nomecliente;
    String email;
    long cpf;
    int numerocliente;

    public Cliente(String nomecliente, String email, long cpf, int numerocliente) {
        this.nomecliente = nomecliente;
        this.email = email;
        this.cpf = cpf;
        this.numerocliente = numerocliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public int getNumerocliente() {
        return numerocliente;
    }

    public void setNumerocliente(int numerocliente) {
        this.numerocliente = numerocliente;
    }
}
