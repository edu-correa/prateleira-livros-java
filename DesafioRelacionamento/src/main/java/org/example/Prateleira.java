package org.example;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private List<Livro> livros;
    private Integer limite;
    private Double peso;

    public Prateleira(Integer limite, Double peso) {
        this.limite = limite;
        this.peso = peso;
        this.livros = new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void adicionarLivro(Livro livro){
        if (this.limite > this.livros.size()){
            livros.add(livro);
        }else{
            System.out.println("Prateleira cheia");
        }
    }
    public Integer quantidadeLivros(){
        return livros.size();
    }

    public Double pesoTotal(){
        Double pesoTotal_ = this.peso;
        for(Livro livro : livros){
            pesoTotal_ += livro.calcularPeso();
        }
        return pesoTotal_;
    }

    public Integer espacoRestante(){
        return this.limite - this.livros.size();
    }

    public void mostrarLivros(){
        for (Livro liv : livros){
            System.out.println(liv.getNome());
        }
        System.out.println("-".repeat(20));
    }

    public void removerLivro(String codigo){
        for (int i = 0; i < livros.size(); i++){
            if (livros.get(i).getCodigo().equals(codigo)){
                livros.remove(i);
            }
        }
    }

    public Livro getLivroPeloNome(String nome){
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getNome().equals(nome)){
                return livros.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prateleira{" +
                "livros=" + livros +
                ", limite=" + limite +
                ", peso=" + peso +
                '}';
    }
}
