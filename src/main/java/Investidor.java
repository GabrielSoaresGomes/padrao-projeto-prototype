public class Investidor implements Cloneable {
    private String nome;
    private String cpf;
    private String email;
    private Conta conta;

    public Investidor(String nome, String cpf, String email, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public Investidor clone() throws CloneNotSupportedException {
        Investidor investidorClone = (Investidor) super.clone();
        investidorClone.conta = (Conta) investidorClone.conta.clone();
        return investidorClone;
    }

    @Override
    public String toString() {
        return "Investidor{" +
                "cpf=" + cpf +
                ", nome=" + nome +
                ", conta=" + conta +
                ", email=" + email +
                "}";
    }
}