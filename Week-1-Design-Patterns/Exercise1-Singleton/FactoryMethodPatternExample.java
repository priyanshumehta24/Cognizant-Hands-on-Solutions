interface Document {
    void open();
    void save();
    void close();
    String getType();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document");
    }
    public void save() {
        System.out.println("Saving Word document");
    }
    public void close() {
        System.out.println("Closing Word document");
    }
    public String getType() {
        return "Word Document";
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document");
    }
    public void save() {
        System.out.println("Saving PDF document");
    }
    public void close() {
        System.out.println("Closing PDF document");
    }
    public String getType() {
        return "PDF Document";
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document");
    }
    public void save() {
        System.out.println("Saving Excel document");
    }
    public void close() {
        System.out.println("Closing Excel document");
    }
    public String getType() {
        return "Excel Document";
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        Document wordDoc = wordFactory.createDocument();
        Document pdfDoc = pdfFactory.createDocument();
        Document excelDoc = excelFactory.createDocument();

        System.out.println("Factory Method Pattern Example");
        System.out.println("===============================");

        System.out.println("Created: " + wordDoc.getType());
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        System.out.println("\nCreated: " + pdfDoc.getType());
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        System.out.println("\nCreated: " + excelDoc.getType());
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}