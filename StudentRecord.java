package csci2020u.lab05;

public class StudentRecord {

    String SID;
    float assignments;
    float midterm;
    float finalexam;
    double finalmark;
    char letterGrade;

    public StudentRecord(String studentNumber,float assignmentGrade, float midtermGrade, float examGrade){
        this.SID = studentNumber;
        this.midterm = midtermGrade;
        this.finalexam = examGrade;
        this.assignments = assignmentGrade;


        this.finalmark += finalexam * 0.5;
        this.finalmark += assignments*0.2;
        this.finalmark += midterm * 0.3;



        if (this.finalmark >= 80){
            letterGrade = 'A';
        }
        else if (this.finalmark <= 79 && this.finalmark >= 70){
            letterGrade = 'B';
        }
        else if (this.finalmark <= 69 && this.finalmark >= 60){
            letterGrade = 'C';
        }
        else if (this.finalmark <= 59 && this.finalmark >= 50){
            letterGrade = 'D';
        }
        else{
            letterGrade = 'F';
        }


    }

    public String getStudentNumber(){
        return SID;

    }
    public float getAssignments(){
        return assignments;
    }
    public float getMidterm(){
        return midterm;
    }
    public float getFinalexam(){
        return finalexam;
    }
    public double getFinalmark(){
        return finalmark;
    }
    public char getLetterGrade(){
        return letterGrade;
    }

}