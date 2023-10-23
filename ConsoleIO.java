import javax.swing.*;

// Programa de lectura y escritura de datos por consola

public class ConsoleIO {
    public static void main(String[] args) {
        //lectura de un numero
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero decima: ");
        // capital letters
        int numDecimal = 0;
        try {
            numDecimal = Integer.parseInt(numeroStr);
        } //catch (NumberFormatException e ) {
        catch (Exception e){
        JOptionPane.showInputDialog(null, "Dijite bien >:v : ");
        //recursiva
        main(args);
        System.exit(0);
        }

        //transformacion de un numero decimal en una cadena de caracteres
        String resulDecimal = "El numero decimal de : " + numDecimal + " = " + Integer.toString(numDecimal);
        System.out.println(resulDecimal);
        //transformacion de un numero decimal a binario
        String resulBinario = "El numero Binario de : " + numDecimal + " = " + Integer.toBinaryString(numDecimal);
        System.out.println(resulBinario);
        //transformacion de numero decimal a Octal
        String resulOctal="El numero Octagonal de : " + numDecimal + " = " + Integer.toOctalString(numDecimal);
        System.out.println(resulOctal);
        //transformacion de numero decimal a hexadecimal
        String resulhexa = "El numero Hexagonal de : " + numDecimal + " = " + Integer.toHexString(numDecimal);
        System.out.println(resulhexa);

        // en el despliegue de los sistemas numericos

        String mensaje = resulDecimal + "\n";
        mensaje += resulBinario+ "\n";
        mensaje += resulOctal+ "\n";
        mensaje+= resulhexa;

        // Despliegue del contenido

        JOptionPane.showInputDialog(null, mensaje);

    }
}

