package it.develhope.exceptionshandling;
import java.util.Scanner;
public class Start
{
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                System.out.print("Inserisci il dividendo: ");
                double dividend = scanner.nextInt();
                System.out.print("Inserisci il divisore: ");
                double divisor = scanner.nextInt();
                if (divisor == 0)
                {
                    System.out.println("Non è possibile dividere per zero!");
                }
                else
                {
                    double quotient = dividend / divisor;
                    System.out.println("Il quoziente è: " + quotient);
                }
            }
        }
}

