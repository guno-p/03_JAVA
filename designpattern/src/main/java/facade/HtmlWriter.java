package facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>");
        writer.write(title);
        writer.write("</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>");
        writer.write(title);
        writer.write("</h1>");
        writer.write("\n");
    }

    public void paragraph(String paragraph) throws IOException {
        writer.write("<p>");
        writer.write(paragraph);
        writer.write("</p>");
        writer.write("\n");
    }

    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\"");
        writer.write(href);
        writer.write("\">");
        writer.write(caption);
        writer.write("</a>");
    }

    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, mailaddr);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
