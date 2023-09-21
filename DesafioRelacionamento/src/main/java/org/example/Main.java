package org.example;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(
                "02312",
                "Nome baum",
                "Diego",
                300);
        Livro livro2 = new Livro(
                "02409",
                "1984",
                "Diego",
                390);
        System.out.println(livro.calcularPeso());
        System.out.println(livro2.calcularPeso());
        Prateleira prat = new Prateleira(50, 200.02);
        prat.adicionarLivro(livro);
        prat.adicionarLivro(livro2);
        System.out.println(prat);
        System.out.println("Peso total: %f".formatted(prat.pesoTotal()));
        prat.mostrarLivros();
        prat.removerLivro("02312");
        prat.mostrarLivros();

        System.out.println("Pesquisando");
        System.out.println(prat.getLivroPeloNome("1984"));

        System.out.println("Peso total: %f".formatted(prat.pesoTotal()));
    }

}