
// classe abstrata
//    - generalizei e chegei a uma classe que não faz sentido para a aplicação ser instanciada
//    - ou seja, esta classe serve apenas como repositório de atributos e métodos comuns das subclasses
//    - efeito -> não posso dar "new Cliente"

public abstract class Cliente {
    private int codigo;
    private String nome;

    public Cliente(int umCodigo, String umNome) {
        this.codigo = umCodigo;
        this.nome = umNome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        /*return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';*/
        return String.format("(%d) \t %s",codigo, nome);
    }

    //public String getID() {
    //    // - retorna cpf se pf
    //    // - retorna cnpf se pj
    //    return "";
    //}

    // método abstract
    //    - visível para a ligação etática (compilação)
    //    - na classe cliente eu não "sei" o que devo devolver
    //    - mas TODA subclasse de Cliente deve implementar seu método getID
    
    public abstract String getID();

}

