import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Funcionario{
    //declarção dos atributos do diagrama
    private String nome;
    private String CPF;
    private String telefone;
    private char genero;
    //Passei para o tipo char pra ficar mais fácil de identificar depois...
    private int tipoFuncionario;
    private Date dataAdmissao;
    private String endereco;
    //declaração dos atributos sugeridos pelo Alex
    private double horasExtras;
    private double dinheiroVendas;
    private double salarioFuncionario;

    private Scanner sc = new Scanner(System.in);

    //Construtor da classe:
    public Funcionario(int tipoFuncionario) throws ParseException {
        setTipoFuncionario(tipoFuncionario);
        System.out.println("\nQual o nome do(a) funcionário(a)?");
        setNome(sc.nextLine());

        System.out.println("\nQual o CPF do(a) funcionário(a)?");
        setCPF(sc.nextLine());

        System.out.println("\nQual o telefone do(a) funcionário(a)?");
        setTelefone(sc.next());

        System.out.println("\nQual o gênero do(a) funcionário(a)? (M|F)");
        setGenero(sc.next().charAt(0));

        System.out.println("\nQual a data de admissão do(a) funcionário(a)? (dd/MM/yyyy)");
        String data = sc.next();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        setDataAdmissao(formato.parse(data));

        System.out.println("\nQual a rua do(a) funcionário(a)?");
        sc.nextLine();
        setEndereco(sc.nextLine());

        System.out.println("\nQual a quantidade de horas extras trabalhadas pelo(a) funcionário(a)?");
        setHorasExtras(sc.nextDouble());

        if (getTipoFuncionario() == 1) {
            System.out.println("\nQual o valor vendido no mês pelo funcionário(a)?");
            double dinheiroVendas = sc.nextDouble();
            setDinheiroVendas(dinheiroVendas);
        } else {
            System.out.println("\nQual a quantidade de horas extras trabalhadas pelo(a) funcionário(a)?");
            double horasExtras = sc.nextDouble();
            setHorasExtras(horasExtras);
        }
}

    //declaração dos getters e setters dos atributos principais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCPF(){
        return this.CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public char getGenero(){
        return this.genero;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }
    public int getTipoFuncionario(){
        return this.tipoFuncionario;
    }
    public void setTipoFuncionario(int tipoFuncionario){
        this.tipoFuncionario = tipoFuncionario;
    }
    public Date getDataAdmissao(){
        return this.dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    //declaração dos getters e setters dos atributos sugeridos
    public double getHorasExtras(){
        return this.horasExtras;
    }
    public void setHorasExtras(double horasExtras){
        this.horasExtras = horasExtras;
    }
    public double getDinheiroVendas(){
        return this.dinheiroVendas;
    }
    public void setDinheiroVendas(double dinheiroVendas){
        this.dinheiroVendas = dinheiroVendas;
    }
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
}