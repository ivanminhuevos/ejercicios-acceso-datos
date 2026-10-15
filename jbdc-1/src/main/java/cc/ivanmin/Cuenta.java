package cc.ivanmin;

public class Cuenta {
    private final int id;
    private final String codigo;
    private int saldo;

    public Cuenta(int id, String codigo) {
        this.id = id;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return String.format("Cuenta(#%d, %s, %d€)", this.id, this.codigo, this.saldo);
    }
}
