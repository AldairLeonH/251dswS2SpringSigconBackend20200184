package dsw.sigconbackend.controller;

import dsw.sigconbackend.model.Ubigeo;
import dsw.sigconbackend.service.UbigeoService;
import dsw.sigconbackend.service.utils.ErrorResponse;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="api/v1/ubigeo")
public class UbigeoController {
    private final Logger logger=LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    UbigeoService ubigeoService;
    
    @GetMapping
    public ResponseEntity<?> getTipoDocumento(){
        List<Ubigeo> listaUbigeo=null;
        try{
            listaUbigeo=ubigeoService.getUbigeo();
            
        }catch(Exception e){
            logger.error("Error inesperado",e);
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if(listaUbigeo.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponse.builder().message("TipoDocumento not found").build());
        return ResponseEntity.ok(listaUbigeo);        
    }

}
