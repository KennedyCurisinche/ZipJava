package rogger.guia.app.zip.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipPersona {

    private final byte[] buffer = new byte[1024];

    public void realizarZIP() throws IOException {

        ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(Paths.get(Constante.ZIP)));

        ZipEntry ze = new ZipEntry(Constante.CSV_NAME);

        zos.putNextEntry(ze);

        FileInputStream in = new FileInputStream(Constante.CSV);

        int len;
        while ((len = in.read(buffer)) > 0) {
            zos.write(buffer, 0, len);
        }

        in.close();
        zos.closeEntry();
        zos.close();

        System.out.println("Hecho");

    }

}
