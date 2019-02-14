package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testDog() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Integer id = 12345;
        Dog dog = new Dog(name, birthDate, id);

        // When
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        // Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
        Assert.assertEquals(id, actualId);
    }

    @Test
    public void testSpeak() {
        // Given
        Dog dog = new Dog(null, null, null);
        String expectedBark = "bark!";

        // When
        String actualBark = dog.speak();

        // Then
        Assert.assertEquals(expectedBark, actualBark);
    }

    @Test
    public void testSetBirthDate() {
        // Given
        Dog dog = new Dog(null, null, null);
        Date birthDate = new Date();

        // When
        dog.setBirthDate(birthDate);

        // Then
        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void testEat() {
        // Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        int numberOfMeals = 2;

        // When
        dog.eat(food);
        dog.eat(food);

        // Then
        int actualNumberOfMeals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(numberOfMeals, actualNumberOfMeals);
    }

    @Test
    public void testGetID() {
        // Given (a name exists and a dog exists)
        int id = 23456;
        Dog dog = new Dog(null, null, id);

        // When
        int actualId = dog.getId();

        // Then
        Assert.assertEquals(id, actualId);
    }

    @Test
    public void testAnimalInheritance() {
        //Given
        Dog dog;

        //When
        dog = new Dog(null, null, null);

        //Then
        Assert.assertTrue( dog instanceof Animal);

    }

    @Test
    public void testMammalInheritance() {
        //Given
        Dog dog;

        //When
        dog = new Dog(null, null, null);

        //Then
        Assert.assertTrue( dog instanceof Mammal);
    }


}
