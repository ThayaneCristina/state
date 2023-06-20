import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class VestidoTest {

    Vestido vestido;

    @BeforeEach
    public void setUp() {
        vestido = new Vestido();
    }

    // Vestido Disponível

    @Test
    public void DeveAlugarVestidoDisponivel() {
        vestido.setEstado(VestidoEstadoDisponivel.getInstance());
        assertTrue(vestido.alugar());
        assertEquals(VestidoEstadoAlugado.getInstance(), vestido.getEstado());
    }

    @Test
    public void DeveReservarVestidoDisponivel() {
        vestido.setEstado(VestidoEstadoDisponivel.getInstance());
        assertTrue(vestido.reservar());
        assertEquals(VestidoEstadoReservado.getInstance(), vestido.getEstado());
    }

    @Test
    public void DeveVenderVestidoDisponivel() {
        vestido.setEstado(VestidoEstadoDisponivel.getInstance());
        assertTrue(vestido.vender());
        assertEquals(VestidoEstadoVendido.getInstance(), vestido.getEstado());
    }

    @Test
    public void VestidoDisponivelNaoPodeIrParaManutencao() {
        vestido.setEstado(VestidoEstadoManutencao.getInstance());
        assertFalse(vestido.manutencao());
    }

    @Test
    public void VestidoDisponivelNaoPodeIrParaLavanderia() {
        vestido.setEstado(VestidoEstadoLavanderia.getInstance());
        assertFalse(vestido.lavar());
    }
}
