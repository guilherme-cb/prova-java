import java.util.Scanner;

public class Trabalho {
    //Modificações por Gui:
    private double pagamentoGeral;
    private Funcionario funcionario;
    private double salarioMinimo;
    private Scanner sc = new Scanner(System.in);

    public Trabalho(double salarioMinimo, Funcionario funcionario){
        this.salarioMinimo = salarioMinimo;
        this.funcionario = funcionario;
        TrabalharMes(salarioMinimo, funcionario);
    }

    public double getPagamentoGeral() {
        return pagamentoGeral;
    }
    public void setPagamentoGeral(double pagamentoGeral) {
        this.pagamentoGeral = pagamentoGeral;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public double getSalarioMinimo() {
        return salarioMinimo;
    }
    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public void TrabalharMes(double salarioMinimo, Funcionario trabalhador){
        if (trabalhador.getTipoFuncionario() == 1){
            System.out.println("\nQual o valor vendido pelo(a) funcionário(a) " + trabalhador.getNome() + "?");
            trabalhador.setDinheiroVendas(sc.nextDouble());
            funcionarioVendedor(trabalhador);
        } else if (trabalhador.getTipoFuncionario() == 2){
            System.out.println("\nQual a quantidade de horas extras trabalhadas pelo(a) funcionário(a) " + trabalhador.getNome() + "?");
            trabalhador.setHorasExtras(sc.nextInt());
            funcionarioNaoVendedor(trabalhador);
        } else if (trabalhador.getTipoFuncionario() == 3){
            System.out.println("\nQual a quantidade de horas extras trabalhadas pelo(a) funcionário(a) " + trabalhador.getNome() + "?");
            trabalhador.setHorasExtras(sc.nextInt());
            funcionarioSupervisor(trabalhador);
        } 
    }

    public void funcionarioVendedor(Funcionario trabalhador){
        if (trabalhador.getDinheiroVendas() <= 2000) {
            trabalhador.setSalarioFuncionario(salarioMinimo);
        } else if(trabalhador.getDinheiroVendas() >= 2001 && trabalhador.getDinheiroVendas() <= 5000){
            double aux = trabalhador.getDinheiroVendas() + (trabalhador.getDinheiroVendas() * 0.02);
            trabalhador.setSalarioFuncionario(aux);
        } else {
            double aux = trabalhador.getDinheiroVendas() + (trabalhador.getDinheiroVendas() * 0.03);
            trabalhador.setSalarioFuncionario(aux);
        }
    }

    public void funcionarioNaoVendedor(Funcionario trabalhador){
        double aux = (double) salarioMinimo + (50 * trabalhador.getHorasExtras());
        trabalhador.setSalarioFuncionario(aux);
    }

    public void funcionarioSupervisor(Funcionario trabalhador){
        double aux = (double) salarioMinimo + (50 * funcionario.getHorasExtras()) + 500;
        trabalhador.setSalarioFuncionario(aux);
    }
}