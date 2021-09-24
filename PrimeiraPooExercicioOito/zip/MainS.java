package PrimeiraPooExercicioOito.zip;

public class MainS {
    public static void main(String[] args) {

        String[] nomes = {"Joao", "Jose", "Jota", "Junior", "Janio"};
        Double[] alturas = {1.8, 1.88, 1.67, 1.7, 1.77};
        Double[] pesos = {95.0, 65.0, 60.0, 71.8, 102.8};

        for (int i = 0; i < nomes.length; i++) {
            double imc = pesos[i] / Math.pow(alturas[i], 2);
            if (imc < 18.5 || imc > 25) {
                System.out.printf("%s está fora do peso ideal, com IMC = %.2f.%n", nomes[i], imc);
            }
        }
    }
}