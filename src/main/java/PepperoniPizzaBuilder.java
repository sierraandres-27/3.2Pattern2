import java.util.ArrayList;
import java.util.List;

public class PepperoniPizzaBuilder implements Pizza.PizzaBuilder{

    protected String size;
    protected String dough;
    protected List<String> topping=new ArrayList<>();


    @Override
    public PepperoniPizzaBuilder setSize(String size) {

        this.size=size;

        return this;
    }

    @Override
    public PepperoniPizzaBuilder setDough(String dough) {

        this.dough=dough;

        return this;
    }

    @Override
    public PepperoniPizzaBuilder addTopping(String topping) {

        this.topping.add(topping);

        return this;
    }

    @Override
    public Pizza build() {

        if (!topping.contains("Pepperoni")) topping.add("Pepperoni");
        if (!topping.contains("Mozzarella")) topping.add("Mozzarella");
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
