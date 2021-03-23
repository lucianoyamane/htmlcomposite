package br.com.estudo.composite;

import br.com.estudo.composite.api.LeafTag;

public class MainRun {

    public static void main(String[] args) {
        String esperado = "<div>\n" +
                "  <h1>This is a Heading</h1>\n" +
                "  <p>This is a paragraph.</p>\n" +
                "  <p>Edit the code in the window to the left, and click \"Run\" to view the result.</p>\n" +
                "  <div>\n" +
                "  \t<p>This is a sub paragraph.</p>\n" +
                "  </div>\n" +
                "</div>";
        System.out.println("***********ESPERADO****************");
        System.out.println(esperado);

        System.out.println("***********RESULTADO****************");

        H1LeafTag h1LeafTag = new H1LeafTag();
        h1LeafTag.texto("This is a Heading");
        String resultado = h1LeafTag.toHtml();
        System.out.println(resultado);

        PLeafTag pLeafTag = new PLeafTag();
        pLeafTag.texto("This is a paragraph.");
        System.out.println(pLeafTag.toHtml());

        PLeafTag pLeafTag2 = new PLeafTag();
        pLeafTag2.texto("Edit the code in the window to the left, and click \"Run\" to view the result.");
        System.out.println(pLeafTag2.toHtml());


        DivCompositeTag divCompositeTagSub = new DivCompositeTag();
        PLeafTag pleafTag1 = new PLeafTag();
        pleafTag1.texto("This is a sub paragraph.");

        divCompositeTagSub.addTag(pleafTag1);


        DivCompositeTag divCompositeTag = new DivCompositeTag();
        divCompositeTag.addTag(h1LeafTag);
        divCompositeTag.addTag(pLeafTag);
        divCompositeTag.addTag(pLeafTag2);
        divCompositeTag.addTag(divCompositeTagSub);


        System.out.println(divCompositeTag.toHtml());
    }
}
