
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test
{
    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    public static void main(String[] args)
    {
        Container c1 = new Container(12, 5, 45, 1);
        Container c2 = new Container(30, 7, 10, 2);
        Container c3 = new Container(4657, 3, 4, 1);
        ContainerRefrigerati cr1 = new ContainerRefrigerati (5333, 10, 100, 4, 4.5); 
        Magazzino m1 = new Magazzino(); 
        

        try
        {
            m1.IngressoContainer(c1);
            System.out.println("riuscito");
        }
        catch (PosizioneOccupata po)
        {
            po.printStackTrace();
        }
        catch (ContainerPresente cp)
        {
            cp.printStackTrace();
        }
        catch (MagazzinoPieno mp)
        {
            mp.printStackTrace();
        }
        try
        {
            m1.IngressoContainer(c2);
            System.out.println("riuscito");
        }
        catch (PosizioneOccupata po)
        {
            po.printStackTrace();
        }
        catch (ContainerPresente cp)
        {
            cp.printStackTrace();
        }
        catch (MagazzinoPieno mp)
        {
            mp.printStackTrace();
        }
        try
        {
            m1.IngressoContainer(c3);
            System.out.println("riuscito");
        }
        catch (PosizioneOccupata po)
        {
            po.printStackTrace();
        }
        catch (ContainerPresente cp)
        {
            cp.printStackTrace();
        }
        catch (MagazzinoPieno mp)
        {
            mp.printStackTrace();
        }
        try
        {
            m1.IngressoContainer(cr1);
            System.out.println("riuscito");
        }
        catch (PosizioneOccupata po)
        {
            po.printStackTrace();
        }
        catch (ContainerPresente cp)
        {
            cp.printStackTrace();
        }
        catch (MagazzinoPieno mp)
        {
            mp.printStackTrace();
        }
        
        c3.setPosizone(3); 
        System.out.println("riuscito");
        try
        {
            System.out.println(m1.CercaContainer(c2.getCodice()));
        }
        catch (ContainerNonPresente cnp)
        {
            cnp.printStackTrace();
        }
        
        try
        {
            m1.UscitaMagazzino(c3.getCodice());
            System.out.println("riuscito");
        }
        catch (ContainerNonPresente cnp)
        {
            cnp.printStackTrace();
        } 
        
        System.out.println(m1.TotCarico()); 
        System.out.println(m1.TotCaricoContainerRefrigerati()); 
    }
}
