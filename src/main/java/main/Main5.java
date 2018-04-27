package main;

import entity.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main5 {

    public static void main(String... args){
        Usuario user1 = new Usuario("Juvenilton", 120);
        Usuario user2 = new Usuario("Joberto", 150);
        Usuario user3 = new Usuario("Dovaldo", 170);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> mostrarMensagem = u ->
                System.out.println("Antes de imprimir os nomes");

        Consumer<Usuario> imprimeNome = u ->
                System.out.println(u.getNome());

        usuarios.forEach(mostrarMensagem.andThen(imprimeNome));
    }
}
