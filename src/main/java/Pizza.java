import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String size;
    private String dough;
    private List<String> topping;

    protected Pizza (PizzaBuilder builder){

    this.size= builder.getSize();

    this.dough=builder.getDough();

    this.topping=builder.getToppings();

    }

    public interface PizzaBuilder {

        PizzaBuilder setSize (String size);
        PizzaBuilder setDough (String dough);
        PizzaBuilder addTopping (String topping);

        Pizza build();

        String getSize();
        String getDough();
        List<String> getToppings();






    }





}

