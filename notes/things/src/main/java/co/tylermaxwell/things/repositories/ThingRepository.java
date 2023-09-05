package co.tylermaxwell.things.repositories;

import java.util.ArrayList;


import co.tylermaxwell.things.models.Thing;

public class ThingRepository {

    Thing thing1 = new Thing("thing1", "cool", 3);
    Thing thing2 = new Thing("thing2", "rad", 4);
    Thing thing3 = new Thing("thing3", "sweet", 4);

    ArrayList<Thing> allThings = new ArrayList<>();

    {
        allThings.add(thing1);
        allThings.add(thing2);
        allThings.add(thing3);
    }

    public ArrayList<Thing> getAll(){
        return this.allThings;
    }

    public void addOne(Thing thing){
        allThings.add(thing);
    }

    public Thing getOneById(String id){
        for(Thing th : allThings){
            if(th.getId().equals(id)) return th;
        }

        return null;
    }

    public void update(String id, Thing thing){
        int index = 0;
        for(int i = 0; i < allThings.size(); i++){
            if(allThings.get(i).getId().equals(id)) index = i;
        }
        allThings.set(index, thing);
        
    }

    public void destroy(String id){}
    




    
}
