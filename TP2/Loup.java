public class Loup extends Animal {
    public Loup(int poid,String couleur){
        this.poid=poid;
        this.couleur=couleur;
    }

@Override
    public void move(){
        System.out.println("Le loup fait quoi deja");
    }
@Override
    public void cry(){
        System.out.println("Le loup hurle : awouuuuuuuu");
    }
}
