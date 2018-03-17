package main;

import entity.Customer;
import entity.Payment;
import entity.Product;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main (String... args) throws Exception{
        Customer paulo = new Customer("Paulo Silveira");
        Customer rodrigo = new Customer("Rodrigo Turini");
        Customer guilherme = new Customer("Guilherme Silveira");
        Customer adriano = new Customer("Adriano Almeida");

        Product bach = new Product("Bach Completo",
                Paths.get("/music/bach.mp3"), new BigDecimal(100));
        Product poderosas = new Product("Poderosas Anita",
                Paths.get("/music/poderosas.mp3"), new BigDecimal(90));
        Product bandeira = new Product("Bandeira Brasil",
                Paths.get("/images/brasil.jpg"), new BigDecimal(50));
        Product beauty = new Product("Beleza Americana",
                Paths.get("beauty.mov"), new BigDecimal(150));
        Product vingadores = new Product("Os Vingadores",
                Paths.get("/movies/vingadores.mov"), new BigDecimal(200));
        Product amelie = new Product("Amelie Poulain",
                Paths.get("/movies/amelie.mov"), new BigDecimal(100));

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        LocalDateTime lastMonth = today.minusMonths(1);

        Payment payment1 =
                new Payment(asList(bach, poderosas), today, paulo);
        Payment payment2 =
                new Payment(asList(bach, bandeira, amelie), yesterday, rodrigo);
        Payment payment3 =
                new Payment(asList(beauty, vingadores, bach), today, adriano);
        Payment payment4 =
                new Payment(asList(bach, poderosas, amelie), lastMonth, guilherme);
        Payment payment5 =
                new Payment(asList(beauty, amelie), yesterday, paulo);

        List<Payment> payments = asList(payment1, payment2, payment3, payment4, payment5);

        payments.stream()
                .sorted(Comparator.comparing(Payment::getDate))
                .forEach(System.out::println);

        payment1.getProducts().stream()
                .map(Product::getPrice)
                .reduce(BigDecimal::add)
                .ifPresent(System.out::println);
    }
}
