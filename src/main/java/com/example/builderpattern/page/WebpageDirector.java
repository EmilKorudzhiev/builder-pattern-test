package com.example.builderpattern.page;

import com.example.builderpattern.page.WebPage.WebPageBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebpageDirector {

    public static WebPage createArticleWebPage(String header, String footer) throws IOException {
        return new WebPageBuilder()
                .setHeader(header)
                .setBody("VERY COOL ARTICLE")
                .setFooter(footer)
                .build();
    }
    public static WebPage createFormWebPage(String footer) throws IOException {
        return new WebPageBuilder()
                .setHeader(String.valueOf(Files.readString(Paths.get("D:\\Files\\Codes\\JavaPatternExe\\BuilderPattern\\BuilderPattern\\src\\main\\resources\\templates\\header.html"))))
                .setBody(String.valueOf(Files.readString(Paths.get("D:\\Files\\Codes\\JavaPatternExe\\BuilderPattern\\BuilderPattern\\src\\main\\resources\\templates\\form.html"))))
                .setFooter(footer)
                .build();
    }
}
