package rogger.guia.app.zip.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    private String nombre;
    private Integer edad;
    private Double sueldo;

}
