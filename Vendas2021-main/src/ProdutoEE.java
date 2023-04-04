import java.time.LocalDate;

// é um tipo de...
public class ProdutoEE    extends      Produto {

    private int diasGarantia;

    public ProdutoEE(int umCodigo, String umNome, double umPreco, int dias) {
        //codigo = umCodigo;
        //nome = umNome;
        //preco = umPreco;
        super(umCodigo, umNome, umPreco);

        this.diasGarantia = dias;
    }

    public int getDiasGarantia() {
        return diasGarantia;
    }

    public String getGarantia() {
        LocalDate garntia = LocalDate.now().plusDays(diasGarantia);

        return "\n- - - - - - - - - - - - - - - \n" + getNome()
                + " - Garantia de " + diasGarantia
                + " dias, vencimento em "+garntia;
                        }
    @Override
    public String toString() {
        return "ProdutoEE{" +
               super.toString() +
                ", dias validade='" + getDiasGarantia() + '\'' +
                '}';
    }
}

