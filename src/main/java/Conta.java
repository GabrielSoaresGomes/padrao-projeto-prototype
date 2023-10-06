public class Conta implements Cloneable {
    private Integer numero;
    private String tipo;

    public Conta(Integer numero, String tipo) {
        super();
        this.numero = numero;
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", tipo=" + tipo +
                "}";
    }
}
