import javax.swing.JOptionPane;

public class xd 
{
    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog("Enter yout name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter yout age"));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        double heigth = Double.parseDouble(JOptionPane.showInputDialog("Enter yout heigth"));
        JOptionPane.showMessageDialog(null, "Your heigth is " + heigth);

    }    
}
