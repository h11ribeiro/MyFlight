public class ProdAlcoolico extends Produto {

        private static double taxaAlcoolico;

        public ProdAlcoolico(int umCodigo, String umNome, double umPreco) {

            super(umCodigo, umNome, umPreco);
        }

        @Override
        public double getPreco() {
            //double pu = super.getPreco();
            double imposto = super.getPreco() * taxaAlcoolico / 100;

            return super.getPreco() + imposto;
        }

        @Override
        public String toString() {
            return "ProdAlcoolico{" +
                    "codigo=" + getCodigo() +
                    ", nome='" + getNome() + '\'' +
                    ", preco='" + getPreco() + '\'' +
                    ", imposto ='" + getTaxaAlcoolico() + "%" + '\'' +
                    '}';
        }

        public static double getTaxaAlcoolico() {
            return taxaAlcoolico;
        }

        public static void setTaxaAlcoolico(double novaTaxa) {
            taxaAlcoolico = novaTaxa;
        }
    }
