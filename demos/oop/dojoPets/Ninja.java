public class Ninja {

    private String first_name;
    private String last_name;
    private Pet pet;
    private int treats;
    private String pet_food;


    public Ninja(String first_name, String last_name, Pet pet, int treats, String pet_food) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.pet = pet;
        this.treats = treats;
        this.pet_food = pet_food;
    }



    public void walk(){}
    public void feed(){
        this.pet.eat();
    }
    public void bathe(){}


    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Pet getPet() {
        return this.pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int getTreats() {
        return this.treats;
    }

    public void setTreats(int treats) {
        this.treats = treats;
    }

    public String getPet_food() {
        return this.pet_food;
    }

    public void setPet_food(String pet_food) {
        this.pet_food = pet_food;
    }


    @Override
    public String toString() {
        return "{" +
            " first_name='" + getFirst_name() + "'" +
            ", last_name='" + getLast_name() + "'" +
            ", pet='" + getPet() + "'" +
            ", treats='" + getTreats() + "'" +
            ", pet_food='" + getPet_food() + "'" +
            "}";
    }



    }