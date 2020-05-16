import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;



public class creationClass implements Comparable<creationClass> ,Serializable {

    private String company;
    private String specialisation;
    private String workingConditions;
    private int payment;
    private int workingExperience;
    private String education;


    creationClass(String company, String specialisation, String workingConditions, int payment, int workingExperience, String education)
    {
        this.company=company;
        this.specialisation=specialisation;
        this.workingConditions=workingConditions;
        this.payment=payment;
        this.workingExperience=workingExperience;
        this.education=education;
    }


    //public void setCompany(String company)
    {
        this.company=company;
    }
    public String getCompany()
    {
        return company;
    }

    public String getSpecialisation()
    {
        return specialisation;
    }

    //public void setSpecialisation(String specialisation)
    {
        this.specialisation=specialisation;
    }

    public String getWorkingConditions()
    {
        return workingConditions;
    }

    //public void setWorkingConditions(String workingConditions)
    {
        this.workingConditions=workingConditions;
    }

    public int getPayment()
    {
        return payment;
    }

    //public void setPayment(int payment)
    {
        this.payment=payment;
    }

    public int getWorkingExperience()
    {
        return workingExperience;
    }

    //public void setWorkingExperience(int workingExperience)
    {
        this.workingExperience=workingExperience;
    }

    public String getEducation()
    {
        return education;
    }

    //public void setEducation(String education)
    {
        this.education=education;
    }

    //public void Print()
    {
        System.out.println(getCompany());
    }

    @Override
    public String toString() {
        return "created object{" + "\n" +
                "company name =" + company.toString() + "\n" +
                "specialisation =" + specialisation + "\n" +
                "working conditions =" + workingConditions + "\n" +
                "working experience=" + workingExperience + "\n" +
                "education =" + education + "\n" +
                "payment = " + payment + "\n" +
                '}' + "\n";
    }


    @Override
    public int compareTo(creationClass o) {


          return (this.workingExperience-o.workingExperience);
    }

}

