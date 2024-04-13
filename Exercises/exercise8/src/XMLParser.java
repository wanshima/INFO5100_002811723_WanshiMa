import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLParser {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("src/books.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("Book");
        printBookDetails(nList);

        addNewBook(doc);
    }

    private static void printBookDetails(NodeList nList) {
        System.out.println("----------------------------");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Published Year : " + eElement.getElementsByTagName("publishedYear").item(0).getTextContent());
                System.out.println("Number of Pages : " + eElement.getElementsByTagName("numberOfPages").item(0).getTextContent());
                System.out.println("Author : " + eElement.getElementsByTagName("author").item(0).getTextContent());
            }
        }
    }

    private static void addNewBook(Document doc) {
        Node bookShelf = doc.getFirstChild();

        Element newBook = doc.createElement("Book");
        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode("The Hunter: A Novel"));
        newBook.appendChild(title);

        Element publishedYear = doc.createElement("publishedYear");
        publishedYear.appendChild(doc.createTextNode("2024"));
        newBook.appendChild(publishedYear);

        Element numberOfPages = doc.createElement("numberOfPages");
        numberOfPages.appendChild(doc.createTextNode("474"));
        newBook.appendChild(numberOfPages);

        Element author = doc.createElement("author");
        author.appendChild(doc.createTextNode("Tana French"));
        newBook.appendChild(author);

        bookShelf.appendChild(newBook);

        printBookDetails(bookShelf.getChildNodes());
    }
}
