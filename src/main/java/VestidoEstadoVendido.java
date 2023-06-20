public class VestidoEstadoVendido extends VestidoEstado {

    private VestidoEstadoVendido () {};
    private static VestidoEstadoVendido instance = new VestidoEstadoVendido();
    public static VestidoEstadoVendido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Vendido";
    }
}
