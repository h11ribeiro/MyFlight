import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;
    private int nroVenda;

    // área de infos de classe
    private static int proximaVenda;

    public static int getProximaVenda() {
        return proximaVenda;
    }

    static {
        proximaVenda = 5000;
    }

    public Venda(Cliente umCliente) {
        this.cliente = umCliente;
        this.itens = new ArrayList<>();

        //nroVenda = proximaVenda;
        //proximaVenda += 1;

        nroVenda = proximaVenda++;
    }

    public void inserir(int umaQuantidade, Produto umProduto) {
        //ItemVenda novo = new ItemVenda(umaQuantidade, umProduto);
        //itens.add( novo );

        itens.add( new ItemVenda(umaQuantidade,umProduto));
    }

    public void inserir(Produto umProduto) {

        itens.add( new ItemVenda(1, umProduto));
    }

    public double valorTotal() {
        double total = 0;
       // for (int i = 0; i<itens.size(); i++) {
       //     ItemVenda item = itens.get(i);
        for (ItemVenda item: itens) {
            total = total + item.getValor();
        }

        return total;
    }

    public String getNotaFiscal() {
        StringBuilder rel = new StringBuilder("\nCupom de Venda \t\t NF: ");
        StringBuilder garantias = new StringBuilder();
        rel.append(nroVenda);
        rel.append("\nComprador: ");
        rel.append(cliente.toString());
        rel.append("\n- - - - - - - - - - - - - - - - - - - - - -\n");

        for (ItemVenda item: itens ) {
            rel.append(item.toString());
            rel.append("\n");
            if (item.getProd() instanceof ProdutoEE) {
                ProdutoEE pee = (ProdutoEE) item.getProd();
                garantias.append(pee.getGarantia());
                garantias.append("\n");
            }
        }

        rel.append("\n");
        rel.append("Total: ");
        rel.append(this.valorTotal());
        rel.append("\n------------------------------------------\n");

        rel.append(garantias);

        return rel.toString();
    }
}
