public class Cleric {
    String name;
    int hp=50;
    final int HP=50;
    int mp=10;
    final int MP=10;

    public void selfAid(){
    this.hp+=50;
    this.mp-=5;
    System.out.println(this.name+"は、セルフエイドを使った！");
    System.out.println(this.name+"のHPは"+this.hp+"になった!");
    }
    
}
