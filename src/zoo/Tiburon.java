package zoo;

/**
 *
 * @author Rafa
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /**
     * Clase que determina informacion sobre tiburones
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * Constructor parametrizado para la clase tiburon
     * @param especie especie a la que pertenece
     * @param peligroso determina el grado de peligrosidad
     * @param velocidadMaxNatacion determina la velocidad maxima a la que nada
     * @param tipo determina de que tipo de animal es
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie; 
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * Constructor parametrizado mas especifico que el anterior
     * @param especie especie a la que pertenece
     * @param peligroso determina el grado de peligrosidad
     * @param velocidadMaxNatacion determina la velocidad maxima a la que nada
     * @param tipo determina de que tipo de animal es
     * @param habitat determina en que entorno habita
     * @param comida determina que de que se alimenta
     * @param longevidad determina cuanto vive
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * Comunica a que velocidad nada el tiburon
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * Comunica que alimento come el tiburon
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /**
     * Reduce el numero de tiburones
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
