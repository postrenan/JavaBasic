import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "";
        String accountType = "";
        double balance = 0;
        double booty = 0;
        int option = 0;
        Scanner data = new Scanner(System.in);
        Scanner action = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        name = data.next();
        System.out.println("Digite a sua conta: ");
        accountType = data.next();

        while(option != 4){
            System.out.printf("O que voce quer fazer %s ? ", name);
            System.out.println("""
                    1-Depositar
                    2-Sacar
                    3-Extrato
                    4-Sair
                    """);
            option = action.nextInt();
            if(option == 1) {
                System.out.println("Digite o valor a depositar: ");
                balance += action.nextDouble();
                System.out.printf("Novo saldo: %.2f", balance);
            }
            if(option == 2) {
                System.out.println("Digite o valor a sacar: ");
                booty = action.nextDouble();
                if( booty < balance ){
                    balance -= booty;
                    System.out.printf("Novo saldo: %.2f", balance);
                } else {
                    System.out.println("Valor de saque maior que saldo");
                }
            }
            if(option == 3) {
                System.out.printf("Seu saldo é de : %.2f", balance);
            }

        }

    }
}
