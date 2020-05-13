package datos;

public interface AccesoDatos {
    /* Una interface puede tener Atributos o metodos, pueden ser unos u otros. 
         Cualquier variable que se agregue sera una constante, se ponen en mayuscula
        solo para indicar que es una constante.     */
    
public static final int MAX_REGISTROS = 10;/*Toda variable se vuelve una constante, no es necesario poner
                                            tal cual 'public static final', el IDE lo hara por defecto.*/

/* Tambien es posible agregar metodos en dicha Interface pero solamente de tipo abstracto, como en las clases
    abstractas, mas no se desarrollan.
   En caso de no usar las palabras reservadas 'public abstract' el compilador lo hara por su cuenta debido a que es una 
    Interface */
public abstract void insertar();

public abstract void listar();

}