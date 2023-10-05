package rogger.guia.app.zip.util;

import org.jetbrains.annotations.NotNull;
import rogger.guia.app.zip.entity.Persona;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Documento {

    public void realizarNotaPersona(@NotNull List<Persona> persona) throws IOException {

        FileWriter fw = new FileWriter(Constante.CSV);

        fw.write("NOMBRE;EDAD\n");

        for (Persona p : persona) {
            fw.write(p.getNombre() + ";" + p.getEdad() + "\n");
        }

        fw.close();

    }


}
