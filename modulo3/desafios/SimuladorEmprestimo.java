import java.util.Scanner;

public class SimuladorEmprestimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = switch (quantidadeParcelas) {
      case 1, 2 -> 1.99 / 100;
      case 3 -> 2.99 / 100;
      default -> 3.99 / 100;
    };

    double tarifaFixa = valorEmprestimo >= 100.00 ? 1.50 : 0.00;
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$ %.2f%n", tarifaFixa);
    System.out.printf("Tarifa de juros: R$ %.2f%n", totalJuros);
    System.out.printf("Custo total: R$ %.2f%n", custoTotal);
  }

}
