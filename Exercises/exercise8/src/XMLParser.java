import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

/**
 * This class demonstrates parsing and manipulating XML files using the DOM API.
 */
public class XMLParser {
    public static void main(String[] args) throws Exception {
        // Load and parse the XML file.
        File inputFile = new File("src/books.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        // Print the root element of the document.
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        // Retrieve a list of all elements tagged as "Book".
        NodeList nList = doc.getElementsByTagName("Book");
        printBookDetails(nList);

        // Add a new book to the document and print details.
        addNewBook(doc);
    }

    /**
     * Prints details of each book in the XML NodeList.
     * @param nList NodeList containing elements tagged as "Book".
     */
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

    /**
     * Adds a new book to the existing XML document and prints the updated list of books.
     * @param doc The DOM Document to which the new book will be added.
     */
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
