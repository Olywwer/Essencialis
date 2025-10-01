package Service;

import org.example.Enum.TipoSanguineo;
import org.example.Model.*;
import org.example.Model.Contato;
import org.example.Model.Documento;
import org.example.Model.Endereco;
import org.example.Model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    public Pessoa gerarPessoaExemplo() {
        Endereco endereco = new Endereco("Rua das Flores", "123", "Mogi das Cruzes", "SP", "08710-000");
        Contato contato = new Contato("Telefone", "(11) 99999-9999");
        Documento documento = new Documento("CPF", "123.456.789-00");
        Filiacao filiacao = new Filiacao("João Silva", "Maria Oliveira");

        return new Pessoa(
                1,
                "Reginaldo",
                List.of(endereco),
                TipoSanguineo.O_POSITIVO,
                List.of(contato),
                List.of(documento),
                filiacao
        );
    }
}
