//package com.company;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Iterator;
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void switcher(linkedContainer linkedContainer, creationClass creationClass1, XmlWrite xmlWrite, XmlRead xmlRead) throws IOException, ClassNotFoundException, TransformerException, ParserConfigurationException {
        int choose;


        do{
            System.out.println("Choose action ");
            Scanner in = new Scanner(System.in);
            System.out.println("1. Add elem");
            System.out.println("2. Clear container ");
            System.out.println("3. Convert to Array ");
            System.out.println("4. Create new element ");
            System.out.println("5. Serialize ");
            System.out.println("6. Deserialize ");
            System.out.println("7. Xml serialize");
            System.out.println("8. Xml deserialize");
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(linkedContainer.size());
                    linkedContainer.addLast(creationClass1);
                    System.out.println(linkedContainer.size());
                    Sort sort = new Sort();
                    sort.Sort(linkedContainer);
                    break;
             //   case 2:
                    // fillingClass.delete();
               //     linkedContainer.removeByIndex(0);
                 //   break;
                case 2:
                    // fillingClass.cleanElement();
                    linkedContainer.clean();
                    System.out.println(linkedContainer.size());
                    break;
                case 3:

                  // linkedContainer.toArray();

                //System.out.println(linkedContainer.getElementByIndex(0));
                    Object []arr = linkedContainer.toArray().toArray();
                    for(int i=0; i<linkedContainer.size();i++)
                    {
                        System.out.println(arr[i]);
                    }
                    break;
                case 4:
                    Scanner din = new Scanner(System.in);
                    Scanner cin = new Scanner(System.in);
                    System.out.println("Enter company name");
                    String company = din.nextLine();
                    System.out.println("Enter speсialisation");
                    String specialisation=din.nextLine();
                    System.out.println("Enter working Conditions");
                    String workingConditions=din.nextLine();
                    System.out.println("Enter payment");
                    int payment=cin.nextInt();
                    System.out.println("Enter working Experience");
                    int workingExperience=cin.nextInt();
                    System.out.println("Enter education");
                    String education=din.nextLine();
                    creationClass1 = new creationClass(company,specialisation,workingConditions,payment,workingExperience,education);
                    break;
                case 5:
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("store.txt"));
                    objectOutputStream.writeObject(linkedContainer);
                    objectOutputStream.close();
                    break;
                case 6:
                    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("store.txt"));
                    linkedContainer<creationClass> newTravels = (linkedContainer<creationClass>) objectInputStream.readObject();
                    objectInputStream.close();

                    for (creationClass t : newTravels) {
                        System.out.println(t);
                    }

                    break;
                case 7:
                xmlWrite.write(linkedContainer,"XML.xml");

                    break;
                case 8:

                    linkedContainer<creationClass> newXml = XmlRead.read("XML.xml");

                    for(creationClass t : newXml )
                    {
                        System.out.println(t);
                    }

                    //Object []array = newXml.toArray().toArray();
                    //for(int i=0; i<newXml.size();i++)
                    //{
                     //   System.out.println(array[i]);
                    //}

                    break;
                default:

                    break;
            }}while(choose!=9);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, TransformerException, ParserConfigurationException {

        //создание своего линкед листа
        linkedContainer<creationClass> linkedContainer = new linkedContainer<creationClass>();
        XmlWrite xmlWrite = new XmlWrite();
        XmlRead xmlRead = new XmlRead();
        //создание объекта
        Scanner in = new Scanner(System.in);
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter company name");
        String company = in.nextLine();
        System.out.println("Enter speсialisation");
        String specialisation=in.nextLine();
        System.out.println("Enter working Conditions");
        String workingConditions=in.nextLine();
        System.out.println("Enter payment");
        int payment=cin.nextInt();
        System.out.println("Enter working Experience");
        int workingExperience=cin.nextInt();
        System.out.println("Enter education");
        String education=in.nextLine();
        creationClass creationClass1 = new creationClass(company,specialisation,workingConditions,payment,workingExperience,education);


        //delete element by index
        switcher(linkedContainer,creationClass1,xmlWrite, xmlRead);

    }
}
