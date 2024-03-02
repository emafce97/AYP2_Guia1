package Ejercicio2;

public class Cerradura {

    private String clave;
    private boolean estaCerrada;

    public Cerradura(String clave) throws FormatoErroneoEx{
        if(!(this.formatoCorrecto(clave))){
            throw new FormatoErroneoEx();
        }
        this.clave = clave;
        this.estaCerrada = true;
    }

    public void abrir(String clave){
        if(this.formatoCorrecto(clave) && this.estaCerrada){
            if(this.clave.equals(clave)){
                this.estaCerrada = false;
                System.out.println("Se ha abierto la cerradura...");
            }else{
                System.out.println("Clave incorrecta!");
            }
        }else{
            System.out.println("ERROR: El formato de la clave es incorrecto o la cerradura ya esta abierta");
        }
    }

    public void cerrar(){
        this.estaCerrada = true;
    }

    public void cambiarClave(String claveVieja, String claveNueva) {
        if (this.clave.equals(claveVieja)) {
            this.clave = claveNueva;
            System.out.println("La clave ha sido cambiada...");
        } else {
            System.out.println("La clave vieja es incorrecta");
        }
    }
    private boolean formatoCorrecto(String clave){
        return clave.matches("[0-9]{3}");
    }

    public boolean estaAbierta(){
        return this.estaCerrada;
    }

}

class FormatoErroneoEx extends Exception{
    public FormatoErroneoEx(){
        super("El formato de la clave es erroneo");
    }
}

class Demo{

    public static void main(String[] args){
        Cerradura cerradura;
        try{
          cerradura = new Cerradura("123");
          System.out.println(cerradura.estaAbierta());
          cerradura.abrir("123");
          System.out.println(cerradura.estaAbierta());
          cerradura.abrir("123");
          cerradura.cambiarClave("123", "456");
        }catch(FormatoErroneoEx ex){
            System.out.println(ex);
        }

    }
}
