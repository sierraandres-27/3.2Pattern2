public class Running {

    public static void start(){

        FourCheesePizzaBuilder fourcheesepizza= new FourCheesePizzaBuilder();
        MestrePizzer mestrepizza=new MestrePizzer(fourcheesepizza);
        Pizza pizza1=mestrepizza.makeForCheesePizza("Grande","Fina", "Orégano");

        System.out.println("Tu pizza 4 quesos: "+pizza1);


        PepperoniPizzaBuilder pepperonipizza =new PepperoniPizzaBuilder();
        MestrePizzer mestrePizza2 = new MestrePizzer(pepperonipizza);
        Pizza pizza2=mestrePizza2.makePepperoniPizza("Mediano","Gruesa","Olivas");

        System.out.println("Tu pizza de pepperoni: " +pizza2);



    }
}
