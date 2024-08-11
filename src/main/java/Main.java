import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    System.out.println("Seja bem-vindo ao sistema do Posto de Gasolina!");
    System.out.println("");
    System.out.println("Qual combustível irá querer?");
    System.out.println("");
    System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
    int opcao = sc.nextInt();
    while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
      System.out.println("");
      System.out.println("Código inválido. Tente novamente.");
      opcao = sc.nextInt();
    }
    while (opcao > 0 && opcao < 4){
      if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
      System.out.println("");
      System.out.println("Código inválido. Tente novamente.");
      opcao = sc.nextInt();
      }
      if (opcao == 1){
        alcool = alcool + 1;
        System.out.println("");
        System.out.println("Algo mais?");
        opcao = sc.nextInt();
      }
      if (opcao == 2){
        gasolina = gasolina + 1;
        System.out.println("");
        System.out.println("Algo mais?");
        opcao = sc.nextInt();
      }
      if (opcao == 3){
        diesel = diesel + 1;
        System.out.println("");
        System.out.println("Algo mais?");
        opcao = sc.nextInt();
      }
      while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
        System.out.println("");
        System.out.println("Código inválido. Tente novamente.");
        opcao = sc.nextInt();
      }
   }
      int soma = alcool + gasolina + diesel;
      if (opcao == 4){
      System.out.println("");
      System.out.println("…………………………………………………");
      System.out.println("| Muito obrigado! |");
      System.out.println("…………………………………………………");
      System.out.println("");
      System.out.println("Clientes: ");
      System.out.println("");
      System.out.println("Álcool: "+ alcool);
      System.out.println("Gasolina: "+ gasolina);
      System.out.println("Diesel: "+ diesel);
      System.out.println("");
      System.out.print("Total: " + soma);
    }
      sc.close();
    }
}