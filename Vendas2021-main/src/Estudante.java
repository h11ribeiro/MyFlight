public class Estudante extends ClientePF {
    private String matricula;
    private String instituicao;

    public Estudante(int umCodigo, String umNome,    // na classe Cliente
                     String umCPF,                   // na classe ClientePF
                     String umaMatricula, String umaInstituicao // esp. de Estudante
                    ){
        super(umCodigo, umNome, umCPF);
        matricula = umaMatricula;
        instituicao = umaInstituicao;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getInstituicao() {
        return instituicao;
    }

    @Override
    public String toString() {
        return super.toString()+ "\t "+ instituicao;
    }
}
