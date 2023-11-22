package com.example.builderpattern.mainpage;

import com.example.builderpattern.page.WebPage;
import com.example.builderpattern.page.WebpageDirector;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class PageController {

    //ne mi se zanimava da pravq hybav site

    @GetMapping("article/")
    public String getArticle(Model model) throws IOException {
        WebPage page = WebpageDirector.createArticleWebPage("gfsfdsf", "gfdgdfgd");
        model.addAttribute("page", page);
        return "page";
    }

    @GetMapping("form/")
    public String getForm(Model model) throws IOException {
        WebPage page = WebpageDirector.createFormWebPage("gfsfdsf");
        model.addAttribute("page", page);
        return "page";
    }

}
