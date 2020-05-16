import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlRead {

    public static linkedContainer<SecondCreate> read(String fileName) throws IOException, ParserConfigurationException {

        linkedContainer<SecondCreate> resSome = new linkedContainer<>();
        try {
            // ��������� ����������� ���������
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // ��������� ������ DOM ��������� �� �����
            Document document = documentBuilder.parse(fileName);

            // �������� �������� �������
            Node root = document.getDocumentElement();
            System.out.println(root.getNodeName());
            // ������������� ��� ����������� ��������� - �.�. �����
            NodeList Some = root.getChildNodes();

            String name = new String();
            String specialisation = new String();
            String workingConditions = new String();
            int payment = 0;
            int workingExperience = 0;
            String education = new String();
            String Licence = new String();
            String English = new String();


            for (int i = 0; i < Some.getLength(); i++){
                if(Some.item(i).getNodeType() != Node.TEXT_NODE){

                    if(Some.item(i).getNodeName() == "CompanyName"){
                        name = Some.item(i).getTextContent();
                    }
                    if(Some.item(i).getNodeName() == "Specialisation"){
                        specialisation = Some.item(i).getTextContent();
                    }
                    if(Some.item(i).getNodeName() == "WorkingConditions"){
                        workingConditions = Some.item(i).getTextContent();
                    }
                    if(Some.item(i).getNodeName() == "Payment"){
                        payment = Integer.valueOf(Some.item(i).getTextContent());
                    }
                    if(Some.item(i).getNodeName() == "WorkingExperience"){
                        workingExperience = Integer.valueOf(Some.item(i).getTextContent());
                    }
                    if(Some.item(i).getNodeName() == "Education"){
                        education = Some.item(i).getTextContent();
                    }
                    if(Some.item(i).getNodeName() == "Licence"){
                        Licence = Some.item(i).getTextContent();
                    }
                    if(Some.item(i).getNodeName() == "English"){
                        English = Some.item(i).getTextContent();
                    }

                }

            }
            SecondCreate cq1 = new SecondCreate(name,specialisation,workingConditions,payment,workingExperience,education,Licence,English);
            resSome.addLast(cq1);
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return resSome;
    }
}