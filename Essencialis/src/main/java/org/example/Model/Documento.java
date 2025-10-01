package org.example.Model;

public class Documento {
    private String tipo; // Ex: "CPF", "RG"
    private String numero;

    public Documento(String tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return tipo + ": " + numero;
    }
}
