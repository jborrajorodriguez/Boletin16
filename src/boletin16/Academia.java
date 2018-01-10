package boletin16;

import com.Juan.persoas.Persoal;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Academia {
    private static int numReferencia=2018;
    private int nota;
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
    public Academia(int nota,String nome,Persoal alum) {
        numReferencia++;
        this.nota=nota;
        this.nome=nome;
        this.alum=alum;
    }

    public int getNota() {
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

    @Override
    public String toString() {
        return ("Numero de referencia : "+numReferencia+"\nNota : "+nota+"\n "+alum);
    }

    

   
    

}
