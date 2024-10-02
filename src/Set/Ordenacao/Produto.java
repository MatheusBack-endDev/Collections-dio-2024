package Set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int qtd;

    public Produto(String nome, long cod, double preco, int qtd) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.qtd = qtd;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }



    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", qtd=" + qtd +
                '}';
    }
}

class ComparePorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto produto, Produto t1) {
        return Double.compare(produto.getPreco(), t1.getPreco());
    }
}
