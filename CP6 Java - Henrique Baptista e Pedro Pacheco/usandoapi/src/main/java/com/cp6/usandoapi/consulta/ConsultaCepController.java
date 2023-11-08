package com.cp6.usandoapi.consulta;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cp6.usandoapi.resultado.CepResultadoDTO;

@RestController
@RequestMapping("consulta-cep")
public class ConsultaCepController {

  @GetMapping("{cep}")
  public CepResultadoDTO consultaCep (@PathVariable("cep") String cep) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<CepResultadoDTO> resp =
      restTemplate
      .getForEntity(
        String.format("https://viacep.com.br/ws/%s/json", cep),
        CepResultadoDTO.class);
    System.out.println(resp.getBody());
    return resp.getBody();
  }

}
