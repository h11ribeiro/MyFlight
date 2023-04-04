public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(int umCodigo, String umNome,  // atrib def na classe Cliente
                     String umCPF                  // especif. PF
    ) {
        super(umCodigo, umNome);
        this.cpf = umCPF;
    }

    public String getCPF() {
        return cpf;
    }
    //@Override
    //public String getIdCliente() {
    //    return cpf;
    //}

    @Override
    public String toString() {
        return super.toString() + "\t (cpf: " +cpf +" )";
    }

    @Override
    public String getID() {
        return cpf;
    }
}
