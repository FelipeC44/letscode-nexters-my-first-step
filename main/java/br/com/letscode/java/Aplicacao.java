package br.com.letscode.java;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aplicacao {
    private List<Object> baseItem;

    public static void main(String[] args) throws URISyntaxException {

        Aplicacao app = new Aplicacao();
        app.leituraArquivosMaleCsv();
        app.leituraArquivosFemaleCsv();
        app.atorMaisJovem();
        app.atrizMaisPremiada();

        try {
            app.leituraArquivosMaleCsv();
            app.leituraArquivosFemaleCsv();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void atorMaisJovem() {
        this.baseItem.stream().filter(item ->getCategory().equals(category))

    }

    private void atrizMaisPremiada() {
        this.baseItem.stream().filter(item ->getCategory().equals(category))

    }

    private String leituraArquivosMaleCsv() throws URISyntaxException {
        String filepath = getFilepathFromResourceAsStream("oscar_age_male");
        try (Stream<String> lines = Files.lines(Path.of(filepath))) {
            this.baseItem = lines.skip(1).map(MenuItem::fromLine).collect(Collectors.toList());
            lines.skip(1).map(BaseI tem::fromLine).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    private String leituraArquivosFemaleCsv() throws URISyntaxException {
        String filepath = getFilepathFromResourceAsStream("oscar_age_female");
        try (Stream<String> lines = Files.lines(Path.of(filepath))) {
            this.baseItem = lines.skip(1).map(MenuItem::fromLine).collect(Collectors.toList());
            lines.skip(1).map(BaseItem::fromLine).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();

            private String getFilepathFromResourceAsStream(String fileName) {
                URL url = getClass().getClassLoader().getResource(fileName);
                File file = new File(url.getFile());
                return file.getPath();

            }
        }
    }
}