import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Node extends JButton implements ActionListener {

    Node parent;
    int col;
    int row;
    int gCost;
    int hCost;
    int fCost;
    boolean start;
    boolean goal;
    boolean solid;
    boolean open;
    boolean checked;

    public Node(int col, int row){
        this.col =col;
        this.row = row;

        setBackground(Color.white);
        setForeground(Color.black);
        addActionListener(this);
    }
    public void setAsStart(){
        setBackground(Color.green);
        setForeground(Color.white);
        setText("S");
        start = true;
    }
    public void setAsGoal(){
        setBackground(Color.blue);
        setForeground(Color.black);
        setText("E");
        goal = true;
    }
    public void setAsSolid(){
        setBackground(Color.gray);
        setForeground(Color.gray);
        solid = true;
    }
    public void setAsOpen(){
        open = true;
    }
    public void setAsChecked(){
        if((start == false) && (goal == false)){
            setBackground(Color.white);
            setForeground(Color.black);
        }
        checked = true;
    }
    public  void setAsPath(){
        setBackground(Color.red);
        setForeground(Color.black);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        setBackground(Color.orange);
    }
}
