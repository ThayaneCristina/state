public abstract class VestidoEstado {

    public abstract String getEstado();

    public boolean disponivel(Vestido vestido) {
        return false;
    }

    public boolean reservar(Vestido vestido) {
        return false;
    }

    public boolean alugar(Vestido vestido) {
        return false;
    }

    public boolean manutencao(Vestido vestido) {
        return false;
    }

    public boolean lavar(Vestido vestido) {
        return false;
    }

    public boolean vender(Vestido vestido) {
        return false;
    }
}
