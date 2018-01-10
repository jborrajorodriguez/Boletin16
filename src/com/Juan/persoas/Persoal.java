package com.Juan.persoas;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Persoal {
    private int telefono;
    private String correo;
    /**
     * Constructor por defecto.
     */
    public Persoal() {
    }
    /**
     * Constructor con parametros
     * @param telefono numero de telefono de la persona.
     * @param correo nombre del correo electronico de la persona.
     */
    public Persoal(int telefono,String correo) {
        this.telefono=telefono;
        this.correo=correo;
    }
    /**
     * Método getTelefono,devolve o valor de telefono.
     * @return telefono
     */
    public int getTelefono() {
        return telefono;
    }
    /**
     * Método setTelefono,lle asigna un valor a telefono
     * @param telefono 
     */
    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo=correo;
    }
    

    @Override
    public String toString() {
        return ("Telefono : "+telefono+"\nCorreo : "+correo);
    }
    
    
    
    

}
