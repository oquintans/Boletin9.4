package ejercicio4;


import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Tabla {

    public void producto() {
        int num;
        String tabla = "";

        do {
            num = this.validarInt();
            if (num != 0) {
                for (int i = 1; i <= 10; i++) {
                    tabla = tabla + (num + "x" + i + "= " + (num * i) + "\n");

                }
                JOptionPane.showMessageDialog(null, tabla);
            }
            tabla = "";
        } while (num != 0);

    }

    private int validarInt() {
        int num;
        do {
            String dato = JOptionPane.showInputDialog(null, "Introduzca un número positivo.");
            num = Integer.parseInt(dato);
        } while (num < 0);

        return num;
    }
}
