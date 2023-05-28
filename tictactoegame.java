import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class tictactoegame implements ActionListener {
    JFrame frame=new JFrame();
    JLabel label=new JLabel("TIC-TAC-TOE");
    JPanel panels=new JPanel();
    JPanel panel=new JPanel();
    JButton[] button=new JButton[9];
    boolean player1_turn;
    boolean player2_turn;

    Random rd=new Random();




    tictactoegame(){
        //frame=new JFrame();
        frame.setTitle("tictactoe game");
        //frame.setLayout(new BorderLayout());
	    frame.setSize(420,550);
        //frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        //label.setLayout(null);
        label.setSize(350,10);
        label.setForeground(Color.green);
        label.setBackground(Color.black);
        label.setOpaque(false);
        label.setFont(new Font("Serif Bold",Font.BOLD,30));
        label.setHorizontalAlignment(JLabel.CENTER);
        

        
        panels.setLayout(new GridLayout(3,3));
        panels.setBounds(20,10,350,300);
        panels.setBackground(Color.LIGHT_GRAY);
        



        
        panel.setBounds(20,20,350,500);
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.BLACK);
        panel.setVisible(true);

        for(int i=0;i<9;i++){
            button[i]=new JButton();
            button[i].addActionListener(this);
            panels.add(button[i]);
            button[i].setFocusable(false);
            
            button[i].setFont(new Font("Serif Plain",Font.ITALIC,40));
            button[i].setVisible(true);
        }

        
        


        
        
        panel.add(label);
        frame.add(panel,BorderLayout.NORTH);
        frame.add(panels);
        frame.setVisible(true);
        label.setVisible(true);
        turn();
    }

    public void turn(){

        try{
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        if(rd.nextInt(2)==0){
            //player1_turn=true;
            label.setText("O-Turn");
            player1_turn=true;
        }
        else{
            //player2_turn=true;
            label.setText("X-Turn");
            player2_turn=true;
        }
        
    }


   
    

    
    
            
        
        
    
   
    public void game(){
        if(
            (button[0].getText()=="O")&& 
            (button[1].getText()=="O")&&
            (button[2].getText()=="O")
        ){
           player1_wins(0,1,2); 

        }
        if(
            (button[3].getText()=="O")&& 
            (button[4].getText()=="O")&&
            (button[5].getText()=="O")
        ){
           player1_wins(3,4,5); 
        }
        if(
            (button[6].getText()=="O")&& 
            (button[7].getText()=="O")&&
            (button[8].getText()=="O")
        ){
            player1_wins(6,7,8); 
        }
        if(
            (button[0].getText()=="O")&& 
            (button[4].getText()=="O")&&
            (button[8].getText()=="O")
        ){
            player1_wins(0,4,8); 
        }
        if(
            (button[2].getText()=="O")&& 
            (button[4].getText()=="O")&&
            (button[6].getText()=="O") 
        ){
            player1_wins(2,4,6); 
        }
        if(
            (button[1].getText()=="O")&& 
            (button[4].getText()=="O")&&
            (button[7].getText()=="O")
        ){
            player1_wins(1,4,7); 
        }
        if(
            (button[0].getText()=="O")&& 
            (button[3].getText()=="O")&&
            (button[6].getText()=="O")
        ){
            player1_wins(0,3,6); 
        }
        if(
            (button[2].getText()=="O")&& 
            (button[5].getText()=="O")&&
            (button[8].getText()=="O")
        ){
            player1_wins(2,5,8); 
        }
        if(
            (button[3].getText()=="X")&& 
            (button[4].getText()=="X")&&
            (button[5].getText()=="X")
        ){
            player2_wins(3,4,5); 
        }
        if(
            (button[0].getText()=="X")&& 
            (button[1].getText()=="X")&&
            (button[2].getText()=="X")
        ){
            player2_wins(0,1,2); 
        }
        if(
            (button[6].getText()=="X")&& 
            (button[7].getText()=="X")&&
            (button[8].getText()=="X")
        ){
            player2_wins(6,7,8); 
        }
        if(
            (button[0].getText()=="X")&& 
            (button[4].getText()=="X")&&
            (button[8].getText()=="X")
        ){
            player2_wins(0,4,8); 
        }
        if(
            (button[2].getText()=="X")&& 
            (button[4].getText()=="X")&&
            (button[6].getText()=="X")
        ){
            player2_wins(2,4,6); 
        }
        if(
            (button[1].getText()=="X")&& 
            (button[4].getText()=="X")&&
            (button[7].getText()=="X")
        ){
            player2_wins(1,4,7); 
        }
        if(
            (button[0].getText()=="X")&& 
            (button[3].getText()=="X")&&
            (button[6].getText()=="X")
        ){
            player2_wins(0,3,6); 
        }
        if(
            (button[2].getText()=="X")&& 
            (button[5].getText()=="X")&&
            (button[8].getText()=="X")
        ){
            player2_wins(2,5,8); 
        }


            

            
        



    }
    public void player1_wins(int i,int j,int k){
        button[i].setBackground(Color.green);
        button[j].setBackground(Color.green);
        button[k].setBackground(Color.green);

        for(int m=0;m<9;m++){
            button[m].setEnabled(false);
        }

        label.setText("player1 won");
        
    }


    public void player2_wins(int i,int j,int k){
        button[i].setBackground(Color.green);
        button[j].setBackground(Color.green);
        button[k].setBackground(Color.green);
        for(int m=0;m<9;m++){
            button[m].setEnabled(false);
        }

        label.setText("player2 won");
        
    }
          
          
    public static void main(String args[]){
        tictactoegame tic=new tictactoegame();
        
        


        
    }
    public void actionPerformed(ActionEvent e){
        for(int i=0;i<9;i++){
            if(e.getSource()==button[i]){
                if(player1_turn){
                    if(button[i].getText()==""){
                        button[i].setText("O");
                        button[i].setForeground(Color.red);
                        player1_turn=false;
                        label.setText("X-turn");
                        game();
                    }
                }
                else {
                    if(button[i].getText()==""){
                        button[i].setText("X");
                        button[i].setForeground(Color.black);
                        player1_turn=true;
                        label.setText("O-turn");
                        game();
                        
                    }
                    
                }
                

                


            }
        }  

            
    } 
}

        
        
     
    

    



    

    
        
        
        


        
        
    

	


    




  
    
        


  
