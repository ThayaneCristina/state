public class VestidoEstadoDisponivel extends VestidoEstado {

    private VestidoEstadoDisponivel () {};
    private static VestidoEstadoDisponivel instance = new VestidoEstadoDisponivel();
    public static VestidoEstadoDisponivel getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Disponível";
    }

    public boolean alugar(Vestido vestido) {
        vestido.setEstado(VestidoEstadoAlugado.getInstance());
        return true;
    }

    public boolean Reservar(Vestido vestido) {
        vestido.setEstado(VestidoEstadoReservado.getInstance());
        return true;
    }

    public boolean Vender(Vestido vestido) {
        vestido.setEstado(VestidoEstadoVendido.getInstance());
        return true;
    }
}
