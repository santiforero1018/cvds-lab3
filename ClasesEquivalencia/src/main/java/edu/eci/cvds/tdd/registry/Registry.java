package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if(p.getAge() <= 0){
            return RegisterResult.INVALID_AGE;
        }
        else if(p.isAlive()){
            return RegisterResult.DEAD;
        }
        else if(p.getAge()<= 17 &&  p.getAge()>0){
            return RegisterResult.UNDERAGE;
        }
        return RegisterResult.VALID;
    }
}
