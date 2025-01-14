public class MestrePizzer {


    private Pizza.PizzaBuilder builder;

    public MestrePizzer(Pizza.PizzaBuilder builder) {
        this.builder = builder;
    }


    public Pizza makeForCheesePizza(String tamaño, String dough, String topping) {
        return builder
                .setSize(tamaño)
                .setDough(dough)
                .addTopping(topping)
                .build();
    }


    public Pizza makePepperoniPizza(String tamaño, String dough, String topping) {
        return builder
                .setSize(tamaño)
                .setDough(dough)
                .addTopping(topping)
                .build();
    }

}
