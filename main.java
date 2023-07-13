public class main {
    public static void main(String[] args) {
        
        student student1 = new student("tum", 20, "2022", 3.5);
        
        
        student1.showDetails();

        student1.setName("tum");
        student1.setID(20);
        student1.setaddmissionYear(null);
        student1.setGpa(3.5);

        student1.showDetails();


    }
}