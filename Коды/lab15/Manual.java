import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manual {

    public void switchCase() throws IOException, ClassNotFoundException, TransformerException, ParserConfigurationException {
        System.out.println("U have chosen manual mode");
        int choose;

        ArrayList<SecondCreate> arrayList = new ArrayList<SecondCreate>();
        SecondCreate SecondCreate1 = null;

        do{
            System.out.println("Choose action ");
            Scanner in = new Scanner(System.in);
            System.out.println("1. Create new element");
            System.out.println("2. Add elem ");
            System.out.println("3. Clear container ");
            System.out.println("4. Convert to Array ");
            System.out.println("5. Serialize ");
            System.out.println("6. Deserialize ");
            System.out.println("7. Xml serialize");
            System.out.println("8. Xml deserialize");
            System.out.println("9. Search element by criteria");
            System.out.println("10. Delete element by index");
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    Scanner din = new Scanner(System.in);
                    Scanner cin = new Scanner(System.in);
                    System.out.println("Enter company name");
                    String company = din.nextLine();
                    if(company.matches("[a-zA-Z0-9]*")==true)
                    {
                        System.out.println("Name is ok");
                    }else{System.out.println("NOT ok RENAME");company = din.nextLine();}
                    System.out.println("Enter specialisation");
                    String specialisation=din.nextLine();
                    if(specialisation.matches("[0-9]*")==true)
                    {
                        System.out.println("ok");
                    }else{ System.out.println("NOT ok RENAME"); specialisation = din.nextLine();}
                    System.out.println("Enter working Conditions");
                    String workingConditions=din.nextLine();
                    System.out.println("Enter payment");
                    int payment=cin.nextInt();
                    System.out.println("Enter working Experience");
                    int workingExperience=cin.nextInt();
                    System.out.println("Enter education");
                    String education = din.nextLine();
                    System.out.println("Enter knowledge of English");
                    String English = din.nextLine();
                    System.out.println("Enter driving licence");
                    String License = din.nextLine();
                    SecondCreate1 = new SecondCreate(company,specialisation,workingConditions,payment,workingExperience,education,License,English);
                    break;

                case 2:
                    System.out.println(arrayList.size());
                   arrayList.add(SecondCreate1);
                    System.out.println(arrayList.size());

                    for(SecondCreate tmp : arrayList)
                    {
                        System.out.println(tmp);
                    }

                    break;
                case 3:
                    arrayList.clear();
                    System.out.println(arrayList.size());
                    break;
                case 4:
                    Object []arr = arrayList.toArray();
                    for(int i=0; i<arrayList.size();i++)
                    {
                        System.out.println(arr[i]);
                    }
                    break;
                case 5:
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("store.txt"));
                    objectOutputStream.writeObject(arrayList);
                    objectOutputStream.close();

                    break;
                case 6:
                     ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("store.txt"));
                    ArrayList<SecondCreate> newContainer = (ArrayList<SecondCreate>)objectInputStream.readObject();

                     for (SecondCreate t : newContainer) {
                          System.out.println(t);
                     }

                    break;
                case 7:

                    XmlWrite xmlWrite = new XmlWrite();
                    xmlWrite.write(arrayList,"XML.xml");
                    break;
                case 8:
                     ArrayList<SecondCreate> newXml = XmlRead.read("XML.xml");

                     for(SecondCreate t : newXml )
                     {
                        System.out.println(t);
                     }
                     break;
                case 9:
                    for (SecondCreate t : arrayList)
                    {
                        Pattern p1 = Pattern.compile("teacher", Pattern.CASE_INSENSITIVE);
                        Matcher m1 = p1.matcher(t.getSpecialisation());
                        if (m1.find()) {
                            if (t.getWorkingExperience() >= 10) {
                                Pattern p2 = Pattern.compile("yes", Pattern.CASE_INSENSITIVE);
                                Matcher m2 = p2.matcher(t.getEnglish());
                                if (m2.find()) {
                                    Pattern p3 = Pattern.compile("yes", Pattern.CASE_INSENSITIVE);
                                    Matcher m3 = p3.matcher(t.getLicence());
                                    if (m3.find()) {
                                        System.out.println(t);
                                    }
                                }
                            }
                        }
                    }

                    break;
                case 10:
                    Scanner sin = new Scanner(System.in);
                    System.out.println("Enter index of element u want to delete");
                    int index = sin.nextInt();
                    arrayList.remove(0);
                    break;
                default:
                    break;
            }}while(choose!=11);
    }


}
