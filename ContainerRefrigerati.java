
/**
 * Aggiungi qui una descrizione della classe ContainerRefrigerati
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class ContainerRefrigerati extends Container
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private double temp;

    /**
     * Costruttore degli oggetti di classe  ContainerRefrigerati
     */
    public ContainerRefrigerati()
    {
        super();
        temp = 0; 
    }
    public ContainerRefrigerati(int codice, int stazza, int carico, int posizione, double temp){
        super(codice, stazza, carico, posizione);
        this.temp = temp; 
    }
    public double getTemp(){return temp;}
    public void setTemp(double temp){this.temp = temp;}
    
    public String toString(){
        return super.toString() + "\n temperatura refrigerante: "+temp; 
    }
}
