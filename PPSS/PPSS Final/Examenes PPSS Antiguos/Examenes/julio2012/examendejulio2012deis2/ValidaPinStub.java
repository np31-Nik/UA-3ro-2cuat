/**
 * Esta es la clase Stub.
 * 
 * Aunque en el examen no se veian esos metodos
 * le pregunte a la profesora y me dijo que teniamos
 * que tomar como que estaban implementados en la clase
 * ValidaPin (no me acuerdo si ese era el nombre real)
 * aunque no estubieran en la hoja.
 */
class ValidaPinStub extends ValidaPin {

    private int valid_pin;
    private int count;

    /**
     * Utilizamos el simbolo '/' para
     * simbolizar el cancelar
     */ 
    private String[] inputs = null;

    /**
     * Constructor que nos ayuda a meter
     * los inputs del usuario falsos que
     * usaremos en los test y el pin valido
     */
    public ValidaPinStub(String[] inputs, int valid_pin) {
        this.inputs = inputs;
        this.valid_pin;
        this.count = 0;
    }

    /**
     * Este metodo obtiene del array la
     * introduccion que le toca segun
     * el contador
     *
     * @param pin_number El numero pin
     * que se introduce (suponemos que tiene
     * el metodo setPin y getPin).
     */
    @Override
    public String obtener_pin(Pin pin_number) {
        String input = inputs[count++];
        String ret = "";

        //Si el simbolo es '/' retornamos un cancelar
        if (input.equals("/")) {
            ret = "CANCEL";
        } else {
            //Sino es que es un numero
            pin_number.setPin(Integer.parseInt(input));
        }

        return ret;
    }

    /**
     * En este metodo metemos la logica del pin correcto
     */
    @Override
    public boolean comprobar_pin(Pin pin_number) {
        Integer pin = pin_number.getPin();

        //Si el pin es null o no es el que tenemos en la clase
        //no es valido
        if (pin == null || pin != this.valid_pin) {
            return false
        } else {
            //Si es el que tenemos en la clase es valido
            return true;
        }
    }
    
}
