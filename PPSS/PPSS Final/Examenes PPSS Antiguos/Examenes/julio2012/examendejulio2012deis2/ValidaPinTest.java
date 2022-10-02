import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Clase de test con los dos test propuestos
 */
class ValidaPinTest {

    @Test
    public void testSaleDelWhilePorTresErrores() {
        ValidaPin vp = new ValidaPinStub(
                new String[]{"1234", "2222", "4444"},
                "3333");

        //Tiene que dar falso porque hemos metido tres
        //pines que no coinciden con el bueno
        assertFalse(vp.validar_PIN(new Pin());
    }

    @Test
    public void testSalePorCancelar() {
        //Lo inicializamos con el simbolo de cancelar
        ValidaPin vp = new ValidaPinStub(
                new String[]{"/"},
                "3333");

        //Tiene que dar false porque cancelamos
        //en la primera iteracion del while
        //con el primer input (El input de cancelar)
        assertFalse(vp.validar_PIN(new Pin());
    }
    
}
