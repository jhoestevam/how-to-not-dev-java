package entity;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;

import java.math.BigDecimal;
import java.nio.file.Path;

public class Product {

    private String nome;
    private Path file;
    private BigDecimal price;

    public Product(String nome, Path file, BigDecimal price){
        this.nome = nome;
        this.file = file;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Path getFile() {
        return file;
    }

    public void setFile(Path file) {
        this.file = file;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
