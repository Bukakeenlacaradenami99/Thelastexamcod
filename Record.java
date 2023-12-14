/**
 * clase record
 * @author cristian regueiro martinez
 * @version 1.0
 */
public class Record {

    /**
     * atributos de la clase record
     */
    private String alias;
    private int puntuacion;

    /**
     * constructor por defecto
     */
    public Record() {

    }

    /**
     * constructor parametrizado de la clase record
     * @param alias el nombre del jugador
     * @param puntuacion su puntuacion
     */
    public Record(String alias, int puntuacion) {
        this.alias = alias;
        this.puntuacion = puntuacion;
    }

    /**
     * los getter y los setter
     * @return sus atributos correspondientes
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
