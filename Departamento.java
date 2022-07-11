import java.text.ParseException;
import java.util.Scanner;

public class Departamento {
    //declaração atributos
    private int codigo;
    private String nome;
    private Funcionario responsavel;
    private Scanner sc = new Scanner(System.in);

    //Construtor da classe:
    public Departamento(int tipoFuncionario) throws ParseException {
        System.out.println("\nQual o código do departamento deste funcionário(a)?");
        int codigo = sc.nextInt();
        setCodigo(codigo);

        System.out.println("\nQual o nome do departamento deste funcionário(a)?");
        sc.nextLine();
        String nome = sc.nextLine();
        setNome(nome);

        if (tipoFuncionario == 3) {
            System.out.println("\nO nome e dados do(a) supervisor(a) já foram estabelecidos.");
        } else {
            System.out.println("\nDados do supervisor do departamento: ");
            responsavel = new Funcionario(3);
        }
    }
    //declaração getters e setters
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Funcionario getResponsavel(){
        return this.responsavel;
    }
    public void setResponsavel(Funcionario responsavel){
        this.responsavel = responsavel;
    }
    public double getSalarioResponsavel(){
        return this.responsavel.getSalarioFuncionario();
    }
    public void setSalarioResponsavel(double salario){
        this.responsavel.setSalarioFuncionario(salario);
    }
    public String getNomeResponsavel(){
        return responsavel.getNome();
    }
}
