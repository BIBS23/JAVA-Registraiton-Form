import java.awt.*;
import java.awt.event.*;
public class LoginPage extends Frame implements ActionListener{
    Label label1,label2,label3,label4,label5,label6;
    Button button;
    TextField textField1 = new TextField(10);
    TextField textField2 = new TextField(10);
    TextField textField3 = new TextField(10);
    TextField textField4 = new TextField(20);
    TextField textField5 = new TextField(10);
    TextField textField6 = new TextField(10);
    LoginPage(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Registration Form");
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        button=new Button("SUBMIT");
        label1= new Label("Name");
        add(label1);
        add(textField1);
        label2= new Label("Dob");
        add(label2);
        add(textField2);
        label3= new Label("Age");
        label3.setAlignment(Label.CENTER);
        label3.setBounds(50,200,75,20);
        textField3.setBounds(150,200,200,20);
        add(label3);
        add(textField3);
        label4= new Label("Email");
        add(label4);
        add(textField4);
        label5= new Label("Mob Number");
        add(label5);
        add(textField5);
        label6= new Label("Place");
        add(label6);
        add(textField6);
        add(button);
        textField1.setText(" ");
        textField2.setText(" ");
        textField3.setText(" ");
        textField4.setText(" ");
        textField5.setText(" ");
        textField6.setText(" ");
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Name :- "+textField1.getText());
        System.out.println("DOB :- "+textField2.getText());
        System.out.println("Age  :- "+textField3.getText());
        System.out.println("E-mail  :- "+textField4.getText());
        System.out.println("Mob Number  :- "+textField5.getText());
        System.out.println("Place  :- "+textField6.getText());
    }
    public static void main(String[] args) {
        new LoginPage();
    }
}