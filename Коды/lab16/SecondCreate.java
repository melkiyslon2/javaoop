package sample;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;


public class SecondCreate {//implements Comparable<SecondCreate>, Serializable {


    public SecondCreate()
    {

    }

    private String company;
    private String specialisation;
    private String workingConditions;
    private String payment;
    private String workingExperience;
    private String education;
    private String Licence;
    private String English;

    public SecondCreate(String company, String specialisation, String workingConditions, String payment, String workingExperience, String education, String Licence, String English) {
        this.company = company;
        this.specialisation = specialisation;
        this.workingConditions = workingConditions;
        this.payment = payment;
        this.workingExperience = workingExperience;
        this.education = education;
        this.Licence = Licence;
        this.English = English;
    }


    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment)
    {
        this.payment=payment;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public String getWorkingConditions() {
        return workingConditions;
    }

    public void setWorkingConditions(String workingConditions) {
        this.workingConditions = workingConditions;
    }

    public String getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(String workingExperience) {
        this.workingExperience = workingExperience;
    }

    public String getLicence() {
        return Licence;
    }

    public void setLicence(String licence) {
        Licence = licence;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

   /* @Override
    public String toString() {
        return "SecondCreate{" +
                "company = " + company + "\n" +
                "specialisation =" + specialisation + "\n" +
                "workingConditions='" + workingConditions + "\n" +
                "payment=" + payment + "\n" +
                "workingExperience=" + workingExperience + "\n" +
                "education='" + education + "\n" +
                "Licence='" + Licence + "\n" +
                "English='" + English + "\n" +
                '}';
    }*/

   /* @Override
    public int compareTo(SecondCreate o) {
        SecondCreate entry = (SecondCreate) o;

        int tmp = company.compareTo(entry.company);
        // this.payment - ((SecondCreate)o).payment;
        return tmp;
    }*/
}