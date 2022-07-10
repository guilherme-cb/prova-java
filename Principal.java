import java.text.ParseException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        double salarioMinimo, salarioTotal = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nQual o valor do salário mínimo atual?");
        salarioMinimo = sc.nextDouble();
        
        System.out.println("\nQuantos funcionários(as) você irá cadastrar?");
        final int quantidadeVetor = sc.nextInt();
        Trabalho[] vetor = new Trabalho[quantidadeVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("\nFuncionário #" + (i+1));
            vetor[i] = new Trabalho(salarioMinimo);
        }

        //For each pra achar o valor dos pagamentos totais de todos os funcionários cadastrados...
        for (Trabalho trabalho : vetor) {
            if (trabalho.getTipoFuncionario() == 3) {
                salarioTotal += trabalho.getSalarioFuncionario();
            } else {
                salarioTotal += trabalho.getSalarioFuncionario() + trabalho.getSalarioResponsavel();
            }
        }
    }
}
