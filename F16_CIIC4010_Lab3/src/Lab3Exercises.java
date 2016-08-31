import javax.swing.JFrame;

public class Lab3Exercises {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Victor J. Fermin");
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //myFrame.setLocation(600, 250);
        myFrame.setLocation(850, 400); //using the Lab's computer
        myFrame.setSize(200, 200);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
        myFrame.setVisible(true);
    }
}