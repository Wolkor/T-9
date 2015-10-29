package t9_p2;



public class Veiculo {

    private String placa;
    private int tipo;
    private long hora_entrada;
    private long hora_saida;
    
    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public long getHora_entrada() {
        return hora_entrada;
    }

    public long getHora_saida() {
        return hora_saida;
    }

    public void setHora_entrada(long hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public void setHora_saida(long hora_saida) {
        this.hora_saida = hora_saida;
    }
    
}
