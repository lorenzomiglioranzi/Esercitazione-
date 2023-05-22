import java.util.*;
/**
 * Aggiungi qui una descrizione della classe Magazzino
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
class MagazzinoPieno extends Exception{

}
class ContainerNonPresente extends Exception{

}
class ContainerPresente extends Exception{

}
class PosizioneOccupata extends Exception{
    
} 
public class Magazzino implements Costanti
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    HashMap<Integer, Container>magazzino;

    /**
     * Costruttore degli oggetti di classe  Magazzino
     */
    public Magazzino(){
        magazzino = new HashMap<Integer, Container>(MAX); 
    }
    public void IngressoContainer(Container c)throws MagazzinoPieno, ContainerPresente, PosizioneOccupata{
        if(magazzino.size() >= MAX){
            new MagazzinoPieno(); 
        }
        if(magazzino.containsKey(c.getCodice())){
            new ContainerPresente(); 
        }
        if(magazzino.containsKey(c.getPosizione())){
            new PosizioneOccupata(); 
        }
        magazzino.put(c.getCodice(), c); 
    }
    public void UscitaMagazzino(int posizione)throws ContainerNonPresente{
        if(magazzino.isEmpty() || magazzino.containsKey(posizione)){
            new ContainerNonPresente(); 
        }else{
            magazzino.remove(posizione);
        } 
    }
    public String CercaContainer(int codice)throws ContainerNonPresente{
        if(magazzino.isEmpty() || magazzino.containsKey(codice)){
           new ContainerNonPresente();  
        }
        return magazzino.get(codice).toString(); 
    }
    public String TotCarico(){
        int tot = 0; 
        for(Container container : magazzino.values()){
            tot+=container.getCarico(); 
        }
        return "il carico totale di tutti i container e' di: "+tot; 
    }
    
    public int TotCaricoContainerRefrigerati(){
        int tot = 0; 
        for(Container c : magazzino.values()){
            if(c instanceof ContainerRefrigerati){
                tot+=c.getCarico();
            } 
        }
        return tot;
    }
    
}
