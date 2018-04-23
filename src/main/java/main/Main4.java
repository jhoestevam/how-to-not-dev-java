package main;

public class Main4{
    public static void main (String... args) throws Exception{
        new Thread(() -> {
            for (int i = 0; i <= 1000; i++){
                System.out.println(i);
            }
        }).start();

        Validar<String> validarCEP = new Validar<String>() {
            @Override
            public boolean valida(String s) {
                return s.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validar<String> validarComLambda = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        Validar<String> validarComLambda2 = (valor -> {
            valor = "Alguma coisa";
            return valor.matches("[0-9]{5}-[0-9]{3}");
        });
    }
}
