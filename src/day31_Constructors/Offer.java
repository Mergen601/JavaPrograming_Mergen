package day31_Constructors;

public class Offer {
    public String location, jobTitle, CompanyName;
    public double salary;
    public boolean hasBenefit, hasPto, isWFH, isFullTime;


    public void  setInfo(String location, String jobTitle, String companyName, double salary, boolean hasBenefit,
                         boolean hasPto, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.jobTitle = jobTitle;
        CompanyName = companyName;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPto = hasPto;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPto=" + hasPto +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
