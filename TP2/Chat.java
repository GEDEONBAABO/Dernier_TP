public class Chat extends Animal {
    
    public Chat(int poid,String couleur){
        this.poid=poid;
        this.couleur=couleur;

    
    }
@Override
    public void move(){
        System.out.println("Le chat fait quoi");
    }
@Override
    public void cry(){
        System.out.println("Le chat miaule : miaouh ");
    }
}
