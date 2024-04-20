import java.math.BigDecimal;
import java.util.Scanner;

public class CalculadoraPagamentos {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o nome: ");
    String nome = entrada.nextLine();

    System.out.print("Informe o valor por hora: ");
    BigDecimal valorPorHora = entrada.nextBigDecimal();

    System.out.print("Informe a quantidade de horas trabalhadas: ");
    int horasTrabalhadas = entrada.nextInt();

    System.out.print("Informe o valor dos descontos: ");
    BigDecimal valorDesconto = entrada.nextBigDecimal();

    BigDecimal valorTotal = new BigDecimal(horasTrabalhadas).multiply(valorPorHora);
    BigDecimal totalDevido = valorTotal.subtract(valorDesconto);

    System.out.printf("Folha de pagamento: %s%n", nome);
    System.out.printf("%d horas x R$ %.2f = R$ %.2f%n", horasTrabalhadas, valorPorHora, valorTotal);
    System.out.printf("Descontos: R$ %.2f%n", valorDesconto);
    System.out.printf("Total devido: R$ %.2f%n", totalDevido);
  }

}
