#  Sistema de Gestión de Ciudades

###  Taller 1 - Programación I (2026-I)


##  Descripción

Este proyecto consiste en el desarrollo de un sistema en Java para la gestión de información de ciudades. Permite administrar entidades como hospitales, alcaldes, edificios municipales y barrios mediante operaciones CRUD.

El sistema está basado en los principios de la Programación Orientada a Objetos (POO).


##  Objetivo

Aplicar conceptos fundamentales de POO como:

* Herencia
* Asociación
* Agregación
* Composición
* Uso de listas dinámicas (`ArrayList`)


##  Estructura del Proyecto

El sistema está compuesto por las siguientes clases:

###  City (Clase principal)

Representa una ciudad con atributos como:

* Código postal
* Nombre
* País
* Población
* Área
* Clima


###  Neighborhood (Herencia)

Clase hija de `City` que representa un barrio.


###  Mayor (Asociación)

Representa el alcalde de una ciudad.


###  Hospital (Agregación)

Entidad asociada a la ciudad, pero independiente de su existencia.


###  MunicipalBuilding (Composición)

Entidad que depende directamente de la ciudad.


###  CityServices

Clase encargada de gestionar las operaciones CRUD utilizando `ArrayList`.


##  Relaciones UML

* **Herencia:** `Neighborhood → City`
* **Asociación:** `City ↔ Mayor`
* **Agregación:** `City ◇ Hospital`
* **Composición:** `City ◆ MunicipalBuilding`


##  Funcionalidades

El sistema permite:

* Crear registros
* Consultar registros por ID
* Actualizar información
* Eliminar registros
* Mostrar todos los datos


##  Tecnologías utilizadas

* Java
* Programación Orientada a Objetos (POO)
* ArrayList


##  Ejecución

1. Compilar el proyecto
2. Ejecutar la clase `Main`
3. Usar el menú interactivo en consola


##  Autor

Estudiante de Programación I, Karoll Daniela Pérez Ortíz - COD 202521888
Taller académico - Universidad UPTC


##  Nota

Este proyecto fue desarrollado como parte del Taller 1, cumpliendo con todos los requisitos solicitados, incluyendo modelado UML y uso de estructuras dinámicas.
