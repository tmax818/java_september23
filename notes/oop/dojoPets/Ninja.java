public class Ninja {

    private String firstName;
    private String lastName;
    private Pet pet;
    private int treats;
    private String petFood;


    public Ninja(String firstName, String lastName, Pet pet, int treats, String petFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pet = pet;
        this.treats = treats;
        this.petFood = petFood;
    }



    public void walk(){
        this.pet.play();
    }
    public void feed(){
        this.pet.eat();
    }
    public void bathe(){}


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPetFood() {
        return this.petFood;
    }

    public void setPetFood(String petFood) {
        this.petFood = petFood;
    }


    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", pet='" + getPet() + "'" +
            ", treats='" + getTreats() + "'" +
            ", petFood='" + getPetFood() + "'" +
            "}";
    }



}