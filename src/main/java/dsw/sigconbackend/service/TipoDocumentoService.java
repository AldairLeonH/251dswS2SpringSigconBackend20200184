package dsw.sigconbackend.service;

import dsw.sigconbackend.model.TipoDocumento;
import dsw.sigconbackend.repositorio.TipoDocumentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoService {
    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;
    
    public List<TipoDocumento> getTipoDocumento(){
        return  tipoDocumentoRepository.findAll();
    }
}
