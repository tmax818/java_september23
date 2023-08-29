public class Pet {

   private String name;
   private String type;
   private String[] tricks;
   private int health;
   private int energy;


    public Pet() {
        this.health = 100;
        this.energy = 100;
    }


    public Pet(String name, String type, String[] tricks, int health, int energy) {
        this.name = name;
        this.type = type;
        this.tricks = tricks;
        this.health = health;
        this.energy = energy;
    }

    public Pet(String name, String type, String[] tricks) {
        this();
        this.name = name;
        this.type = type;
        this.tricks = tricks;
    }

    public Pet sleep(){
        this.energy += 25;
        return this;
    }
    public Pet eat(){
        this.energy += 5;
        this.health += 10;
        return this;
    }
    public void play(){}
    public void noise(){}

    public void makeNoise(){
        System.out.printf("The %s made its noise!!\n", this.getClass().getSimpleName());
    }

    public String getName() {
        return this.name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTricks() {
        return this.tricks;
    }

    public void setTricks(String[] tricks) {
        this.tricks = tricks;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", tricks='" + getTricks() + "'" +
            ", health='" + getHealth() + "'" +
            ", energy='" + getEnergy() + "'" +
            "}";
    }


    
}
