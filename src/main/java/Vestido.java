public class Vestido {

    private String modelo;
    private VestidoEstado estado;

    public Vestido() {
        this.estado = VestidoEstadoDisponivel.getInstance();
    }

    public void setEstado(VestidoEstado estado) {
        this.estado = estado;
    }

    public boolean disponivel() {
        return estado.disponivel(this);
    }

    public boolean reservar() {
        return estado.reservar(this);
    }

    public boolean alugar() {
        return estado.alugar(this);
    }

    public boolean manutencao() {
        return estado.manutencao(this);
    }

    public boolean lavar() {
        return estado.lavar(this);
    }

    public boolean vender() {
        return estado.vender(this);
    }

    public String getModeloEstado() {
        return estado.getEstado();
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public VestidoEstado getEstado() {
        return estado;
    }

}
