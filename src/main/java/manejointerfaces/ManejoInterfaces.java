package manejointerfaces;
import datos.*;
public class ManejoInterfaces {
    public static void main(String[] args) {
        /*Apuntamos con el nuevo objeto creado 'datos' a ImplementacionOracle, para que despues ejecute el metodo insertar() de esa
           clase. */
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        
      /*  El metodo insertar() y listar() esta implementado en las dos clases, esta sobreescrito por lo tanto aplicamos Polimorfismo
           para poder ejecutar el metodo de cada clase segun apuntemos con el objeto ya sea a clase ImplementacionOracle
            o a clase ImplemenatcionMySql */
        
        /* Apuntamos a ImplemenatcionMySql para que ejecute el metodo insertar() de esta clase */
        datos = new ImplemenatcionMySql();
        datos.insertar();
        datos.listar();
    }
}