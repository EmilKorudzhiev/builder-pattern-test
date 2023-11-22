package com.example.builderpattern.page;

import lombok.Getter;

@Getter

public class WebPage {
    private String header;
    private String body;
    private String footer;

    private WebPage(WebPageBuilder builder) {
        this.header = builder.header;
        this.body = builder.body;
        this.footer = builder.footer;
    }

    public static class WebPageBuilder{
        private String header;
        private String body;
        private String footer;

        public WebPageBuilder setHeader(String header) {
            this.header = header;
            return this;
        }

        public WebPageBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public WebPageBuilder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public WebPage build(){
            return new WebPage(this);
        }
    }
}
