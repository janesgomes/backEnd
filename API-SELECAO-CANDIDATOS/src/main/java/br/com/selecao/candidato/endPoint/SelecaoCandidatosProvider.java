package br.com.selecao.candidato.endPoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SelecaoCandidatosProvider {

    @RequestMapping(value = "/validarServicoAtivo", method = RequestMethod.GET)
    public ResponseEntity<?> apiSelecaoCandidatos() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
