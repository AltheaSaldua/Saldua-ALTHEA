
public class Students extends Person {
    private String gradeLevel;

    public Students(String name, int Id, String gradeLevel) {
      
        super(name, Id);
        this.gradeLevel = gradeLevel;
    }

    public void displayInfo() {
       
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}
