/**
 * Aggiungi qui una descrizione della classe Container
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Container implements Comparable<Container>
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    protected int codice;
    protected int stazza; 
    protected int carico; 
    protected int posizione; 
    /**
     * Costruttore degli oggetti di classe  Container
     */
    public Container()
    {
        codice = 0; 
        stazza = 0; 
        carico = 0;
    }
    public Container(int codice, int stazza, int carico, int posizione){
        this.codice = codice; 
        this.stazza = stazza; 
        this.carico = carico; 
        this.posizione = posizione; 
    }
    //get
    public int getCodice(){return codice;}
    public int getStazza(){return stazza;}
    public int getCarico(){return carico;}
    public int getPosizione(){return posizione;}
    //set
    public void setCodice(int codice){this.codice = codice;}
    public void setStazza(int stazza){this.stazza = stazza;}
    public void setCarico(int carico){this.carico = carico;}
    public void setPosizone(int posizione){this.posizione = posizione;}
    
    public String toString(){
        return "codice: " + getCodice() +"\n stazza: "+getStazza()+"\n carico: "+getCarico()+"\n posizione nel magazzino: "+posizione;  
    }
    public int compareTo(Container c){
        if(getCodice() == c.getCodice()){
            return -1; 
        }else{
            return 0;
        }
    }  
}
