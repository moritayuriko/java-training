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
    //計算以外で勝手にヒーローのHPとかよそのHPを書き換えない！
    int damege=h.hp/5;
    h.hp-=damege;

     System.out.println(damege+"ポイントのダメージ!");
}
    

}
}

