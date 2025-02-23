abstract  public class Animal {
    protected  int poid ;
    protected  String couleur;

    public String getCouleur(){
        return couleur;
    }
    public void setCouleur(String couleur){
        this.couleur=couleur;
    }
    public int getPoid(){
        return poid;

    }
    public void setPoid(int poid){
        this.poid=poid;
    }
    public void manger(){
        System.out.println(" Je mange de la viande");
    }
    public void boire(){
        System.out.println(" Je bois de l'eau");

    }
    public abstract void move();
    public abstract void cry();
}
