import java.util.Scanner;

public class Araayswithusersinput {
    public static void main(String[] args) {
        Scanner chukua;
        String[] STUDENTS;
        Integer numberofstudents;

        //Instantiate your scanner

        chukua = new Scanner(System.in);
        System.out.println("how many students do you have ");
        numberofstudents=chukua.nextInt();

        //instantiate your string araay
        STUDENTS = new String[numberofstudents];
        System.out.println("enter the names ");

        //loop to get the names from the user
        for (int x = 0; x<numberofstudents; x++){
            STUDENTS[x]=chukua.next();
        }

        //write the loop to print the received names
      for (int x=0; x<numberofstudents;x++){
            System.out.println(STUDENTS[x]);
        }
    }
}
