/**
 * Mesa
 */
public class Mesa {

    private final String MARCA;
    private String tipo;
    private int nPatas;
    private String material;
    private int largo;
    private int ancho;
    private String color;
    private boolean bonita;
    public int valorPublico;
    
    static{System.out.println("soy un inicializador estatico 1ro");}

    {System.out.println("me ejecuto primero");}
    
    static{System.out.println("soy un inicializador estatico2do");}
    { MARCA = "Marca machina"; System.out.println("bloque inicializador 2do");}
    
    static{System.out.println("soy un inicializador estatico3ro");}

    public Mesa(){
        this("COMEDOR");
        System.out.println("termino constructor default");
    }
    
    public Mesa(String tipo){
        this(tipo, 4);
        System.out.println("termino a constructor(tipo)");
    }
    
    public Mesa(String tipo, int nPatas){
        this(tipo, nPatas, "madera");
        System.out.println("termino a constructor(tipo, nPatas)");
    }
    public Mesa(String tipo, int nPatas, String material){
        this(tipo, nPatas, material, "chocolate");
        System.out.println("termino a constructor(tipo, nPatas, material)");
    }

    
    public Mesa(String tipo, int nPatas, String material, String color){
        this(tipo, nPatas, material, color, 5, 10);
        System.out.println("termino a constructor(tipo, nPatas, material, color)");
    }

    public Mesa(String tipo, int nPatas, String material, String color, int largo, int ancho){
        this.tipo = tipo;
        this.nPatas = nPatas;
        this.material = material;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.bonita = true;
        System.out.println("termino a constructor(tipo, nPatas, material, color, largo, ancho)");
    }

    {System.out.println("me ejecuto 3ro");}

    @Override
    public String toString() {
        return "Marca: " +  MARCA + 
            "\nMesa de tipo: " + tipo
            +   "\nColor: " + color
            +  "\nnumero de patas: " + nPatas
            +   "\nMaterial: " + material
            +   "\nMedidas: " + largo  + " x " + ancho;
    }


    public String getMARCA() {
        return MARCA;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getnPatas() {
        return nPatas;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBonita() {
        return bonita;
    }

    public void setBonita(boolean bonita) {
        this.bonita = bonita;
    }

    public int getValorPublico() {
        return valorPublico;
    }

    public void setValorPublico(int valorPublico) {
        this.valorPublico = valorPublico;
    }

}