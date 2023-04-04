
public class Produto {

    private int codigo;
    private String nome;
    private double precoUnitario;



    public Produto(int umCodigo, String umNome, double umPreco) {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.precoUnitario = umPreco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return precoUnitario;
    }

    public void setPreco(double novoPreco) {
        precoUnitario = novoPreco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", preco='" + getPreco() + '\'' +
                '}';
    }
}
