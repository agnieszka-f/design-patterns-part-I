package builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void test1(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder().bun(TypeOfBun.WITH_SESAME)
                                                                .burgers(1)
                                                                .sauce(TypeOfSauce.BARBECUE)
                                                                .ingredient(Ingredient.CHEESE)
                                                                .ingredient(Ingredient.CHILLI)
                                                                .build();
         //When
        TypeOfBun typeOfBun = bigmac.getBun();
        TypeOfSauce typeOfSauce = bigmac.getSauce();
        int countOfBurgers = bigmac.getBurgers();
        int countOfIngredient = bigmac.getIngredients().size();
        Ingredient ingredient1 = bigmac.getIngredients().get(0);
        Ingredient ingredient2 = bigmac.getIngredients().get(1);

        //Then
        Assert.assertEquals(TypeOfBun.WITH_SESAME, typeOfBun);
        Assert.assertEquals(TypeOfSauce.BARBECUE, typeOfSauce);
        Assert.assertEquals(1,countOfBurgers);
        Assert.assertEquals(2,countOfIngredient);
        Assert.assertEquals(Ingredient.CHEESE,ingredient1);
        Assert.assertEquals(Ingredient.CHILLI, ingredient2);
    }
}
