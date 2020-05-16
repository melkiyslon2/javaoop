import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class XmlWrite {

    static public void write(linkedContainer<creationClass> linkedContainer1, String fileName) throws ParserConfigurationException, TransformerException, FileNotFoundException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        for(creationClass cc : linkedContainer1)
        {
        Element Creation = document.createElement("CreatedWorker");
        Element company = document.createElement("CompanyName");
        Element specialisation = document.createElement("Specialisation");
        Element workingConditions = document.createElement("WorkingConditions");
        Element payment = document.createElement("Payment");
        Element workingExperience = document.createElement("WorkingExperience");
        Element education = document.createElement("Education");


        document.appendChild(Creation);
        Creation.appendChild(company);
        Creation.appendChild(specialisation);
        Creation.appendChild(workingConditions);
        Creation.appendChild(payment);
        Creation.appendChild(workingExperience);
        Creation.appendChild(education);

        company.appendChild(document.createTextNode(cc.getCompany()));
        specialisation.appendChild(document.createTextNode(cc.getSpetialisation()));
        workingConditions.appendChild(document.createTextNode(cc.getWorkingConditions()));
        payment.appendChild(document.createTextNode(Integer.toString(cc.getPayment())));
        workingExperience.appendChild(document.createTextNode(Integer.toString(cc.getWorkingExperience())));
        education.appendChild(document.createTextNode(cc.getEducation()));

        }

        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("XML.xml")));

    }
}
