public class Dish {
    private String name;
    private String price;
    private String[] ingredients;
    
    public Dish(String name, String price, String[] ingredients) {
        this.setName(name);
        this.setPrice(price);
        this.setIngredients(ingredients);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPrice() {
        return price;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }


    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void infoPiatto() {
        System.out.println("Piatto: " + name);
        System.out.println("Prezzo: " + price + "$ ");
        System.out.print("Ingredienti: ");
        for (String ingredient : ingredients) {
            System.out.print(ingredient + " " + "\n");
        }
        System.out.println();
    }


    

}
