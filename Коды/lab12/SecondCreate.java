import java.io.Serializable;


public class SecondCreate implements java.lang.Comparable<SecondCreate>, Serializable {

    private String company;
    private String specialisation;
    private String workingConditions;
    private int payment;
    private int workingExperience;
    private String education;
    private String Licence;
    private String English;

    public SecondCreate(String company,String specialisation,String workingConditions,int payment,int workingExperience,String education,String Licence,String English)
    {
        this.company=company;
        this.specialisation=specialisation;
        this.workingConditions=workingConditions;
        this.payment=payment;
        this.workingExperience=workingExperience;
        this.education=education;
        this.Licence=Licence;
        this.English=English;
    }

    public int getPayment()
    {
        return payment;
    }

    public String getSpecialisation()
    {
        return specialisation;
    }

    public String getEducation()
    {
        return education;
    }

    public String getCompany()
    {
        return company;
    }

    public String getWorkingConditions()
    {
        return workingConditions;
    }

    public int getWorkingExperience()
    {
        return  workingExperience;
    }

    public String getLicence()
    {
        return Licence;
    }

    public String getEnglish()
    {
        return English;
    }

    @Override
    public String toString() {
        return "created object{" + "\n" +
                "company name =" + company.toString() + "\n" +
                "specialisation =" + specialisation + "\n" +
                "workingConditions =" + workingConditions +"\n" +
                "payment =" + payment+ "\n" +
                "workingExperience =" + workingExperience + "\n"+
                "education =" + education + "\n" +
                "Licence = " + Licence + "\n" +
                "English =" + English + "\n" +
                '}' + "\n";
    }

    @Override
    public int compareTo(SecondCreate o) {
        SecondCreate entry = (SecondCreate) o;

        int tmp = company.compareTo(entry.company);
        // this.payment - ((SecondCreate)o).payment;
        return tmp;
    }

}
