import javax.print.attribute.standard.PrinterInfo;

public class Restaurant {
    private String name;
    private Dish[] dish;
    private Drink[] drink;

    public Restaurant(String name, Dish dish[], Drink drink[]) {
        this.name = name;
        this.dish = dish;
        this.drink = drink;
    }


    public void stampaPiatti(Dish[] dish){
        for(int i = 0; i < dish.length; i++){
            // System.out.println("Piatto: " +dish[i].getName() + ", Prezzo: " + dish[i].getPrice() + "$");
            dish[i].infoPiatto();
        }
    }

    public void stampaDrink(Drink[] drink){
        for(int i = 0; i < drink.length; i++){
            System.out.println("Drink: " + drink[i].getName() + ", Prezzo: " + drink[i].getPrice() + "$ \n");
    }
    }

}
