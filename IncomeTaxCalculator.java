import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class IncomeTaxCalculator extends Applet implements ActionListener,WindowListener {

    private Label label,label1,label2;
    private JTextField txt,txt1,txt2;
    private JButton btn1,btn2;
    
    public void init(){
        Frame f = new Frame();
        //Frame f1 = new Frame();
        f.setLayout(new BorderLayout());
        f.setSize(700, 300);
        Panel p = new Panel();
        Panel pc1 = new Panel();
        f.add(pc1,"South");
        f.add(p,"North");
        label = new Label("Enter Your Salary :");
        label1 = new Label("Tax To Be Paid :");
        label2 = new Label("Enter Income from Property: ");
        //label3 = new Label("Income Tax");
        txt1 = new JTextField(5);
        //txt3 = new JTextField(10);
        //txt4 = new JTextField(10);
        txt = new JTextField(5);
        txt2 = new JTextField(5);
        p.add(label);
        p.add(txt);
        //p.add(label3);
        //p.add(txt4);
        p.add(label2);
        p.add(txt2);
        p.add(label1);
        p.add(txt1);
        btn1 = new JButton("SUBMIT");
        btn2 = new JButton("EXIT");
        pc1.add(btn1);
        pc1.add(btn2);
        f.setVisible(true);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    
    public static void main(String args[]){
        new IncomeTaxCalculator().init();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn=(JButton)e.getSource();
        if(btn==btn1){
            double a=Integer.parseInt(txt.getText());
            double p=Integer.parseInt(txt2.getText());
            double income=a+p;
            double tax=0,b=0;
            
            if(income>0 && income<=250000){
                txt1.setText("0");
                //txt4.setText("0");
                //txt3.setText("0");
                
            }else if(income>250000 && income<=400000){ //Change the Income here
                income=income-250000;
                tax=0.1*income; //Change the rate % here
                //txt4.setText(String.valueOf(tax));
                //txt3.setText(String.valueOf(tax*.03));
                //tax+=tax*.03;
                txt1.setText(String.valueOf(tax));
            }else if(income>400000 && income<=500000){ //Change the Income here
                income=income-400000;
                tax=0.15*income; //Change the rate % here
                //txt4.setText(String.valueOf(tax));
                //txt3.setText(String.valueOf(tax*.03));
                //tax+=tax*.03;
                txt1.setText(String.valueOf(tax));
            }else if(income>500000 && income<=600000){ //Change the Income here
                income=income-500000;
                tax=0.2*income; //Change the rate % here
                //txt4.setText(String.valueOf(tax));
                //txt3.setText(String.valueOf(tax*.03));
                //tax+=tax*.03;
                txt1.setText(String.valueOf(tax));
            }
            else if(income>600000 && income<=3000000){ //Change the Income here
                income=income-600000;
                tax=0.25*income; //Change the rate % here
                //txt4.setText(String.valueOf(tax));
                //txt3.setText(String.valueOf(tax*.03));
                //tax+=tax*.03;
                txt1.setText(String.valueOf(tax));
            }
            else if(income>3000000){ //Change the Income here
                income=income-3000000;
                tax=0.3*income; //Change the rate % here
                //txt4.setText(String.valueOf(tax));
                //txt3.setText(String.valueOf(tax*.03));
                //tax+=tax*.03;
                txt1.setText(String.valueOf(tax));
            }
        }else if(btn==btn2){
            System.exit(0);
        }
    }
    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
}