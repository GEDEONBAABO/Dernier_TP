public class Lion extends Animal {
    public Lion(int poid,String couleur){
        this.poid=poid;
        this.couleur=couleur;
    }
    @Override
    public void move(){
        System.out.println(" Le lion fait quoi déjà ");
    }
    @Override
    public void cry(){
        System.out.println("Le Lion rugit : grrrhhhhh");
    }
}

