import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario{
    private String nome;
    private String CPF;
    private String telefone;
    private char genero;
    private int tipoFuncionario;
    private Date dataAdmissao;
    private String endereco;
    private int horasExtras;
    private double dinheiroVendas;
    private double salarioFuncionario;
    private Departamento departamento;

    

    public Funcionario(String nome, String cPF, String telefone, char genero, int tipoFuncionario, String dataAdmissao, String endereco, Departamento departamento) throws ParseException {
        this.nome = nome;
        CPF = cPF;
        this.telefone = telefone;
        this.genero = genero;
        this.tipoFuncionario = tipoFuncionario;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataAdmissao = formato.parse(dataAdmissao) ;
        this.endereco = endereco;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getTipoFuncionario() {
        return tipoFuncionario;
    }
    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getHorasExtras() {
        return horasExtras;
    }
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    public double getDinheiroVendas() {
        return dinheiroVendas;
    }
    public void setDinheiroVendas(double dinheiroVendas) {
        this.dinheiroVendas = dinheiroVendas;
    }
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}