package main;

import java.util.Scanner;

public class Main3 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String... args) throws Exception{
        System.out.println("Deseja a respota de qual questao ?");
        Integer questao = scanner.nextInt();
        /**
         * Questao 1
         */
        if (questao == 1){
            System.out.println("Quantidade de cigarro fumado por dia:");
            Integer qtdCigarro = scanner.nextInt();

            System.out.println("Preço (R$) unitario do cigarro:");
            Double prcCigarro = scanner.nextDouble();

            System.out.println(qtdCigarro * 365 * prcCigarro);
        }


        /**
         * Questao 2
         */
        if (questao == 2){
            System.out.println("Valor do frete (R$):");
            Double valorFrete = scanner.nextDouble();
            Double valorEntrega;

            if (valorFrete >= 50 && valorFrete <= 100){
                valorEntrega = (valorFrete * 10) / 100;
                valorFrete += valorEntrega;
                System.out.println("Valor do frete(R$): " + valorFrete);
            }else if (valorFrete >= 101 && valorFrete <= 200){
                valorEntrega = (valorFrete * 5) / 100;
                valorFrete += valorEntrega;
                System.out.println("Valor do frete(R$):" + valorFrete);
            }else{
                System.out.println("Valor frete(R$): " + valorFrete);
            }
        }

        /**
         * Questao 3
         */
        if (questao == 3){
            int valor = 101;

            for (int i = 1; i < valor; i++){
                if (i >= 10 && i <= 30){
                    System.out.println("{"+i+"}");
                }else{
                    System.out.println(i);
                }
            }
        }

        /**
         * Questao 4
         */
        if (questao == 4){
            Integer i = 1;
            Integer valor = 101;

            while (i < valor){
                if (i >= 10 && i <= 30){
                    System.out.println("{"+i+"}");
                }else{
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
