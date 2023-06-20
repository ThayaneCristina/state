public class VestidoEstadoManutencao extends VestidoEstado {

    private VestidoEstadoManutencao () {};
    private static VestidoEstadoManutencao instance = new VestidoEstadoManutencao();
    public static VestidoEstadoManutencao getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em manutenção";
    }

    public boolean Reservar(Vestido vestido) {
        vestido.setEstado(VestidoEstadoReservado.getInstance());
        return true;
    }

}
