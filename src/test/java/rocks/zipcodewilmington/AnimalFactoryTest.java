package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog()
    {
        //Given
        String name = "Simba";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);

        //When
        String actualName = dog.getName();
        Date actualBirthDaate = dog.getBirthDate();

        //Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDaate);

    }

    @Test
    public void testCreateCat()
    {
        //Given
        String name = "Whisky";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);

        //When
        String actualName = cat.getName();
        Date actualBirthDaate = cat.getBirthDate();

        //Then
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDaate);
    }
}
