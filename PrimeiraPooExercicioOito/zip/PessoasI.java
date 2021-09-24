package PrimeiraPooExercicioOito.zip;

public class PessoasI {

    public PessoasI() {
    }

         private static String nomes;
         private Double alturas;
         private Float pesos;

         public static String getNome() {
             return nomes;
         }
         public void setNomes(String nomes) {
             this.nomes = nomes;
         }

         public Double getAlturas() {
             return alturas;
         }
         public void setAlturas(Double alturas) {
             this.alturas = alturas;
         }
         public static Float getPesos() {
             return getPesos();
         }
         public void setPesos(Float pesos){

    }

    @Override
    public String toString() {
        return "PessoasI{" +
                "alturas=" + alturas +
                ", pesos=" + pesos +
                '}';
    }
}

//Reescreva a questão 8 da Lista 3 usando POO "Escreva um programa que lê nome,
// peso e altura de 5 pessoas, calcula o IMC de cada um e ao final informa se
// alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25)."