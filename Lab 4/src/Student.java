public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade(){
        double s = (mScore*0.4) + (fScore*0.4) + 20;
        char grade = 0;
        if (s < 50){
            grade = 'F';
        } else if (50 <= s && s < 60) {
            grade = 'D';
        } else if (60 <= s && s < 70) {
            grade = 'C';
        } else if (70 <= s && s < 80) {
            grade = 'B';
        } else if (80 <= s) {
            grade = 'A';
        }
        System.out.println("Your grade is " + grade + ".");
    }
}
