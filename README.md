# 3.1_Patterns_Level_2

## Builder

Desarrolla un sistema de gestión de pedidos de pizzas utilizando el patrón de diseño Builder en Java. El sistema debe permitir la creación de diferentes tipos de pizzas con configuraciones de tamaño, masa e ingredientes distintos.

-Define una clase Pizza con los siguientes atributos:
size (tamaño)
dough (tipo de masa)
toppings (ingredientes)

-Crea una interfaz PizzaBuilder con los métodos necesarios para configurar el tamaño, la masa y los ingredientes de una pizza.

-Implementa una o más clases que actúen como constructores concretos (PizzaBuilder) para distintos tipos de pizzas. Por ejemplo, podría tener un constructor para la pizza hawaiana, otro para la pizza vegetariana, etc.

-Desarrolla una clase MestrePizzer que reciba un PizzaBuilder y que permita construir pizzas de forma específica.

-En el programa principal (Main), crea instancias de PizzaBuilder y de MestrePizzer, y utilízalos para construir pizzas con diferentes configuraciones.
