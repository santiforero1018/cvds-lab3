package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Gender gender = Gender.FEMALE;
        Person person = new Person("andrea",  121, 45, gender, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);  
    }

    @Test
    public void invalIdAGE (){
        Gender gender = Gender.FEMALE;
        Person person = new Person("SOFIA",  12, -1, gender, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);  
    }

}
