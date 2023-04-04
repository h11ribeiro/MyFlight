public class  ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(int umCodigo, String umNome, String umCNPJ) {
        super(umCodigo, umNome);
        this.cnpj = umCNPJ;
    }


    //@Override
    //public String getIdCliente() {
    //    return cnpj;
    //}

    @Override
    public String toString() {
        return super.toString() + "\t (cnpj: " +cnpj +" )";
    }

    @Override
    public String getID() {
        return cnpj;
    }

}
