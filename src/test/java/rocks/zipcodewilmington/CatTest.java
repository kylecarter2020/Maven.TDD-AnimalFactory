package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class  CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a cat exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Tango";

        // When (a cat's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the cat)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void testSpeak() {
        // Given
        Cat cat = new Cat(null, null, null);
        String expectedBark = "meow!";

        // When
        String actualBark = cat.speak();

        // Then
        Assert.assertEquals(expectedBark, actualBark);
    }

    @Test
    public void testSetBirthDate() {
        // Given
        Cat cat = new Cat(null, null, null);
        Date birthDate = new Date();

        // When
        cat.setBirthDate(birthDate);

        // Then
        Date actualBirthDate = cat.getBirthDate();
        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void testEat() {
        // Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        int numberOfMeals = 2;

        // When
        cat.eat(food);
        cat.eat(food);

        // Then
        int actualNumberOfMeals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(numberOfMeals, actualNumberOfMeals);
    }

    @Test
    public void testGetID() {
        // Given (a name exists and a cat exists)
        int id = 23456;
        Cat cat = new Cat(null, null, id);

        // When
        int actualId = cat.getId();

        // Then
        Assert.assertEquals(id, actualId);
    }

    @Test
    public void testAnimalInheritance() {
        //Given
        Cat cat;

        //When
        cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue( cat instanceof Animal);

    }

    @Test
    public void testMammalInheritance() {
        //Given
        Cat cat;

        //When
        cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue( cat instanceof Mammal);
    }

}
