package com.company;

public class nSei {
    public static void main(String[] args) {
        System.out.println("Hora do dia");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);

        System.out.println("Calculo quadrilateros");
        Quadrilatero.area(5);
        Quadrilatero.area(10,8);
        Quadrilatero.area(5,10,15);

        System.out.println("Calculo Emprestimos");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000, 5);















        /*System.out.println("Exercicio calculadora");
        Calculadora.soma(5,2);
        Calculadora.multiplicacao(7.2,3);
        Calculadora.subtracao(10,6);
        Calculadora.divisao(80,2.5);*/
    }
}