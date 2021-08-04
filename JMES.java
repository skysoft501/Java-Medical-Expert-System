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

Checkbox chkFever,chkHeadache,chkBodypains,chkWeakness,chkApetiteloss;
chkFever = new Checkbox("Fever",null,false);
chkHeadache = new Checkbox("Headache",null,false);
chkBodypains = new Checkbox("Bodypains",null,false);
chkWeakness = new Checkbox("Weakness",null,false);
chkApetiteloss = new Checkbox("Apetiteloss",null,false);

Button btnClose,btnOk;
btnClose = new Button ("Close");
btnOk = new Button ("Ok");
btnClose.addActionListener(this);
btnOk.addActionListener(this);
add(lblSymptoms);
add(txtSymptoms);
add(lblIllness);
add(txtIllness);
add(chkFever);
add(chkHeadache);
add(chkBodypains);
add(chkWeakness);
add(chkApetiteloss);

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




