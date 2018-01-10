package boletin16;

import com.Juan.persoas.Persoal;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin16 {
    
    public static void main(String[] args) {
//        Persoal a1=new Persoal(652879654,"a1@gmail.com");
//        Academia a=new Academia(9,"Juan",a1);
//        JOptionPane.showMessageDialog(null,a.toString());
//        Persoal a2=new Persoal(652879654,"a2@gmail.com");
//        Academia a3=new Academia(9,"Arturo",a2);
//        JOptionPane.showMessageDialog(null,a3.toString());
        Persoal alumno=new Persoal();
        Academia alumno1=new Academia();
        alumno1.setNome(JOptionPane.showInputDialog("Introduce nombre del alumno"));
        alumno.setCorreo(JOptionPane.showInputDialog("Introduce el mail del alumno"));
        alumno.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Introducir telefono")));
        alumno1.añadirNota();
        alumno1.setAlum(alumno);
        JOptionPane.showMessageDialog(null,alumno1.toString());
        
        
        
        
        

    }

}
