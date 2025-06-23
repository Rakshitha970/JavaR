package SampleProgram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Class3 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        File f = new File("test.txt");
        FileWriter write = new FileWriter(f, true); // 'true' to append instead of overwrite

        String choice = "Y";

        while(choice.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the Name:");
            String name = sc.next();

            System.out.println("Enter password:");
            String password = sc.next();

            if(password.equals("123"))
            {
                write.append(name + "\n");
                //System.out.println("Name saved.");
            }
            else 
            {
                System.out.println("Incorrect password. Try again? (Y/N)");
            }

            System.out.println("Do you want to continue? (Y/N):");
            choice = sc.next();
        }

        write.close();
    }
}
