public class VestidoEstadoLavanderia extends VestidoEstado {

    private VestidoEstadoLavanderia () {};
    private static VestidoEstadoLavanderia instance = new VestidoEstadoLavanderia();
    public static VestidoEstadoLavanderia getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lavando";
    }

    public boolean Reservar(Vestido vestido) {
        vestido.setEstado(VestidoEstadoReservado.getInstance());
        return true;
    }

}
