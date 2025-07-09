package petShop;

public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;




    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Nenhum pet selecionado.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " tomou banho.");
    }

    public void addWatter(){
        if (water == 30) {
            System.out.println("O reservatório de água já está cheio.");
            return;

        }
        water+= 2;
    }
        public void addShampoo(){
            if (shampoo == 10) {
                System.out.println("O reservatório de shampoo já está cheio.");
                return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }
    public int getWater() {
        return water;
    }
    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("Por favor limpe a máquina antes de colocar outro pet.");
            return;
        }
        if(hasPet()) {

            System.out.println("Já existe um pet na máquina.");
            return;
        }
        this.pet = pet;
        System.out.printf("Pet %s adicionado com sucesso na máquina!\n", pet.getName());
    }
    public void removePet() {
        this.clean = this.pet.isClean();

        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina.");
        this.pet = null;
    }
    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina foi lavada.");
    }
}
