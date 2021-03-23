package br.com.estudo.composite.api;

public class LeafTag implements Tag {

    private String texto;
    private String tagValue;

    public LeafTag(String tagValue) {
        this.tagValue = tagValue;
    }

    public void texto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("<")
                .append(this.tagValue)
                .append(">")
                .append(texto)
                .append("</")
                .append(this.tagValue)
                .append(">");

        return stringBuilder.toString();
    }
}
