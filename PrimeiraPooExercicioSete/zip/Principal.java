package PrimeiraPooExercicioSete.zip;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pessoas pessoa = new Pessoas();


        System.out.println("Digite seu nome: ");
        pessoa.setNome(entrada.nextLine());
        System.out.println("Digite a idade");
        pessoa.setIdade(entrada.nextInt());


    }

}