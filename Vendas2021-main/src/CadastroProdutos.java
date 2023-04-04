import java.util.ArrayList;

public class CadastroProdutos {

        private ArrayList<Produto> lista;

        private CadastroProdutos() {
            lista = new ArrayList<>();
        }

        private static CadastroProdutos instance;

        public static CadastroProdutos getInstance() {
            if (instance == null)
                instance = new CadastroProdutos();

            return instance;

        }

        public void inserir(Produto prod) {
            lista.add( prod );
        }

        public void inserir(int umCod, String umNome, double umPreco) {

            lista.add( new Produto(umCod, umNome, umPreco) );
        }

        public Produto pesquisar(int cod) {
            for (Produto prod: lista) {
                if (prod.getCodigo() == cod)
                    return prod;
            }
            return null;
        }

        public String toString() {
        /*String aux = "\nCadastro de Clientes\n- - - - - - - - - - -\n";
        for (Cliente umCliente : lista) {
            aux = aux + umCliente.toString() + "\n";
            //aux += umCliente.toString() + "\n";

        }
        return aux;*/

            StringBuilder aux = new StringBuilder("\nCadastro de Produtos\n- - - - - - - - - - -\n");
            for (Produto umProd : lista) {
                aux.append( umProd.toString() + "\n");

            }
            return aux.toString();

        }

}
