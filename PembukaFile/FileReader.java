import java.io.*;
import java.util.Scanner.*;
/**
 * Write a description of class FileReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileReader
{
    // instance variables - replace the example below with your own
    private String namaFile;
    Scanner sc = new Scanner (System.in);
    /**
     * Constructor for objects of class FileReader
     */
    public FileReader()
    {
        // initialise instance variables
        
    }
    //tambahkan throws ke method bacaFile();
    public String bacaFile(String namaFile) throws IOException
    {
       String str = "";
       Scanner sc = new Scanner(new File(namaFile));
       str = sc.next();
       return str;
    }
    
    public static void main (String [] argx)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama file : ");
        String namaFile = sc.next();
        FileReader fr1 = new FileReader();
        try
        {
            String isiFile=fr1.bacaFile(namaFile);
            System.out.println(isiFile);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
