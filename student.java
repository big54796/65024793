public class student {
    
    private String Name;
    private int ID;
    private String addmissionYear;
    private double GPA;
    
    
    public student(String Name, int ID, String addmissionYear, double GPA) {
        this.Name = Name;
        this.ID = ID;
        this.addmissionYear = addmissionYear;
        this.GPA = GPA;
    }

    public void showDetails() {
      System.out.println("Name: " +Name);
      System.out.println("ID: " +ID);
      System.out.println("addmissionYear: " + addmissionYear);
      System.out.println("GPA: " +GPA);
    }
    
    
    public String getName() {
        return Name;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getaddmissionYear() {
        return addmissionYear;
    }
    
    public double getGPA() {
        return GPA;
    }
    
   
    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setaddmissionYear(String addmissionYear) {
        this.addmissionYear = addmissionYear;
    }
    
    public void setGpa(double GPA) {
        this.GPA = GPA;
    }
    
    
    public void displayInformation() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + ID);
        System.out.println("Student ID: " + addmissionYear);
        System.out.println("GPA: " + GPA);
    }
}



