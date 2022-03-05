package br.com.dio.aula2;

// Entendendo o que são tipos de dados e quando usar cada um
public class TiposDeDados {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; --> Número muito acima para o tipo short

        // int i1 = -10000000000; --> Número muito abaixo do mínimo para o tipo Inteiro
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        // float f1 = 4.5; --> Apresenta erro, pois o Java está interpretando como um double pois não há o 'f' ao final
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04d;

        char c1 = 'W';
        // char c2 = 'Tw'; --> O tipo 'char' aceita apenas 1 caracter
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Ciclaco";
        String st3 = "Lorem ipsum";

        String dt1 = "05/03/2022"; // Existe o tipo adequado para datas

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
