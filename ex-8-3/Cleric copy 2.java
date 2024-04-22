public class Cleric {
    String name;
    int hp=50;
    final int MaxHP=50;
    int mp=10;
    final int MaxMP=10;

    public void selfAid(){
    this.hp+=50;
    this.mp-=5;
    System.out.println(this.name+"は、セルフエイドを使った！");
    System.out.println(this.name+"のHPは"+this.hp+"になった!");
    // }     public void selfAid() {
    //     this.hp = MaxHP;
    //     this.mp -= 5;
    //     System.out.println(this.name + "は、セルフエイドを使った！");
    //     System.out.println(this.name + "のMPは" + 5 + "減った!");
    //     System.out.println(this.name + "のHPは最大になった!");
    // }
    
}
}