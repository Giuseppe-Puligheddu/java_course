public class App {
    public static void main(String[] args) throws Exception {
        

        Dish dish = new Dish("Carbonara", "15", new String[]{"Pasta", "Guanciale", "Uova", "Pecorino"});
        Dish dish2 = new Dish("Amatriciana", "12", new String[]{"Pasta", "pomodori pelati", "guanciale", "Pecorino"});

        Dish[] mydishes = new Dish[2];

        mydishes[0] = dish;
        mydishes[1] = dish2;

        Drink drink = new Drink("Mojito", "10");
        Drink drink2 = new Drink("Americano", "8");

        Drink[] myDrinks = new Drink[2];

        myDrinks[0] = drink;
        myDrinks[1] = drink2;



        Restaurant rest = new Restaurant("Karma", mydishes, myDrinks);


        rest.stampaDrink(myDrinks);


        rest.stampaPiatti(mydishes);
        
        
        
    }

}
