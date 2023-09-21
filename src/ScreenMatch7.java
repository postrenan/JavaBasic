import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while(nota != -1 ){
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar a avaliação");
            nota = leitura.nextDouble();

            if(nota > 0){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média das avaliações: " + mediaAvaliacao / totalDeNotas);
    }
}
