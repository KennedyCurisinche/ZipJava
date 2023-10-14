package rogger.guia.app.zip.util;

import org.jetbrains.annotations.NotNull;
import rogger.guia.app.zip.entity.Persona;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Documento {

    public List<File> realizarArchivos(@NotNull List<Persona> personas) throws IOException {

        List<File> files = new ArrayList<>();

        for (Persona p : personas) {

            File file = File.createTempFile(p.getNombre() + "_", Constante.TYPE_CSV);

            files.add(file);

            FileWriter fw = new FileWriter(file);

            fw.write(p.getNombre() + ";" + p.getEdad() + ";" + p.getSueldo() + "\n");

            fw.close();

        }

        return files;

    }


}
