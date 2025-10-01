package org.example;

import java.io.*;

public class filtrarLineas {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.length() > 20) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer entrada estándar: " + e.getMessage());
        }
    }
}
