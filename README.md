🍦 Sistema de Menú para Heladería en Java

Este proyecto implementa un programa orientado a menús para una
heladería, con dos versiones:

1.  Versión con función genérica:
    Un solo método es capaz de generar cualquier menú, reduciendo código
    duplicado.

2.  Versión refactorizada con POO:
    Se organiza el código en tres clases principales:

    -   Helado → Representa un helado con su sabor, receta y
        complemento.
    -   BackEndHeladeria → Controla todas las operaciones CRUD (crear,
        leer, actualizar, borrar).
    -   MenuHeladeria → Gestiona la presentación de menús y la
        interacción con el usuario.
    -   Main → Clase principal que ejecuta el programa.

------------------------------------------------------------------------

📂 Estructura del proyecto

    📦 HeladeriaJava
     ┣ 📂 src
     ┃ ┣ 📂 HELADERIA
     ┃ ┃ ┣ 📜 Helado.java
     ┃ ┃ ┣ 📜 BackEndHeladeria.java
     ┃ ┃ ┣ 📜 MenuHeladeria.java
     ┃ ┃ ┣ 📜 Main.java
     ┃ ┗ 📜 README.md

------------------------------------------------------------------------

🚀 Ejecución

1.  Clonar el repositorio:

    git clone https://github.com/tu-usuario/HeladeriaJava.git
    cd HeladeriaJava/src

2.  Compilar los archivos:

    javac HELADERIA/*.java

3.  Ejecutar el programa:

    java HELADERIA.Main

------------------------------------------------------------------------

🛠️ Tecnologías utilizadas

-   Lenguaje: Java 8+
-   Paradigma: Programación Orientada a Objetos (POO)
-   Ejecución: Consola / Terminal

------------------------------------------------------------------------

📖 Ejemplo de uso

Menú principal

    🍦 Bienvenido a Heladerías El Hielo 🍦
    1. Agregar helado
    2. Mostrar helados
    3. Actualizar helado
    4. Borrar helado
    5. Salir
    👉 Digite su opción:

Ejemplo de registro

    Sabor: Fresa
    Receta: Con crema batida
    Complemento: Galleta

Resultado

    1. Helado de Fresa | Receta: Con crema batida | Complemento: Galleta

------------------------------------------------------------------------

✅ Características

-   Creación de helados con sabor, receta y complemento.
-   Visualización de todos los helados registrados.
-   Edición de un helado ya existente.
-   Eliminación de helados.
-   Menú interactivo en consola.
-   Código organizado y reutilizable.

------------------------------------------------------------------------

📌 Próximas mejoras

-   Persistencia en archivos (guardar y cargar helados).
-   Soporte para interfaz gráfica (JavaFX o Swing).
-   Implementación de pruebas unitarias.

------------------------------------------------------------------------

👩‍💻 Autor

-   Proyecto académico desarrollado por Juan Sebastian Melo Melo - Miguel Salazar
------------------------------------------------------------------------

📜 Licencia

Este proyecto se distribuye bajo la licencia MIT, lo que significa que
puedes usarlo, modificarlo y distribuirlo libremente.
