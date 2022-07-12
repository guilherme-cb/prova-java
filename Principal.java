//Criamos o nosso próprio contexto da empresa, com nossos funcionários e departamentos já estabelecidos.

import java.text.ParseException;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws ParseException {
        double salarioMinimo, pagamentoTotal;
        String buscador;
        int escolha, contador = 0, aux = 0;
        boolean loopador = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nQual o valor do salário mínimo atual?");
        salarioMinimo = sc.nextDouble();
        
        Departamento dep1 = new Departamento(3305, "Vendas de queijos");
        dep1.setSupervisor("Roberval", "148.537.321-59", "4002-8922", 'M', "15/04/1990", "Rua Florentina de Jesus", dep1);
        Funcionario f1a = new Funcionario("Jailson", "696.969.696-11", "92424-2424", 'F', 2, "24/04/1924", "Rua 16", dep1);
        Funcionario f1b = new Funcionario("Arlindo Cruz", "359.213.304-40", "3539-8794", 'M', 1, "14/09/1958", "Rua dos Boêmios", dep1);
        
        Departamento dep2 = new Departamento(3303, "Venda de bolos");
        dep2.setSupervisor("Matheus Brasileiro", "000.111.222-69", "91823-4568", 'M', "14/02/2006", "Rua dos Brisadeiros", dep2);
        Funcionario f2 = new Funcionario("Alexandre", "854.689.025-46", "91823-0430", 'F', 2, "01/11/2007", "Avenida Nossa Senhora do Carmo", dep2);

        Trabalho tab1 = new Trabalho(salarioMinimo, dep1.getSupervisor());
        tab1.TrabalharMes(salarioMinimo, f1a);
        tab1.TrabalharMes(salarioMinimo, f1b);

        Trabalho tab2 = new Trabalho(salarioMinimo, dep2.getSupervisor());
        tab2.TrabalharMes(salarioMinimo, f2);
        
        Funcionario[] vetor = {f1a, f1b, f2, dep1.getSupervisor(), dep2.getSupervisor()};
        
        while (loopador) {
            contador = 0;
            System.out.println("\nQual função você quer acessar? \n1 - Exibir quanto a empresa pagará pelos funcionários cadastrados. \n2 - Mudar a função de determinado(a) funcionário(a). \n3 - Demitir um funcionário(a). \n4 - Encerrar o programa.");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    pagamentoTotal = f1a.getSalarioFuncionario() + f1b.getSalarioFuncionario() + dep1.getSupervisor().getSalarioFuncionario() + f2.getSalarioFuncionario() + dep2.getSupervisor().getSalarioFuncionario();
                    System.out.println("\nO valor total da soma dos salários é R$" + pagamentoTotal);
                    break;
                case 2: 
                    System.out.println("\nQual funcionário você quer alterar o cargo?");
                    sc.nextLine(); 
                    buscador = sc.nextLine();
                    for (int i=0; i < vetor.length; i++) try{
                        if (vetor[i].getNome().equals(buscador)) {
                            contador++;
                            aux = i;
                        }
                    } catch (Exception NullPointerException) {
                        System.out.println("O valor procurado não está mais entre nós.");
                    }

                    if (contador==0) {
                        System.out.println("\nO funcionário(a) não foi encontrado.");
                    } else {
                        System.out.println("\nQual o novo cargo do funcionário(a)?");
                        vetor[aux].setTipoFuncionario(sc.nextInt());
                        tab1.TrabalharMes(salarioMinimo, vetor[aux]);
                        pagamentoTotal = f1a.getSalarioFuncionario() + f1b.getSalarioFuncionario() + dep1.getSupervisor().getSalarioFuncionario() + f2.getSalarioFuncionario() + dep2.getSupervisor().getSalarioFuncionario();
                    } 
                    break;

                case 3:
                    System.out.println("\nQual funcionário(a) você quer demitir?");
                    sc.nextLine();
                    buscador = sc.nextLine();
                    for (int i=0; i < vetor.length; i++) try{
                        if (vetor[i].getNome().equals(buscador)) {
                            contador++;
                            aux = i;
                        }
                    } catch (Exception NullPointerException) {
                        System.out.println("O valor procurado não está mais entre nós.");
                    }

                    if (contador == 0) {
                        System.out.println("\nO funcionário procurado não foi encontrado.");
                    } else {
                        System.out.println("\nO funcionário " + vetor[aux].getNome() + " está meio entre nós.");
                        vetor[aux].setSalarioFuncionario(0);
                    }
                    break;
                
                case 4: 
                    System.out.println("\nVocê optou por encerrar o programa.");
                    loopador = false;
                    break;
                
                    default: 
                    System.out.println("\nO valor digitado foi inválido, tente novamente.");    
                break;
            }
            sc.close();   
        }
    }
}