import java.text.ParseException;
import java.util.Scanner;

public class Trabalho {
    //Modificações por Gui:
    private double pagamentoGeral;
    private Funcionario funcionario;
    private Departamento departamento;
    private Scanner sc = new Scanner(System.in);

    public Trabalho() throws ParseException {
        System.out.println("\nQual o cargo ocupado pelo(a) funcionário(a)? \n1-Vendedor(a) \t2-Não Vendedor(a) \t3-Supervisor(a)");
        int tipoFuncionario = sc.nextInt();
        funcionario = new Funcionario(tipoFuncionario);
        departamento = new Departamento(tipoFuncionario);
    }

    public void TrabalharMes(Funcionario trabalhador){ // a operação pode simplesmente pegar as horas trabalhadas e dinheiro vendido através dos métodos getters e setters desse trabalhador
        if (trabalhador.getTipoFuncionario() == 1){
            funcionarioVendedor(trabalhador);
        } else if (trabalhador.getTipoFuncionario() == 2){
            funcionarioNaoVendedor(trabalhador);
        } else if (trabalhador.getTipoFuncionario() == 3){
            funcionarioSupervisor(trabalhador);
        } 
    }
    public void funcionarioVendedor(Funcionario trabalhador){

    }
    public void funcionarioNaoVendedor(Funcionario trabalhador){

    }
    public void funcionarioSupervisor(Funcionario trabalhador){

    }

}
