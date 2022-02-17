package br.com.dio;

public class Menssagem {

    public static void soltaMenssagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                menssagemBomDia();
                break ;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                menssagemBoaTarde();
                break ;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 1:
            case 2:
            case 3:
            case 4:
                menssagemBoaNoite();
                break;
            default:
                System.out.println("Deu Erro!  Por gentileza digitar um horario valido");
                break ;
        }

    }

    public static void menssagemBomDia() {
        System.out.println("Bom Dia!");
    }

    public static void menssagemBoaTarde() {
        System.out.println("Bom Tarde!");
    }

    public static void menssagemBoaNoite() {
        System.out.println("Boa Noite!");
    }


}
