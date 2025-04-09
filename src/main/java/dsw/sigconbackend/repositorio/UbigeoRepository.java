package dsw.sigconbackend.repositorio;

import dsw.sigconbackend.model.Ubigeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, String>{
    
}
