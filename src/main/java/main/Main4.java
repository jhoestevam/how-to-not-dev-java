package main;

public class Main4 {
    public static void main (String... args) throws Exception{
        new Thread(() -> {
            for (int i = 0; i <= 1000; i++){
                System.out.println(i);
            }
        }).start();
    }
}
