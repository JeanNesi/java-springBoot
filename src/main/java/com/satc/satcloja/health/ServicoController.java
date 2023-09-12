package com.satc.satcloja.health;

import com.satc.satcloja.model.Produto;
import com.satc.satcloja.model.Servico;
import com.satc.satcloja.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicoController {

    @Autowired
    public ServicoRepository servicoRepository;

    @GetMapping("/servico")
    public String servicoService() {
        Servico servico = new Servico();
        servico.setQuantidadeHoras(20.00);
        servico.setDescricao("Instalação Office");
        servico.setEstocavel(Boolean.TRUE);
        servico.setValorUnitario(150.00);

        servicoRepository.save(servico);




        return "Comando executado: " + servico.getId();
    }
}
