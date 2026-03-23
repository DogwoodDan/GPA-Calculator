import java.util.Scanner;

public class GPAcalcDriver{
    public static void main(String[]args){
        Boolean program=true;
        Scanner input = new Scanner(System.in);
        int userInput=0;
        GPAcalcConstructor Student1=new GPAcalcConstructor();
        GPAcalcConstructor Student2=new GPAcalcConstructor();
        GPAcalcConstructor Student3=new GPAcalcConstructor();
        GPAcalcConstructor Student4=new GPAcalcConstructor();
        GPAcalcConstructor Student5=new GPAcalcConstructor();
        System.out.println("Welcome to the Student GPA Calculator\n" +
                "This program can hold up to 5 students' information at a time.");
        Student1.studentNameSetter();
        Student1.GPAcalcConstructor();
        Student1.PrintGPA();

       while (program==true) {
           System.out.println("\nWhat do you want to do?\n" +
                   "1. View A Student's GPA\n" +
                   "2. Input/Change A Student's GPA\n" +
                   "3. Input/Change A Student's Name\n" +
                   "4. Exit");
           userInput=input.nextInt();
           input.nextLine();
           switch(userInput){
               case 1:
                   System.out.print("Which Student do you want to view?\n" +
                           "1. ");
                   Student1.studentName();
                   System.out.print("\n2. ");
                   Student2.studentName();
                   System.out.print("\n3. ");
                   Student3.studentName();
                   System.out.print("\n4. ");
                   Student4.studentName();
                   System.out.print("\n5. ");
                   Student5.studentName();


                   userInput=input.nextInt();
                   switch(userInput){
                       case 1:
                           Student1.PrintGPA();
                           break;
                       case 2:
                           Student2.PrintGPA();
                           break;
                       case 3:
                           Student3.PrintGPA();
                           break;
                       case 4:
                           Student4.PrintGPA();
                           break;
                       case 5:
                           Student5.PrintGPA();
                           break;
                       default:
                           System.out.println("Please enter a number 1-5");
                   }
                   break;
               case 2:
                   System.out.print("Which Student do you want to edit?\n" +
                           "1. ");
                   Student1.studentName();
                   System.out.print("\n2. ");
                   Student2.studentName();
                   System.out.print("\n3. ");
                   Student3.studentName();
                   System.out.print("\n4. ");
                   Student4.studentName();
                   System.out.print("\n5. ");
                   Student5.studentName();
                   userInput=input.nextInt();
                   switch(userInput){
                       case 1:
                           Student1.GPAcalcConstructor();
                           Student1.PrintGPA();
                           break;
                       case 2:
                           Student2.GPAcalcConstructor();
                           Student2.PrintGPA();
                           break;
                       case 3:
                           Student3.GPAcalcConstructor();
                           Student3.PrintGPA();
                           break;
                       case 4:
                           Student4.GPAcalcConstructor();
                           Student4.PrintGPA();
                           break;
                       case 5:
                           Student5.GPAcalcConstructor();
                           Student5.PrintGPA();
                           break;
                       default:
                           System.out.println("Please enter a number 1-5");
                   }
                   break;
               case 3:
                   System.out.print("Which Student do you want to change the name of?\n" +
                           "1. ");
                   Student1.studentName();
                   System.out.print("\n2. ");
                   Student2.studentName();
                   System.out.print("\n3. ");
                   Student3.studentName();
                   System.out.print("\n4. ");
                   Student4.studentName();
                   System.out.print("\n5. ");
                   Student5.studentName();

                   userInput=input.nextInt();

                   switch(userInput){
                       case 1:
                           Student1.studentNameSetter();
                           break;
                       case 2:
                           Student2.studentNameSetter();
                           break;
                       case 3:
                           Student3.studentNameSetter();
                           break;
                       case 4:
                           Student4.studentNameSetter();
                           break;
                       case 5:
                           Student5.studentNameSetter();
                           break;
                       default:
                           System.out.println("Please enter a value between 1-5");
                   }
                   break;
               case 4:
                   System.out.println("Thank you for trying this program. Goodbye");
                   program=false;
                   break;
               default:
                   System.out.println("Please enter a value between 1-4");
                   break;
           }


       }
    }


}