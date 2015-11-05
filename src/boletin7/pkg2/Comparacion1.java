package boletin7.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Comparacion1 {
   static public short pedirNumeroEnteiro(){
   short numero;
   String res = JOptionPane.showInputDialog("Teclea el Numero :");
   numero=(short) Short.parseShort(res);
   return numero;
}
  static public void numeroenteiro (short num1,short num2){
        
        if (num1>=num2)
           System.out.println("A resta é :"+(num1-num2) );
        else if (num2>num1)
           System.out.println("A suma é :"+ (num1+num2));
   }
  }
