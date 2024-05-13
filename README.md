Este es mi repositorio en github: https://github.com/atortpot/Prueba4TDPAmador.git

El proyecto de simulación del problema de parar aborda un desafío clásico de la teoría de la computación introducido por Alan Turing, demostrando que algunos problemas son indecidibles, es decir, no hay soluciones algorítmicas generales que determinen si un programa terminará o continuará indefinidamente. Utilizando Java y una interfaz gráfica, este proyecto ilustra la simulación y exploración de este concepto complejo.
El sistema está compuesto por varias clases e interfaces que simulan el comportamiento de distintos programas en relación al problema de parar. Incluye la interfaz 'Programa' que define métodos esenciales como ejecutar() y seDetendra(), así como las clases 'ProgramaCuentaArriba' y 'ProgramaCuentaAtras' que representan contadores infinitos y regresivos, respectivamente. Además, la clase 'ProgramaHaltChecker' evalúa si un programa se detendrá, mientras que 'Reverser' altera su comportamiento en respuesta a estas predicciones, demostrando la influencia de las mismas sobre las acciones del sistema. La clase 'Main' configura la interfaz de usuario y gestiona la interacción con los programas simulados.
El desarrollo del proyecto se llevó a cabo en varias fases, desde la planificación de la arquitectura hasta la implementación y pruebas finales, empleando prácticas de programación orientada a objetos para mantener un código claro y mantenible. Uno de los principales desafíos fue hacer comprensible la indecidibilidad del problema de parar, lo cual se logró mediante programas con comportamientos claramente definidos y la utilización del 'Reverser'.
En conclusión, este proyecto no solo educa sobre conceptos teóricos de la computación, sino que también muestra prácticamente cómo estos principios teóricos pueden demostrarse a través de simulaciones. Las lecciones aprendidas resaltan la importancia de la teoría computacional tanto en la práctica del desarrollo de software como en la comprensión de los límites de lo computable.

Biblioteca Digital

Este proyecto consiste en una biblioteca digital implementada en Java, que permite crear, mostrar y ordenar medios digitales como libros, revistas y periódicos. Proporciona un diseño modular utilizando interfaces y clases para diferentes tipos de medios, junto con una estrategia de ordenación para ordenar los medios por título.

Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

DigitalMedia.java: Define la interfaz DigitalMedia, que proporciona métodos para mostrar y obtener el título de un medio digital.
Book.java: Implementa la clase Book, que representa un libro y proporciona métodos para mostrar y obtener su título.
Magazine.java: Implementa la clase Magazine, que representa una revista y proporciona métodos para mostrar y obtener su título.
Newspaper.java: Implementa la clase Newspaper, que representa un periódico y proporciona métodos para mostrar y obtener su título.
SortingStrategy.java: Define la interfaz SortingStrategy, que proporciona un método para ordenar una lista de medios digitales.
TitleSortingStrategy.java: Implementa la estrategia de ordenación por título, ordenando una lista de medios digitales alfabéticamente por sus títulos.
DigitalLibrarySystem.java: Contiene el método main, que crea una lista de medios digitales, los muestra antes y después de aplicar la estrategia de ordenación por título.
Uso del Proyecto

Para utilizar la biblioteca digital:

Clona o descarga el proyecto en tu entorno de desarrollo Java.
Compila el código fuente utilizando tu compilador Java favorito.
Ejecuta la clase DigitalLibrarySystem.
Observa la salida que muestra los medios digitales antes y después de aplicar la ordenación por título.
