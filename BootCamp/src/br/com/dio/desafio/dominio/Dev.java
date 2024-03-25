package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> ci = new LinkedHashSet<>();
    private Set<Conteudo> cc = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCi() {
        return ci;
    }

    public void setCi(Set<Conteudo> ci) {
        this.ci = ci;
    }

    public Set<Conteudo> getCc() {
        return cc;
    }

    public void setCc(Set<Conteudo> cc) {
        this.cc = cc;
    }

    public void inscreveBootcamp(BootCamp bootcamp){
            this.ci.addAll(bootcamp.getConteudos());
            bootcamp.getDi().add(this);
    }

    public void progredir(){
          Optional<Conteudo> conteudo = this.ci.stream().findFirst();
          if(conteudo.isPresent()){
              this.cc.add(conteudo.get());
              this.ci.remove(conteudo.get());
          }else{
              System.err.println("Voce não está inscrito em nenhum conteúdo");
          }
    }

    public double calcularXp(){
                return this.cc.stream().mapToDouble(conteudo -> conteudo.calcXp()).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(nome, dev.nome) && Objects.equals(ci, dev.ci) && Objects.equals(cc, dev.cc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ci, cc);
    }
}
