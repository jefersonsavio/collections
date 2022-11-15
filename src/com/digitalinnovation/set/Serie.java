package com.digitalinnovation.set;

public class Serie {

    private String nome;
    private String genero;
    private Integer tempoepisodio;

    public Serie(String nome, String genero, Integer tempoepisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoepisodio = tempoepisodio;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoepisodio() {
        return tempoepisodio;
    }

    public void setTempoepisodio(Integer tempoepisodio) {
        this.tempoepisodio = tempoepisodio;
    }

    @Override
    public String toString() {
        return "Serie [nome=" + nome +
                ", genero=" + genero +
                ", tempoepisodio=" + tempoepisodio + "]";

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoepisodio == null) ? 0 : tempoepisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoepisodio == null) {
            if (other.tempoepisodio != null)
                return false;
        } else if (!tempoepisodio.equals(other.tempoepisodio))
            return false;
        return true;
    }

}
