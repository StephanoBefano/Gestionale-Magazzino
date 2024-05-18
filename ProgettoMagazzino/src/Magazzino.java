import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefano.casti
 */
public class Magazzino {
    private ArrayList<Prodotto> ProdottiTotali;
    
    Magazzino(){
        ProdottiTotali = new ArrayList<>();
    }
    
    public void AggiungiProdotto(Prodotto prodotto) throws IllegalArgumentException { 
        for (Prodotto p : ProdottiTotali) {
            if (p.getCodice().equals(prodotto.getCodice())) {
                throw new IllegalArgumentException("Prodotto già esistente con questo codice");
            }
        }
        ProdottiTotali.add(prodotto);
        System.out.println("Prodotto aggiunto");
        
    }
    
    public void EliminaProdotto(String codice){
        for(int i = 0; i < ProdottiTotali.size(); i++){
            Prodotto attuale = ProdottiTotali.get(i);
            if(codice.equals(attuale.getCodice())){
                ProdottiTotali.remove(i);
                System.out.println("Prodotto eliminato");
            }
        }
    }
    public void ModificaProdotto(String codice, String nuovoNome, String nuovaDescrizione, int nuovaGiacenza, double nuovoPrezzo) {
        for (int i = 0; i < ProdottiTotali.size(); i++) {
            Prodotto attuale = ProdottiTotali.get(i);
            
            if(attuale.getCodice().equals(codice)){
                ProdottiTotali.get(i).setNome(nuovoNome);
                ProdottiTotali.get(i).setDescrizione(nuovaDescrizione);
                ProdottiTotali.get(i).setGiacenza(nuovaGiacenza);
                ProdottiTotali.get(i).setPrezzo(nuovoPrezzo);
                System.out.println("Prodotto modificato");    
 
                return;
            }
        }
    }
    
    public void VisualizzaProdotto(String codice) {
        for (Prodotto p : ProdottiTotali) {
            if (codice.equals(p.getCodice())) {
                JOptionPane.showMessageDialog(null, "Codice: " + p.getCodice() + "\nProdotto: " + p.getNome() +  "\nDescrizione: " + p.getDescrizione() + "\nGiacenza: " + p.getGiacenza() + "\nPrezzo: " + p.getPrezzo());
                return;  
            }
        }
            JOptionPane.showMessageDialog(null, "Prodotto non trovato con il codice: " + codice);
    }
    
    public void VisualizzaTuttiProdotti(){
        if (ProdottiTotali.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nessun prodotto nel magazzino.");
            return;
        }

        String messaggio = "";
        for (Prodotto p : ProdottiTotali) {
            messaggio += "Codice: " + p.getCodice() + "\nProdotto: " + p.getNome() + 
                        "\nDescrizione: " + p.getDescrizione() + "\nGiacenza: " + p.getGiacenza() +
                        "\nPrezzo: " + p.getPrezzo() + "\n\n";
        }

        JOptionPane.showMessageDialog(null, messaggio, "Elenco Prodotti", JOptionPane.INFORMATION_MESSAGE);
    }
}
