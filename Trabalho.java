import java.text.ParseException;
import java.util.Scanner;

public class Trabalho {
    //Modificações por Gui:
    private Funcionario funcionario;
    private Departamento departamento;
    private double salarioMinimo;
    private Scanner sc = new Scanner(System.in);

    public Trabalho(double salarioMinimo) throws ParseException {
        this.salarioMinimo = salarioMinimo;
        System.out.println("\nQual o cargo ocupado pelo(a) funcionário(a)? \n1-Vendedor(a) \t2-Não Vendedor(a) \t3-Supervisor(a)");
        int tipoFuncionario = sc.nextInt();
        
        funcionario = new Funcionario(tipoFuncionario);
        TrabalharMes(funcionario);

        departamento = new Departamento(tipoFuncionario);
        if (tipoFuncionario != 3) {
            //Ajustando o valor do funcionário do departamento caso o primeiro não seja já o responsável pelo departamento...
            TrabalharMes(departamento.getResponsavel());
        }
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
        if (funcionario.getDinheiroVendas() <= 2000) {
            funcionario.setSalarioFuncionario(salarioMinimo);
        } else if(funcionario.getDinheiroVendas() >= 2001 && funcionario.getDinheiroVendas() <= 5000){
            double aux = funcionario.getDinheiroVendas() + (funcionario.getDinheiroVendas() * 0.02);
            funcionario.setDinheiroVendas(aux);
        } else {
            double aux = funcionario.getDinheiroVendas() + (funcionario.getDinheiroVendas() * 0.03);
            funcionario.setDinheiroVendas(aux);
        }
    }

    public void funcionarioNaoVendedor(Funcionario trabalhador){
        double aux = salarioMinimo + (50 * funcionario.getHorasExtras());
        funcionario.setSalarioFuncionario(aux);
    }

    public void funcionarioSupervisor(Funcionario trabalhador){
        double aux = salarioMinimo + (50 * funcionario.getHorasExtras()) + 500;
        funcionario.setSalarioFuncionario(aux);
    }

    public int getTipoFuncionario(){
        return funcionario.getTipoFuncionario();
    }

    public double getSalarioFuncionario(){
        return funcionario.getSalarioFuncionario();
    }

    public double getSalarioResponsavel(){
        return departamento.getSalarioResponsavel();
    }
}
