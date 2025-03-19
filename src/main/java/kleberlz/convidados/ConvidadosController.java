package kleberlz.convidados;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kleberlz.Convidado;

@RestController
@RequestMapping("/")
@CrossOrigin("*") // PERMITE QUE ESSA API RECEBA REQUISIÇÕES DE OUTROS DOMÍNIOS. FACILITA A CONVERSAÇÃO ENTRE CONTAINERS;
public class ConvidadosController {

    @GetMapping
    public List<Convidado> getConvidados(){
        List<Convidado> lista = new ArrayList<Convidado>();
        lista.add(new Convidado("Junior", "43567887699"));
        lista.add(new Convidado("Kleber Luiz", "84326763821"));
        return lista;
    }
    
}
