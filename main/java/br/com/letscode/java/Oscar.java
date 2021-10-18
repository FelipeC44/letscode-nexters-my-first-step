package br.com.letscode.java;

import lombok.Value;

@Value
public class Oscar {
    //1.Quem foi o ator mais jovem a ganhar um Oscar?
    //2.Quem foi a atriz que mais vezes foi premiada?
    //3.Qual atriz entre 20 e 30 anos que mais vezes foi vencedora?
    //4.Quais atores ou atrizes receberam mais de um Oscar? Elabore uma única estrutura contendo atores e atrizes.
    //5.Quando informado o nome de um ator ou atriz, dê um resumo de quantos prêmios ele/ela recebeu e liste ano, idade e nome de cada filme pelo qual foi premiado(a).


    int indice;
     int ano;
     int idade;
     String nome;
     String filme;

    public static BaseItem fromLine(String line){
        String[] split = line.split(";");
        return new BaseItem(
                (Integer.parseInt(split[0].replace("",""),
                (Integer.parseInt(split[1].replace("",""),
                (Integer.parseInt(split[2].replace("",""),
         split[3])),
         split[4]);


    }

}



