public class VestidoEstadoReservado extends VestidoEstado {

    private VestidoEstadoReservado () {};
    private static VestidoEstadoReservado instance = new VestidoEstadoReservado();
    public static VestidoEstadoReservado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reservado";
    }

    public boolean Manutencao(Vestido vestido) {
        vestido.setEstado(VestidoEstadoManutencao.getInstance());
        return true;
    }

    public boolean Lavar(Vestido vestido) {
        vestido.setEstado(VestidoEstadoLavanderia.getInstance());
        return true;
    }

}
