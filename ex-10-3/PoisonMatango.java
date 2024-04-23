public class PoisonMatango extends Matango {
    int tekimp =5;
    public PoisonMatango (char suffix){
        super(suffix);
    }
    public void attack(Hero h){
    super.attack(h);
   if(this.tekimp!=0){
    
    System.out.println("さらに毒胞子をばらまいた！");
    this.tekimp-=1;
    h.hp=h.hp/5;

     System.out.println(h.hp+"ポイントのダメージ!");
}
    

}
}

