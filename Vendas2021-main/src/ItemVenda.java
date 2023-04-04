public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(int umaQtde, Produto umProduto) {
        this.quantidade = umaQtde;
        this.prod = umProduto;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    public Produto getProd() {
        return prod;
    }

    @Override
    public String toString() {
        return String.format("(%03d) %-20s  %2d  %7.2f",
                prod.getCodigo(),
                prod.getNome(),
                quantidade,
                this.getValor());
    }
}
