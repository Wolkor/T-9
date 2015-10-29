package t9_p2;

public class Estacionamento {

    private Veiculo elemento; 
    
    public Estacionamento() {
    }

    public float ValorAPagar(float precoHora){
        long tempo = elemento.getHora_saida() - elemento.getHora_entrada();
        return precoHora*tempo;
    }
    
    public Veiculo getElemento() {
        return elemento;
    }

    public void setElemento(Veiculo elemento) {
        this.elemento = elemento;
    }  
    
}
