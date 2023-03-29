package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dev dev = (Dev) o;

        if (!Objects.equals(nome, dev.nome)) return false;
        if (!Objects.equals(conteudosInscritos, dev.conteudosInscritos))
            return false;
        return Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (conteudosInscritos != null ? conteudosInscritos.hashCode() : 0);
        result = 31 * result + (conteudosConcluidos != null ? conteudosConcluidos.hashCode() : 0);
        return result;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularXp(){}
}
