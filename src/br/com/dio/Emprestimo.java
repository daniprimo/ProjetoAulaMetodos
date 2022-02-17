package br.com.dio;

public class Emprestimo {

    public static int getNumeroParcela2() {
        return 2;
    }

    public static int getNumeroParcela1() {
        return 1;
    }

    public static double getTaxaUmaParcela() {
        return 0.3;
    }

    public static double getTaxaDuasParcela() {
        return 0.45;
    }

    public static void Calcular (double valor, int parcela){

        if (parcela == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcela());

            System.out.println("O Valor final do empréstimo com 2 parcelas é: R$ " + valorFinal);
        }else if (parcela == 1){

            double valorFinal = valor + (valor * getTaxaUmaParcela());

            System.out.println("O Valor final do empréstimo com 1 parcelas é: R$ " + valorFinal);
        }else {
            System.out.printf("Quantidade de parcelas inválida");
        }



    }


}
