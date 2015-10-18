package Test.io.zipcoder;

import io.zipcoder.*;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by pcano on 10/17/15.
 */
public class AbilitySpec {

    Person person1 = new Person();
    Ability ab1 = new Ability();


    @Test
    public void employmentTest() {

        person1.setEmployed(false);
        ab1.employment(person1);
        assertEquals("Testing for employment method", 30, ab1.employment(person1));
        //assertEquals("Testing for employment method", 27, ab1.employment(person1));
    }

}






