import java.time.LocalDate;

public class Main {

    // tema de casa para 15/03
    //  - completar a classe Venda
    //  - criar duas classes de cadatro: clientes e produtos
    //  - testar.... SEMPRE!!!

    public static void main(String[] args) {

        Produto p1;

        p1 = new Produto(45, "Caneta Bic Marking", 4.50);

        p1.setPreco(5);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println(p1.toString());



        ProdAlcoolico.setTaxaAlcoolico(25);
        System.out.println("Taxa de bebidas alcoolicas: " + ProdAlcoolico.getTaxaAlcoolico());


        //CadastroClientes cadCli = new CadastroClientes();

       // Cliente c = new Cliente(123, "Huguinho");


        CadastroClientes cadCli = CadastroClientes.getInstance();
        cadCli.inserir(new ClientePF(717, "Sr. Smith", "43434"));
        cadCli.inserir(new ClientePJ(913, "Sra. Smith", "23123/0001-8"));

        Cliente c = new ClientePF(123, "Huguinho", "12121212");
        cadCli.inserir( c );

        Cliente pf;

        pf = new ClientePF(981,"Zezinho", "123.456.789.01");
        cadCli.inserir(pf);

        Cliente estu;
        estu = new Estudante(786, "Luizinho", "111.222.333-55",
                "191003456", "PUCRS");
        cadCli.inserir(estu);

        System.out.println(cadCli.toString());


        //CadastroProdutos cadProd = new CadastroProdutos();
        CadastroProdutos cadProd = CadastroProdutos.getInstance();
        cadProd.inserir(21, "Lápis 1HB", 1.50);
        cadProd.inserir(22, "Caneta vermelha", 3);
        cadProd.inserir(23, "Recarga Caneta Pilot", 10);


        ProdutoEE pee;

        pee = new ProdutoEE(67, "Pendrive 1Tb", 10, 180);


        // static binding
        //    - tipo estático da variável,
        //    - só tenho acesso (na compilação) aos métodos da classe estática
        Produto prod;

        //     dynamic binding
        //         - tipo durante a execução (new)
        //         - excuta métodos a partir do tipo dinâmico
        //           p.e. excuta toString do ProdutoEE e não do Produto
        // prod = new ProdutoEE(67, "Super Note 7.0", 5000, 365);
        prod = new ProdutoEE(167, "Super note 7.0", 5000, 365);

        // alternativa 1
        if (prod instanceof ProdutoEE) {
            ProdutoEE prodEE = (ProdutoEE) prod;   // (casting)
            System.out.println(prodEE.getNome());
            System.out.println(prodEE.getGarantia());
        } else {
            System.out.println("\nnão tem garantia...\n");
        }


        cadProd.inserir(pee);
        cadProd.inserir(prod);

        Produto pa = new ProdAlcoolico(77, "Cachaça Boa Sorte", 10);
        cadProd.inserir(pa);

        System.out.println(cadProd.toString());

        Cliente cli = cadCli.pesquisar(786);

        // e se... eu quiser pesquisar o cliente pelo seu CPF ou CNPJ?
        Cliente novoCli = cadCli.pesquisar("111.222.333-55");

        if (cli == null)
            System.out.println("Cliente inválido. Erro");
        else {

            Venda venda1 = new Venda(novoCli);
             prod = cadProd.pesquisar(22);

            if (prod != null) venda1.inserir(3, prod);
            //prod = cadProd.pesquisar(67);
            //if (prod != null) venda1.inserir(prod);

            prod = cadProd.pesquisar(21);
            if (prod != null) venda1.inserir(prod);

            prod = cadProd.pesquisar(67);
            if (prod != null) venda1.inserir(2, prod);

            prod = cadProd.pesquisar(77);
            if (prod != null) venda1.inserir(prod);
            //System.out.println("Total da venda1: "+venda1.valorTotal());

            prod = cadProd.pesquisar(167);
            if (prod != null) venda1.inserir(1, prod);

            System.out.println(venda1.getNotaFiscal());

        }




        // exemplo de uso da classe LocalDate
        /*
        LocalDate hoje = LocalDate.now();

        System.out.println("Hoje: "+ hoje);

        LocalDate dia;

        dia = LocalDate.of(1999, 12,18);
        System.out.println("Aniversario do Vitor: "+ dia);
        System.out.println("nasceu no dia: "+ dia.getDayOfWeek());
*/

    }



    public static void main0(String[] args) {
        Cliente c1 = new ClientePF(123, "Sr. Smith", "11-11");
        Cliente c2 = new ClientePJ(321, "John Doe", "1.1.1");

        CadastroClientes cadCli = CadastroClientes.getInstance();
        cadCli.inserir(c1);
        cadCli.inserir(c2);
        //cadCli.inserir(127, "Tio Patinhas");

        System.out.println(cadCli);


        //System.out.println(c1.toString() );
        //System.out.println("c2: " + c2.getCodigo() + " "+ c2.getNome() );
        //System.out.println();

        CadastroProdutos cadProd = CadastroProdutos.getInstance();

        Produto pee = new ProdutoEE(100, "Ferro de passar", 100, 180);
        cadProd.inserir(pee);



        //Produto p2 = new Produto(2, "borracha", 1.5);
        //Produto p3 = new Produto(3, "lápis", 1);
        //Produto p4 = new Produto(4, "Chocolate", 10);

        cadProd.inserir(1, "caneta azul", 2);
        cadProd.inserir(2, "borracha", 1.5);

        Produto palc = new ProdAlcoolico(300, "51 uma má ideia", 10);
        cadProd.inserir(palc);

        cadProd.inserir(3, "lápis", 1);
        cadProd.inserir(4, "Chocolate", 10);

        ProdAlcoolico.setTaxaAlcoolico(25);

        System.out.println(cadProd.toString());


        //System.out.println( p1.toString() );
        //System.out.println( p4 );

        //ItemVenda i1 = new ItemVenda(3, p4);
        //ItemVenda i2 = new ItemVenda(2, p1);

        //System.out.println();
        //System.out.println(i1);
        //System.out.println(i2);


        // testar a classe venda...
        //Cliente c1 = cadCli.pesquisar(123);
        //if (c1 = null)
        //   System.out.println("cliente nao existe...");
/*
        Venda v1 = new Venda( cadCli.pesquisar(123) );

        v1.inserir( cadProd.pesquisar(1) );
        v1.inserir(10, cadProd.pesquisar(4) );

        System.out.println( v1.getNotaFiscal() );

        Venda v2 = new Venda( cadCli.pesquisar(321) );

        v2.inserir( cadProd.pesquisar(2) );
        v2.inserir(5, cadProd.pesquisar(3) );

        System.out.println( v2.getNotaFiscal() );

        Venda v3 = new Venda( cadCli.pesquisar(127) );

        v3.inserir( cadProd.pesquisar(4));




        System.out.println( v3.getNotaFiscal() );

        System.out.println("\nPróxima venda será a de número: " + Venda.getProximaVenda());



        String nome1 = "joao";
        String nome2 = "joao";

        String nome3 = nome1;


*/
    }

}
