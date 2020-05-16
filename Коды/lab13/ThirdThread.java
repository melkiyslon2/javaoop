import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdThread implements Runnable {

    linkedContainer<SecondCreate> linkedContainer;

    public ThirdThread(linkedContainer<SecondCreate> linkedContainer)
    {
        this.linkedContainer = linkedContainer;
    }


    @Override
    public void run() {
        for (SecondCreate t : linkedContainer)
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
    }

}