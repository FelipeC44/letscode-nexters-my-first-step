package PrimeiraPooExercicioSete.zip;

public class Pessoas {

    private static String nome;
    private Integer idade;

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\n"+ "Nome: "+nome+"" +
                "\n"+"Idade: "+idade+"\n";
    }
}

//Reescreva a questão 7 da Lista 3 usando POO
// "Escreva um programa que lê nome e idade de 5 pessoas e ao final informa
// quem é o mais novo, o mais velho e qual a média de idade."

