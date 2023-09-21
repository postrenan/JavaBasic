public class Atv2 {
    public static void main(String[] args) {
        int anoDeLancamento = 2012;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Low";

        if (anoDeLancamento > 2020 ){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Retros que os clientes estão curtindo");
        }

        if(incluidoNoPlano && tipoPlano.equals("Plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Necessário pagamento para assistir");
        }

    }
}
