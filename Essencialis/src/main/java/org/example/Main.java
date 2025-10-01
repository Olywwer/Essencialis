package org.example;
import org.example.Model.*;
import org.example.Enum.TipoSanguineo;
import org.example.Model.*;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", "123", "Mogi das Cruzes", "SP", "08710-000");
        Contato contato = new Contato("Telefone", "(11) 99999-9999");
        Documento documento = new Documento("CPF", "123.456.789-00");
        Filiacao filiacao = new Filiacao("João Silva", "Maria Oliveira");

        Pessoa pessoa = new Pessoa(
                1,
                "Reginaldo",
                List.of(endereco),
                TipoSanguineo.O_POSITIVO,
                List.of(contato),
                List.of(documento),
                filiacao
        );

        pessoa.exibirDados();
    }
}