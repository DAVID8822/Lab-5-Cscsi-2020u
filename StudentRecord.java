package csci2020u.lab05;

public class StudentRecord {

    String SID;
    float assignmentGrade;
    float midtermGrade;
    float finalexamGrade;
    double finalmark;
    char letterGrade;

    public StudentRecord(String studentNumber,float assignmentGrade, float midtermGrade, float finalexamGrade){
        this.SID = studentNumber;
        this.midtermGrade = midtermGrade;
        this.finalexamGrade = finalexamGrade;
        this.assignmentGrade = assignmentGrade;


        this.finalmark += finalexamGrade * 0.5;
        this.finalmark += assignmentGrade*0.2;
        this.finalmark += midtermGrade * 0.3;



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
        else if (this.finalmark < 50){
            letterGrade = 'F';
        }


    }

    public String getStudentNumber(){
        return SID;

    }
    public float getAssignments(){
        return assignmentGrade;
    }
    public float getMidterm(){
        return midtermGrade;
    }
    public float getFinalexam(){
        return finalexamGrade;
    }
    public double getFinalmark(){
        return finalmark;
    }
    public char getLetterGrade(){
        return letterGrade;
    }

}