package PrimeiraPooExercicioSeis.zip;

public class Main{

    public Main() {

    }

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Felipe");
        System.out.println(pessoa.getNome());
        pessoa.setNome("Felipe Cardoso");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(24);
        System.out.println(pessoa.getIdade());


        System.out.println(pessoa.toString());

        }
    }








