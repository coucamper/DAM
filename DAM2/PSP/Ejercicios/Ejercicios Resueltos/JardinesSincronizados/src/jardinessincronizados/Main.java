/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jardinessincronizados;
// @author IMCG
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        RecursoJardin jardin = new RecursoJardin();
        //crea un objeto RecursoJard�n
        
        for (int i = 1; i <= 10; i++)
        {
            (new EntraJardin("Entra" + i, jardin)).start();
        }//entrada de 10 hilos al jard�n
        
        for (int i = 1; i <= 15; i++)
        {
            (new SaleJardin("Sale" + i, jardin)).start();
        }//salida de 15 hilos al jard�n
    }
}