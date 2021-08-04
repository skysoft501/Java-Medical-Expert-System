import java.awt.*;
import java.awt.event;
public class Diagnosis extends Frame implements ActionListener {
public Diagnosis (String s) {
super (s)
setLayout(new FlowLayout());
setSize(300,100);
setLocation(10,20);
setBackground(Color.white);
Label lblSymptoms,lbl,Illness;
lblSymptoms = new Label ("Symptoms");
lblIllness = new Label ("Illness");
TextField txtSymptoms,txtIllness;
txtSymptoms = new TextField (20);
txtIllness = new TextField (20);
Button btnClose,btnOk;
btnClose = new Button ("Close");
btnOk = new Button ("Ok");
btnClose.addActionListener(this);
btnOk.addActionListener(this);
add(lblSymptoms);
add(txtSymptoms);
add(lblIllness);
add(txtIllness);
add(btnClose);
add(btnOk);
show();
}

public void actionPerformed(ActionEvent event) {
if(event.getActionCommand().equals("Close"))
System.exit(0);
}

public static void main(String[] args){
new Diagnosis ("Software Clinic");
 }
}




