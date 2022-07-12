import java.text.ParseException;

public class Departamento {
    private int codigo;
    private String nome;
    private Funcionario supervisor;

    public Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Funcionario getSupervisor() {
        return supervisor;
    }
    public void setSupervisor(String nomeSupervisor, String cPF, String telefone, char genero, String dataAdmissao, String endereco, Departamento departamento) throws ParseException {
        this.supervisor = new Funcionario(nomeSupervisor, cPF, telefone, genero, 3, dataAdmissao, endereco, departamento);
    }
}