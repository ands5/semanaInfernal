
public class Formas {
    private String forma = "";

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Formas(String forma){
        this.forma=forma;
    }
    public void makeTriangule(){
        int ancho=3;

        if (!this.forma.matches("triangulo")) {
            System.out.println("esto no es un triangulo");
        }else {
            for (int fila = 0; fila <= ancho; fila++) {
                for (int columna = 0; columna <= fila; columna++) {
                    System.out.print("x");
                }
                System.out.println(" ");
            }
        }
    }



}