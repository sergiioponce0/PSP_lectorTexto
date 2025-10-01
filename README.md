# 💻 Ejecución de Aplicaciones Java Empaquetadas (.JAR)

Este repositorio contiene la demostración de cómo ejecutar aplicaciones Java empaquetadas en archivos **.jar**, explorando tanto la **ejecución individual** como la **ejecución encadenada (pipelining)** a través de la línea de comandos[cite: 15].

El objetivo de este trabajo es afianzar los conocimientos sobre el funcionamiento de programas en Java y el uso de comandos básicos en entornos de consola[cite: 17]. [cite_start]Se busca comprender cómo redirigir la salida de una aplicación como entrada de otra, creando un flujo de trabajo automatizado[cite: 16, 42].

---

## 📄 Estructura del Proyecto

El trabajo se basa en tres aplicaciones Java empaquetadas:
1.  **`lectorTexto.jar`**: Probablemente genera un texto base.
2.  **`filtrarLineas.jar`**: Se encarga de procesar/filtrar la entrada de texto.
3.  **`contadorPalabras.jar`**: Cuenta las palabras de la entrada que recibe.

---

## 🚀 Comandos de Ejecución

### 1. Ejecución Individual

Para ejecutar cada programa de forma individual, se utiliza el comando estándar de `java -jar`Esto permite tener un control directo sobre cada aplicación.

```bash
java -jar nombreAplicacion.jar

