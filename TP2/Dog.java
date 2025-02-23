public class Dog extends Animal {
    
    public Dog(int poid,String couleur){
        this.poid=poid;
        this.couleur=couleur;
    }
    @Override
    public void move(){
        System.out.println(" Le chien fait quoi déjà ");
    }
@Override
    public void cry(){
        System.out.println("Le chien aboie : wouf wouf ");
    }
}

