package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;
public class Registry {
    private ArrayList<Integer> idPerson;

    public Registry (){
        idPerson = new ArrayList<Integer>();
    }
    public RegisterResult registerVoter(Person p) {
        int idP = p.getId();
        if(idPerson.contains(idP)){
            return RegisterResult.DUPLICATED;
        }
        else if(p.getAge() <= 0){
            return RegisterResult.INVALID_AGE;
        }
        else if(!p.isAlive()){
            return RegisterResult.DEAD;
        }
        else if(p.getAge()<= 17 &&  p.getAge()>0){
            return RegisterResult.UNDERAGE;
        }
        else{
            idPerson.add(idP);
            return RegisterResult.VALID;
        }
    }
}
