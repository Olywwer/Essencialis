package Controller;

import Service.PessoaService;
import org.example.Enum.TipoSanguineo;
import org.example.Model.*;

import org.testng.annotations.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(PessoaController.class)
class PessoaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PessoaService pessoaService;

    @Test
    void deveRetornarPessoaMockada() throws Exception {
        Pessoa pessoaMock = new Pessoa(
                1,
                "Reginaldo",
                List.of(new Endereco("Rua das Flores", "123", "Mogi das Cruzes", "SP", "08710-000")),
                TipoSanguineo.O_POSITIVO,
                List.of(new Contato("Telefone", "(11) 99999-9999")),
                List.of(new Documento("CPF", "123.456.789-00")),
                new Filiacao("João Silva", "Maria Oliveira")
        );

        Mockito.when(pessoaService.gerarPessoaExemplo()).thenReturn(pessoaMock);

        mockMvc.perform(get("/pessoa"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value("Reginaldo"))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.filiacao.nomePai").value("João Silva"))
                .andExpect(jsonPath("$.filiacao.nomeMae").value("Maria Oliveira"));
    }
}
