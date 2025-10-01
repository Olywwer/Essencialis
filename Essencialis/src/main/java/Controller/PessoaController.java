package Controller;

import org.example.Model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @GetMapping("/pessoa")
    public Pessoa getPessoa() {
        // Criando uma pessoa de exemplo
        Pessoa pessoa = new Pessoa("João Silva", "01/01/1990", "Masculino");
        pessoa.addEndereco(new org.example.Model.Endereco("Rua A", "123", "Cidade X", "Estado Y", "12345-678"));
        pessoa.addContato(new org.example.Model.Contato("Telefone", "(11) 91234-5678"));
        pessoa.addContato(new org.example.Model.Contato("Email"));
        pessoa.addDocumento(new org.example.Model.Documento("CPF", "123.456.789-00"));
        pessoa.setFiliacao(new org.example.Model.Filiacao("Carlos Silva", "Ana Souza"));


        return pessoa;
    }
}