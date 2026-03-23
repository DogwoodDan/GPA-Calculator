import java.text.DecimalFormat;
import java.util.Scanner;
public class GPAcalcConstructor{
private double classNumber;
//initializing all the variables these constructors need.
Scanner scan=new Scanner(System.in);
private int classesAdded;
double GPAtotal=0;
double creditHours=0.0;
double creditHourGetter;
DecimalFormat decForm=new DecimalFormat("0.##");
private String studentName="Student";

//this is the method that calculated a student's grade.
    public double GPAcalcConstructor(){

//gets the number of classes the student is calculating.
        System.out.println("Please enter how many classes this student has taken thus far");
        classNumber=scan.nextDouble();
        double CNGet=classNumber;

/*these if-statements are just making the user experience better by showing that something
is happening*/
        while (classNumber>=1){
            if (classNumber==CNGet){
                System.out.println("\nPlease enter the first class's grade");
            }
            if (classNumber==1){
                System.out.println("\nPlease enter the last class's grade");
            }
            if(classNumber<CNGet && classNumber!=1){
                System.out.println("\nPlease enter the next class's grade");
            }
            classesAdded=scan.nextInt();
            classNumber--;

// gets the number of credit hours the student has in each class.
            System.out.println("How many credit hours was the class?");
            creditHourGetter=scan.nextDouble();
            creditHours+=creditHourGetter;

/*this adds the appropriate amount of points to their GPA, depending on their grade
and credit hours*/
          if(classesAdded>=95){// A+/A
              GPAtotal+=4*creditHourGetter;
          }
          if((classesAdded>=90) && (classesAdded<95)) {// A-
              GPAtotal += 3.7*creditHourGetter;
          }
          if (classesAdded>85 && classesAdded<90){// B+
              GPAtotal+=3.3*creditHourGetter;
          }
          if (classesAdded==85){ // B
              GPAtotal+=3*creditHourGetter;
          }
          if (classesAdded<85 && classesAdded>=80){// B-
              GPAtotal+=2.7*creditHourGetter;
          }
          if (classesAdded<80 && classesAdded>=75){ // C+
              GPAtotal+=2.3*creditHourGetter;
          }
          if (classesAdded>=70 && classesAdded<75){ // C
              GPAtotal+=2*creditHourGetter;
          }
          if (classesAdded>=60 && classesAdded<70){ // D
              GPAtotal+=1*creditHourGetter;
          }
          else{ //F
              GPAtotal+=0*creditHourGetter;
          }
        }
        GPAtotal/=creditHours;

        return GPAtotal;
    }

//method that prints the current student's GPA. very self-explanatory.
    public void PrintGPA(){

        System.out.println(studentName+"'s GPA is "+ decForm.format(GPAtotal));
    }

//sets the current's student's name so it shows up properly in other parts of the program.
    public void studentNameSetter(){
        System.out.println("What is this Student's name?");
        studentName=scan.nextLine();
        if (studentName==""){
            studentName=scan.nextLine();
        }
    }

//prints the name of the current student
    public void studentName(){
        System.out.print(studentName);
    }
}