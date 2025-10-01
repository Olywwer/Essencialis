package org.example.Model;

import org.example.Enum.TipoSanguineo;
import java.util.List;

public class Pessoa {

    private int id;
    private String nome;
    private List<Endereco> enderecos;
    private TipoSanguineo tipoSanguineo;
    private List<Contato> contatos;
    private List<Documento> documentos;
    private Filiacao filiacao;

    public Pessoa(int id, String nome, List<Endereco> enderecos, TipoSanguineo tipoSanguineo,
                  List<Contato> contatos, List<Documento> documentos, Filiacao filiacao) {
        this.id = id;
        this.nome = nome;
        this.enderecos = enderecos;
        this.tipoSanguineo = tipoSanguineo;
        this.contatos = contatos;
        this.documentos = documentos;
        this.filiacao = filiacao;
    }

    public Pessoa(String joãoSilva, String nome, String masculino) {
    }

    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
        System.out.println("Endereços:");
        enderecos.forEach(e -> System.out.println("  " + e));
        System.out.println("Contatos:");
        contatos.forEach(c -> System.out.println("  " + c));
        System.out.println("Documentos:");
        documentos.forEach(d -> System.out.println("  " + d));
        System.out.println("Filiação: " + filiacao);
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }


    public void addEndereco(Endereco endereco) {
    }

    public void addContato(Contato telefone) {
    }

    public void setFiliacao(Filiacao filiacao) {
    }

    public void addDocumento(Documento cpf) {
    }
}