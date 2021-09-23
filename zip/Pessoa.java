package PrimeiraPooExercicioSeis.zip;


public class Pessoa {
public static void main(String[] args){

}

     private String nome;
     private int idade;

     public Pessoa(){

     }

     public Pessoa(String name){
         this.nome = name;
     }

     public Pessoa(String name, int age) {
         this.nome = name;
         this.idade = age;

     }
     public String getNome(){
         return nome;
     }
     public void setNome(String nome){
         this.nome = nome;

     }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
