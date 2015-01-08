import javax.swing.*;
/**
 * Write a description of class FileViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileViewer extends JFrame
{
    // instance variables - replace the example below with your own
    private JTextField txtIsiFile = new JTextField();
    private FileReader fl1 = new FileReader();
    /**
     * Constructor for objects of class FileViewer
     */
    public FileViewer()
    {
        // initialise instance variables
        super("File Viewer 1.0");
        setSize(300,400);
        getContentPane().add(txtIsiFile);
        try{
            txtIsiFile.setText(fl1.bacaFile("data.txt"));
        }catch(Exception e){e.printStackTrace();}
        setVisible(true);
    }
}
