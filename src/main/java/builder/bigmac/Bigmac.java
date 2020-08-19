package builder.bigmac;
import java.util.*;

public class Bigmac {
    private final TypeOfBun bun;
    private final int burgers;
    private final TypeOfSauce sauce;
    private List<Ingredient> ingredients;

    private Bigmac(TypeOfBun bun, int burgers, TypeOfSauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder{
        private TypeOfBun bun;
        private int burgers;
        private TypeOfSauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun(TypeOfBun bun){ this.bun = bun; return this; }
        public BigmacBuilder burgers(int count) { this.burgers = count; return this; }
        public BigmacBuilder sauce(TypeOfSauce sauce) {this.sauce = sauce; return this; }
        public BigmacBuilder ingredient(Ingredient ingredient){ this.ingredients.add(ingredient); return this; }
        public Bigmac build(){
            if( bun == null || burgers == 0 || sauce == null) throw new IllegalStateException("Nie został wybrany co najmniej jeden składnink Bigmaca");
            else return new Bigmac(bun,burgers,sauce,ingredients);
        }
    };

    public TypeOfBun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public TypeOfSauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }
}
