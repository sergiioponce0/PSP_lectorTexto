package org.example;

import java.io.*;

public class contadorPalabras {
    public static void main(String[] args) {
        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en palabras separadas por espacios
                String[] palabras = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    totalPalabras += palabras.length;
                }
            }
            System.out.println("Número total de palabras: " + totalPalabras);
        } catch (IOException e) {
            System.err.println("Error al leer entrada estándar: " + e.getMessage());
        }
    }
}
