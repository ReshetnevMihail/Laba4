package Main;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Library
{
    static Access accessObj;
    static Semaphore sem;
    String str;
    public static void main(String args[])
    {
        accessObj = new Access();
        sem = new Semaphore(1);
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 1; i++)
        {
            System.out.println("Введите информацию: ");
            String str = in.next();
            new Writer(str,accessObj, sem);
            Reader obj = new Reader(str,accessObj);

        }

    }

   public String getstr()
    {
        return str;
    }
}







