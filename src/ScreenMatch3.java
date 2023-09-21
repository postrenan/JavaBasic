public class ScreenMatch3 {

    public static void main(String[] args){

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double avaliacaoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0 ) / 3;
        //string é uma class String é um tipo
        String sinopseFilme=
                """
                Filme top gun
                Filme de aventura com Brad Pitt.
                Galã dos anos 80
                Ano de lançamento: %d
                Média do filme: %f
                """ .formatted(anoDeLancamento, media) ;


        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Média das avaliações do filme: " + media);
        System.out.println(sinopseFilme);



    }

}
