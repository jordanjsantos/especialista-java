import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o sexo: ");
    String sexo = entrada.next();

    System.out.print("Informe o peso: ");
    double peso = entrada.nextDouble();

    System.out.print("Informe a altura: ");
    double altura = entrada.nextDouble();

    double imc = peso / (altura * altura);

    if (sexo.equals("F")) {
      if (imc < 19.1) {
        System.out.println("Abaixo do peso");
      } else if (imc < 25.9) {
        System.out.println("No peso ideal");    
      } else if (imc < 27.4) {
        System.out.println("Um pouco acima do peso");    
      } else if (imc <= 32.3) {
        System.out.println("Acima do peso ideal");    
      } else {
        System.out.println("Obeso");    
      }
    } 
    
    if (sexo.equals("M")) {
      if (imc < 20.7) {
        System.out.println("Abaixo do peso");
      } else if (imc < 26.5) {
        System.out.println("No peso ideal");    
      } else if (imc < 27.9) {
        System.out.println("Um pouco acima do peso");    
      } else if (imc <= 31.1) {
        System.out.println("Acima do peso ideal");    
      } else {
        System.out.println("Obeso");    
      }
    }
  }

}
