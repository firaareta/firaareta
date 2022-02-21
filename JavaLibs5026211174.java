import javax.swing.*;

public class JavaLibs5026211174 {
    public static void main(String[] args) {

        //1 Name
        String name = JOptionPane.showInputDialog("Hello! What's your name?");
        JOptionPane.showMessageDialog(null, "Hello! "+name+", what a beautiful name!");

        //2 Gender
        String[] acceptablevalues = {"Gentleman" , "Ladies"};
        String gender = (String)JOptionPane.showInputDialog(null, "You", "Gender",2,null,acceptablevalues,acceptablevalues[1]);
        JOptionPane.showMessageDialog(null, "Oh, so you're "+gender+".");

        //3 Age
        String age = JOptionPane.showInputDialog("How old are you?");
        int ageConvert=Integer.parseInt(age);
        if ( ageConvert > 35 ) {
            JOptionPane.showMessageDialog(null, "Oh, Hello, Sir!");
        } else if ( ageConvert == 19 ) {
            JOptionPane.showMessageDialog(null, "Wow "+name+" we're in the same age!.");
        } else {
            JOptionPane.showMessageDialog(null, "I see, you're "+age+".");
        }

        //4 College
        String School=JOptionPane.showInputDialog("What uni you've been studied ? |1 = ITS 2 = Graduate 3 = Else|");
        int SchoolConvert=Integer.parseInt(School);
        if (SchoolConvert == 1 ){
            JOptionPane.showMessageDialog(null,"WOW "+name+" WE'RE COLLEGE BUDDY");
        }else if (SchoolConvert == 2 ) {
            JOptionPane.showMessageDialog(null, "Awesome!");
        }else {
            JOptionPane.showMessageDialog(null,"Cool!");
        }

        //5 Tinggi
        String height=JOptionPane.showInputDialog("BTW, How tall are you?");
        int heightconvert=Integer.parseInt(height);
        if ( heightconvert > 200 ) {
            JOptionPane.showMessageDialog(null, "SERIOUSLY?? you must be kidding!");
        } else if ( heightconvert == 165 ) {
            JOptionPane.showMessageDialog(null, "OMG, we got the same height!");
        } else if ( heightconvert < 100 ) {
            JOptionPane.showMessageDialog(null, "Are you 5 or what? HAHAHA.");
        } else if ( heightconvert > 165 ) {
            JOptionPane.showMessageDialog(null, "Wow "+name+" you're tall");
        } else {
            JOptionPane.showMessageDialog(null, "You're "+height+"? so you're shorter than me hahaha");
        }

        //
        JOptionPane.showMessageDialog(null, "Anyways, wanna try some calculator?");

        //6-8 Kalkulator
        String number1 = JOptionPane.showInputDialog("Could you please add a number? make sure it is not a decimal!");
        int number11 = Integer.parseInt(number1);
        String number2 = JOptionPane.showInputDialog("Add another number!");
        int number22 = Integer.parseInt(number2);
        JOptionPane.showMessageDialog(null,"Okay, so your number are " +number11+" and "+number22);
        String operator = JOptionPane.showInputDialog("Times (1) or Divide (2) ?");
        int operatorx = Integer.parseInt(operator);
        int result;
        if (operatorx == 1){
            result = number11 * number22;
            JOptionPane.showMessageDialog(null,"The result is " +result);
        }else if(operatorx == 2){
            result = number11 / number22;
            JOptionPane.showMessageDialog(null,"The result is " +result);
        }else{
            JOptionPane.showMessageDialog(null,"Hey! you're suppose to add 1 or 2");
        }

        //
        JOptionPane.showMessageDialog(null, "Wait! i got another calculator, its a decimal version!");

        //9-11 Kalkulator double
        String number3 = JOptionPane.showInputDialog("Add a number please, this time make sure it is decimal!");
        double number33 = Double.parseDouble(number3);
        String number4 = JOptionPane.showInputDialog("Okay add another number");
        double number44 = Double.parseDouble(number4);
        JOptionPane.showMessageDialog(null,"So, your number is " +number33+" and "+number44);
        String operatorz = JOptionPane.showInputDialog("Plus (1) or Minus (2) ");
        double operatory = Double.parseDouble(operatorz);
        double result2;
        if (operatory == 1){
            result2 = number33 + number44;
            JOptionPane.showMessageDialog(null,"The result is " +result2);
        }else if(operatory == 2){
            result2 = number33 - number44;
            JOptionPane.showMessageDialog(null,"The result is " +result2);
        }else{
            JOptionPane.showMessageDialog(null,"Hey! you're suppose to add 1 or 2");
        }

        //end
        JOptionPane.showMessageDialog(null, "Okay so, thats all from meeee, thank you "+name+".");

    }
}
