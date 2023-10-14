package rogger.guia.app.zip;

import rogger.guia.app.zip.entity.Persona;
import rogger.guia.app.zip.util.Documento;
import rogger.guia.app.zip.util.ZipPersona;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Documento doc = new Documento();
        ZipPersona zip = new ZipPersona();
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 2; i++) {

            personas.add(new Persona(
                            JOptionPane.showInputDialog("Ingrese su nombre"),
                            Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad")),
                            Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"))
                    )
            );

        }

        zip.realizarZIPs(doc.realizarArchivos(personas));

    }

}