import java.util.ArrayList;
import java.util.List;

public class FourCheesePizzaBuilder implements Pizza.PizzaBuilder {

    protected String size;
    protected String dough;
    protected List<String> topping = new ArrayList<>();

    @Override
    public FourCheesePizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public FourCheesePizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }
    @Override
    public FourCheesePizzaBuilder addTopping (String topping){


        this.topping.add(topping);



        return this;
    }
    @Override
    public Pizza build (){

        if (!topping.contains("Mozzarella")) topping.add("Mozzarella");
        if (!topping.contains("Cheddar")) topping.add("Cheddar");
        if (!topping.contains("Parmesan")) topping.add("Parmesan");
        if (!topping.contains("Gorgonzola")) topping.add("Gorgonzola");

        return new Pizza(this);

    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public String getDough() {
        return this.dough;
    }

    @Override
    public List<String> getToppings() {
        return this.topping;
    }


}




