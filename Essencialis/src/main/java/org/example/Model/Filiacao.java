package org.example.Model;

public class Filiacao {
    private String nomePai;
    private String nomeMae;

    public Filiacao(String nomePai, String nomeMae) {
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return "Pai: " + nomePai + ", Mãe: " + nomeMae;
    }
}
