public class VestidoEstadoAlugado extends VestidoEstado {

    private VestidoEstadoAlugado () {};
    private static VestidoEstadoAlugado instance = new VestidoEstadoAlugado();
    public static VestidoEstadoAlugado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Alugado";
    }

}
