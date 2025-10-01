package org.example.Model;

public class Contato {
    private String tipo; // Ex: "Telefone", "Email"
    private String valor;

    public Contato(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public Contato(String email) {
    }

    @Override
    public String toString() {
        return tipo + ": " + valor;
    }
}
