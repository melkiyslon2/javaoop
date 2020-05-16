import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.*;

public class Auto {

    public void auto() throws FileNotFoundException {

        File file = new File("file.txt");

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] array = line.split(" ");

        String company = null;
        String specialisation = null;
        String workingConditions = null;
        int payment = 0;
        int workingExperience = 0;
        String education = null;
        String English = null;
        String Licence = null;


        for (int i = 0; i < array.length; i++) {
            company = array[0].toString();
            specialisation = array[1].toString();
            workingConditions = array[2].toString();
            payment = Integer.parseInt(array[3]);
            workingExperience = Integer.parseInt(array[4]);
            education = array[5].toString();
            Licence = array[6].toString();
            English = array[7].toString();
        }


        SecondCreate firstWorker = new SecondCreate(company, specialisation, workingConditions, payment, workingExperience, education,Licence,English);
        SecondCreate secondCreate = new SecondCreate("epam", "teacher", "good", 100, 1, "none","no","no");
        SecondCreate thirdWorker = new SecondCreate("globalLogic","teacher","10.00-19.00",300,11,"magistry","yes","yes");

        SecondCreate[] arr = {firstWorker, secondCreate,thirdWorker};


        System.out.println("SORT BY COMPANY NAME");
        Arrays.sort(arr);

        for (SecondCreate tmp : arr) {
            System.out.println(tmp);
        }
        comparatorC comparatorC = new comparatorC();


        System.out.println("SORT BY Specialisation");
        Arrays.sort(arr,comparatorC);

        for(SecondCreate tmpss : arr)
        {
            System.out.println(tmpss);
        }


        System.out.println("SORT BY EDUCATION");

        secondComparator secondComparator = new secondComparator();
        Arrays.sort(arr,secondComparator);

        for(SecondCreate tmpp : arr)
        {
            System.out.println(tmpp);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(firstWorker);
        // linkedContainer.addLast(secondCreate);
        // linkedContainer.addLast(thirdWorker);
        System.out.println("Container size");
        System.out.println(arrayList.size());

    }

}
