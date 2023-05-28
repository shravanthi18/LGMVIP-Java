import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CurrencyConvetor{
    JFrame frame=new JFrame();
    JButton button=new JButton();
   
    JButton b1;
    JLabel l1,l2,l3,l4;
    String data[]={"INR","USD","KWD","PKR","AUD"};

    JComboBox<String> cb1=new JComboBox<>(data);
    JComboBox<String> cb2=new JComboBox<>(data);

    

    
    


    

    public CurrencyConvetor(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("currency convetor");
        frame.setLayout(null);
        frame.setSize(700,600);
        frame.setVisible(true);
        
        cb1.setBounds(30,100,100,30);
        //cb1.setRenderer();
        cb2.setBounds(30,200,200,30);

        b1=new JButton();
        b1.setBounds(70,370,150,50);
        //b1.setVisible(true);
        b1.setText("Convert");

        l1=new JLabel();
        l1.setText("From Currency:");
        l1.setBounds(0,60,150,30);
        l1.setHorizontalAlignment(JLabel.CENTER);

        l2=new JLabel();
        l2.setText("To Currency:");
        l2.setBounds(0,160,130,30);
        l2.setHorizontalAlignment(JLabel.CENTER);
        

        l3=new JLabel();
        l3.setText("Enter the Amount:");
        l3.setBounds(10,250,170,40);
        l3.setHorizontalAlignment(JLabel.CENTER);

        l4=new JLabel();
        l4.setBounds(60,410,200,70);
        l4.setVisible(true);

        JTextField field=new JTextField();
        field.setBounds(20,300,250,50);
        

        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //double amount=Double.parseDouble(field.getText());
                
                if(field.getText().equals(""))
              {
                   JOptionPane.showMessageDialog(b1,"Sorry , Enter Amount");
              }
                else if(cb1.getSelectedItem()==cb2.getSelectedItem()){
                    JOptionPane.showMessageDialog(b1,"Change the from and to currency!!!");
                }

                double amount=Double.parseDouble(field.getText());
                
                if(cb1.getSelectedItem()=="INR"){
                    if(cb2.getSelectedItem()=="USD"){
                        double result=amount*0.012;
                        l4.setText(field.getText()+"Indian rupee"+"="+ String.valueOf(result)+"USD Dollars");
                    }
                    else if(cb2.getSelectedItem()=="KWD"){
                        double result=amount*0.0037;
                        l4.setText(field.getText()+"Indian rupee"+"="+String.valueOf(result)+"Kuwaiti dinar");
                    }
                    else if(cb2.getSelectedItem()=="PKR"){
                        double result=amount*3.48;
                        l4.setText(field.getText()+"Indian rupee"+"="+String.valueOf(result)+"Pakistan rupees");
                    }
                    else if(cb2.getSelectedItem()=="AUD"){
                        double result=amount*0.018;
                        l4.setText(field.getText()+"Indian rupee"+"="+String.valueOf(result)+"Australian dollars");
                    }
                }
    
                else if(cb1.getSelectedItem()=="USD"){
                    if(cb2.getSelectedItem()=="INR"){
                        double result=amount*82.06;
                        l4.setText(field.getText()+"USA Dollars"+"="+String.valueOf(result)+"Indian ruepees");
                    }
                    else if(cb2.getSelectedItem()=="KWD"){
                        double result=amount*0.31;
                        l4.setText(field.getText()+"USA Dollars"+"="+String.valueOf(result)+"Kuwaiti dinar");
                    }
                    else if(cb2.getSelectedItem()=="PKR"){
                        double result=amount*285.51;
                        l4.setText(field.getText()+"USA Dollars"+"="+String.valueOf(result)+"Pakistani rupees");
                    }
                    else if(cb2.getSelectedItem()=="AUD"){
                        double result=amount*1.48;
                        l4.setText(field.getText()+"USA Dollars"+"="+String.valueOf(result)+"Australian dollars");
                    }
                }
                else if(cb1.getSelectedItem()=="PKR"){
                    if(cb2.getSelectedItem()=="INR"){
                        double result=amount*0.28;
                        l4.setText(field.getText()+"Pakistani rupees"+"="+String.valueOf(result)+"Indian rupees");
                    }
                    else if(cb2.getSelectedItem()=="KWD"){
                       double result=amount*0.0011;
                       l4.setText(field.getText()+"Pakistani rupees"+"="+String.valueOf(result)+"Kuwaiti dinar");
                    }
                    else if(cb2.getSelectedItem()=="USD"){
                       double result=amount*0.0035;
                       l4.setText(field.getText()+"Pakistani rupees"+"="+String.valueOf(result)+"USA dollars");
                    }
                    else if(cb2.getSelectedItem()=="AUD"){
                       double result=amount*0.0052;
                       l4.setText(field.getText()+"Pakistani rupees"+"="+String.valueOf(result)+"Australian dollars");
                    }
                }
                else if(cb1.getSelectedItem()=="AUD"){
                    if(cb2.getSelectedItem()=="INR"){
                        double result=amount*55.41;
                        l4.setText(field.getText()+"Australian dollars"+"="+String.valueOf(result)+"Indian rupees");
                    
                    }
                    else if(cb2.getSelectedItem()=="USD"){
                        double result=amount*0.68;
                        l4.setText(field.getText()+"Australian dollars"+"="+String.valueOf(result)+"USA dollars");
                    }
                    else if(cb2.getSelectedItem()=="KWD"){
                        double result=amount*0.21;
                        l4.setText(field.getText()+"Australian dollars"+"="+String.valueOf(result)+"Kuwaiti dinar");
                    }
                    else if(cb2.getSelectedItem()=="PKR"){
                        double result=amount*192.78;
                        l4.setText(field.getText()+"Australian dollars"+"="+String.valueOf(result)+"Pakistan rupees");
                    }
                }
                if(cb1.getSelectedItem()=="KWD"){
                    if(cb2.getSelectedItem()=="USD"){
                        double result=amount*3.26;
                        l4.setText(field.getText()+"Kuwaiti dinar"+"="+ String.valueOf(result)+"USD Dollars");
                    }
                    else if(cb2.getSelectedItem()=="INR"){
                        double result=amount*267.89;
                        l4.setText(field.getText()+"Kuwaiti dinar"+"="+String.valueOf(result)+"Indian rupees");
                    }
                    else if(cb2.getSelectedItem()=="PKR"){
                        double result=amount*966.26;
                        l4.setText(field.getText()+"Kuwaiti dinar"+"="+String.valueOf(result)+"Pakistan rupees");
                    }
                    else if(cb2.getSelectedItem()=="AUD"){
                        double result=amount*4.87;
                        l4.setText(field.getText()+"Kuwaiti dinar"+"="+String.valueOf(result)+"Australian dollars");
                    }
                }
                
                
            }
        });


        frame.add(cb1);
        frame.add(cb2);
        frame.add(field);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(b1);

    }



                
    
        
public static void main(String args[]){
    CurrencyConvetor cv=new CurrencyConvetor();
}
    
}