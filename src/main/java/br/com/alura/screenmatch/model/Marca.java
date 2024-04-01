package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Marca(
        @JsonAlias("codigo") Integer codigo,
        @JsonAlias("nome") String nome){
    @Override
    public String toString() {
        return "Marca{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
