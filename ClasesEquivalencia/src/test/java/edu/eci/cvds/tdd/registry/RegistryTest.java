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

    @Test
    public void isDead (){
        Gender gender = Gender.MALE;
        Person person = new Person("NOMBRE x",  15, 56, gender, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);  
    }

    @Test
    public void isUnderAge (){
        Gender gender = Gender.MALE;
        Person person = new Person("Dany",  1018, 13, gender, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);  
    }

    @Test
    public void isDuplicade (){
        Gender gender = Gender.MALE;
        Person person = new Person("andrea",  121, 45, gender, true);
        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);  
    }
   
}