/**
 * Constructores
 */
public class Constructores {

    public static void main(String[] args) {
        // Mesa mesa1 = new Mesa();
        Mesa mesa2 = new Mesa("centro", 3, "aluminio", "cromo", 3, 3);
        System.out.println("termino armar mesa");
        // System.out.println(mesa1);
        // System.out.println(mesa2.material); // no se puede acceder porque la
        // propiedad es privada

        System.out.println(mesa2);
        mesa2.valorPublico = 1;
        
        mesa2.setMaterial("acero"); // cambiamos el valor de material
        System.out.println(mesa2.getMaterial()); // obtenemos el valor de material
        System.out.println(mesa2);
    }
}