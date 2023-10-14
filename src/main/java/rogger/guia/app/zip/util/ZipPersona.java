package rogger.guia.app.zip.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipPersona {

    private final byte[] buffer = new byte[1024];
    private String name = "";

    public void realizarZIPs(List<File> files) throws IOException {

        ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(Paths.get(Constante.ZIP)));

        for (File file : files) {

            name = file.getName().split("_")[0];

            zos.putNextEntry(new ZipEntry(name + Constante.TYPE_CSV));

            FileInputStream fis = new FileInputStream(file.getPath());

            int len;
            while ((len = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }

            zos.closeEntry();

            fis.close();

        }

        zos.close();

        System.out.println("Hecho archivo " + Constante.ZIP_NAME);

    }

}
