package main;

import entity.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

        Consumer<Usuario> imprimePontos = u ->
                System.out.println(u.getPontos());

        usuarios.forEach(mostrarMensagem.andThen(imprimeNome).andThen(imprimePontos));


        Predicate<Usuario> predicado = new Predicate<Usuario>() {
            @Override
            public boolean test(Usuario usuario) {
                return usuario.getPontos() > 140;
            }
        };

        List<Usuario> usuariosPredicate = new ArrayList<>();
        usuariosPredicate.add(user1);
        usuariosPredicate.add(user2);
        usuariosPredicate.add(user3);

        usuariosPredicate.removeIf(predicado);
        usuariosPredicate.forEach(u -> System.out.println(u.getNome()));
    }
}
