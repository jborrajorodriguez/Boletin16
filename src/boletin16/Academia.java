package boletin16;

import com.Juan.persoas.Persoal;
import com.juan.nota.criterioNota;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Academia {
    private static int numReferencia=2018;
    private float nota;
    private String nome;
    private Persoal alum;

    /**
     * Constructor por defecto.
     */
    public Academia() {
        numReferencia++;
    }
    /**
     * Constructor con parametros.
     * @param nota
     * @param nome
     * @param alum 
     */
    public Academia(float nota,String nome,Persoal alum) {
        numReferencia++;
        this.nota=nota;
        this.nome=nome;
        this.alum=alum;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota=nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum=alum;
    }
    public float añadirNota(){
        criterioNota.calculoDeNotas();
        
        return nota;
    }
    
 

    @Override
    public String toString() {
        return ("Nome do Alumno: "+nome+"\nNumero de referencia : "+numReferencia+"\nNota : "+nota+"\n"+alum);
    }

    

   
    

}
