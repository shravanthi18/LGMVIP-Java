
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;







public class calculator  implements ActionListener{
    
    JFrame frame;
    JButton bplus,bsub,bmul,bdiv;
    JButton[] jbutton=new JButton[11];
    JButton[] spbuttons=new JButton[11];
    JButton bcos,blog,bsin,beql,bdot,bclr;
    JButton bminus;
    JPanel panel;
    JTextField field ;
    double num1=0,num2=0,result=0;
    char operator;



    

    calculator(){
        frame=new JFrame();
        frame.setTitle("calculator");
        frame.setLayout(null);
	    frame.setSize(420,550);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        field=new JTextField(" ");
        field.setBounds(45,50,300,45);
        field.setEditable(false);
        field.setBackground(Color.PINK);

        
        
        
        beql=new JButton("=");
        bplus=new JButton("+");
        bsub=new JButton("-");
        bmul=new JButton("*");
        bdiv=new JButton("/");
        bcos=new JButton("cos");
        blog=new JButton("log");
        bsin=new JButton("sin");
        bdot=new JButton(".");
        bclr=new JButton("C");
        bminus=new JButton("(-)");

        spbuttons[0]=beql;
        spbuttons[1]=bplus;
        spbuttons[2]=bsub;
        spbuttons[3]=bmul;
        spbuttons[4]=bdiv;
        spbuttons[5]=bdot;
        spbuttons[6]=bclr;
        spbuttons[7]=bsin;
        spbuttons[8]=bcos;
        spbuttons[9]=blog;
        spbuttons[10]=bminus;

        for(int i=0;i<11;i++){
            
            spbuttons[i].addActionListener(this);
            
            spbuttons[i].setFocusable(false);

        }
        for(int i=0;i<10;i++){
            jbutton[i]=new JButton(String.valueOf(i));
            jbutton[i].addActionListener(this);
            jbutton[i].setFocusable(false); 

        }
        panel=new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(6,3,4,8));
        panel.setBackground(Color.LIGHT_GRAY);
        
        
        panel.add(jbutton[1]);
        panel.add(jbutton[2]);
        panel.add(jbutton[3]);
        panel.add(bplus);
        panel.add(jbutton[4]);
        panel.add(jbutton[5]);
        panel.add(jbutton[6]);
        panel.add(bsub);
        panel.add(jbutton[7]);
        panel.add(jbutton[8]);
        panel.add(jbutton[9]);
        panel.add(bmul);
        panel.add(bdot);
        panel.add(jbutton[0]);
        panel.add(bminus);
        panel.add(bdiv);
        panel.add(bcos);
        panel.add(bsin);
        panel.add(blog);
        
        panel.add(beql);
        panel.add(bclr);
       




       
        

        frame.add(field);
        frame.add(panel);

        frame.setVisible(true);



        


        
        
    }
	


    




  
    public static void main(String[] args) {
        calculator cal=new calculator();
        
    
    }
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<=10;i++){
            if(e.getSource()==jbutton[i]){
                field.setText(field.getText()+String.valueOf(i));

            }
            
        }
        if(e.getSource()==bdot){
            field.setText(field.getText()+".");

        }
        if(e.getSource()==bplus){
            num1=Double.parseDouble(field.getText());
            operator='+';
            field.setText(" ");
            
        }
        if(e.getSource()==bsub){
            num1=Double.parseDouble(field.getText());
            operator='-';
            field.setText(" ");
            
        }
        if(e.getSource()==bmul){
            num1=Double.parseDouble(field.getText());
            operator='*';
            field.setText(" ");
            
        }
        if(e.getSource()==bdiv){
            num1=Double.parseDouble(field.getText());
            operator='/';
            field.setText(" ");
            
        }
        if(e.getSource()==bsin){
            num1=Math.sin(Double.parseDouble(field.getText()));
            field.setText(""+num1);
            




        }
        if(e.getSource()==bcos){
            num1=Math.cos(Double.parseDouble(field.getText()));
            field.setText(""+num1);
        }
        if(e.getSource()==blog){
            num1=Math.log(Double.parseDouble(field.getText()));
            field.setText(""+num1);
        }
        if(e.getSource()==bminus){
            double temp= Double.parseDouble(field.getText());
            temp*=-1;


            field.setText(String.valueOf(temp));
        }
        


        if(e.getSource()==beql){
            num2=Double.parseDouble(field.getText());
            switch(operator)
             {
            case'+':
                result=num1+num2;    
                break;
            case'-':
                result=num1-num2;
                break;
            case'*':
                result=num1*num2;
            break;
                case'/':
                result=num1/num2;
                break;



            



            }
            field.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==bclr){
            field.setText(null);
        }
        


    }
}
 
    

