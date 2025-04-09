package dsw.sigconbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //Permite codigo limpio: geter y seter - constructor
@Entity //Permite CRUD: crear o update
@Builder//Patron
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ubigeo")

public class Ubigeo {        // PascalCase
    @Id
    @Column(name="idubigeo")
    private String idUbigeo; // camelCase
    private String departamento;
    private String provincia;
    private String distrito;
}
