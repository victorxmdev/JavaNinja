package Desafio1;

public class desafio1 {
    public static void main(String[] args) {

        //NINJA1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 15;
        String missaoNinja1 = "Encontrar bandido";
        String statusNinja1;
        char nivelMissao1 = 'C';

        if(idadeNinja1 < 15) {
            if (nivelMissao1 == 'C' || nivelMissao1 == 'D') {
                statusNinja1 = "Missão Concluida";
            } else {
                statusNinja1 = "Não concluida, idade insuficiente" ;
            }
        } else {
            statusNinja1 = "Missão Concluida";
        }

        System.out.println("NINJA 1");
        System.out.println("Nome: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Status: " + statusNinja1);
        System.out.println("Nivel Missao: " + nivelMissao1 + "\n");

        //NINJA2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 12;
        String missaoNinja2 = "Reconhecimento da aldeia";
        String statusNinja2;
        char nivelMissao2 = 'S';

        if(idadeNinja2 < 12) {
            if (nivelMissao2 == 'C' || nivelMissao2 == 'D') {
                statusNinja2 = "Missão Concluida";
            } else {
                statusNinja2 = "Não concluida, idade insuficiente" ;
            }
        } else {
            statusNinja2 = "Missão Concluida";
        }

        System.out.println("NINJA 2");
        System.out.println("Nome: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Status: " + statusNinja2);
        System.out.println("Nivel Missao: " + nivelMissao2 + "\n");

        //NINJA3
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 12;
        String missaoNinja3 = "Curar feridos da guerra";
        String statusNinja3;
        char nivelMissao3 = 'D';

        if(idadeNinja3 <= 12) {
            if (nivelMissao3 == 'C' || nivelMissao3 == 'D') {
                statusNinja3 = "Missão Concluida";
            }
            else {
                statusNinja3 = "Não concluida, idade insuficiente" ;
            }
        } else {
            statusNinja3 = "Missão Concluida";
        }

        System.out.println("NINJA 3");
        System.out.println("Nome: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missao: " + missaoNinja3);
        System.out.println("Status: " + statusNinja3);
        System.out.println("Nivel Missao: " + nivelMissao3 + "\n");
    }
}
