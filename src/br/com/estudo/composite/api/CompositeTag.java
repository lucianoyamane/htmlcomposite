package br.com.estudo.composite.api;

import java.util.ArrayList;
import java.util.List;

public class CompositeTag implements Tag {

    private List<Tag> tags;
    private String tagValue;

    public CompositeTag(String tagValue) {
        this.tags = new ArrayList<>();
        this.tagValue = tagValue;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }

    @Override
    public String toHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("<")
                .append(this.tagValue)
                .append(">");

        for (Tag tag : this.tags) {
            stringBuilder.append(tag.toHtml());
        }

        stringBuilder.append("</")
                .append(this.tagValue)
                .append(">");;
        return stringBuilder.toString();
    }
}
