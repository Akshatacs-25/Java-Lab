import java.util.Scanner;
import cie.*;
import see.*;

public class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the details of student"+(i+1));
            System.out.println("USN:");
            String usn=sc.nextLine();
            System.out.println("Name:");
            String name=sc.nextLine();
            System.out.println("Semester:");
            int sem=sc.nextInt();

            int[] internal=new int[5];
            int[] external=new int[5];

            System.out.println("Enter internal marks(5 subjects):");
            for(int j=0;i<5;j++){
                internal[j]=sc.nextInt();
            }

            System.out.println("Enter external marks(5 subjects):");
            for(int j=0;i<5;j++){
                external[j]=sc.nextInt();
            }

            Internals in=new Internals(internal);
            Externals ex=new Externals(usn,name,sem,external);

            System.out.println("\n Final marks:");
            for(int j=0;j<5;i++){
                int finalmarks=in.internalmarks[j]+ex.externalmarks[j];
                System.out.println("Subject"+(j+1)+":"+finalmarks);
            }

            











        }
        
    }
}