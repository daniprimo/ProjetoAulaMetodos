package br.com.dio;

public class main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicios Calculadora");
        Calculadora.soma(5,8);
        Calculadora.subtracao(8,3);
        Calculadora.mutiplicacao(8,3);
        Calculadora.divisao(15,3);

        //Menssagem
        System.out.println("Exercicios Menssagem");
        Menssagem.soltaMenssagem(2);
        Menssagem.soltaMenssagem(13);
        Menssagem.soltaMenssagem(4);
        Menssagem.soltaMenssagem(8);
        Menssagem.soltaMenssagem(23);

        //Eprestimo
        System.out.println("Exercicios do Emprestimo");
        Emprestimo.Calcular(1000,Emprestimo.getNumeroParcela2());
        Emprestimo.Calcular(1000,Emprestimo.getNumeroParcela1());
        Emprestimo.Calcular(1000,3);


    }
}
