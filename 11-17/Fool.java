public interface Fool extends Creature implements Human{
    void talk();
    void watch();
    void hear();
    //さらに親インターフェースからrun()を継承する
    public void attack(Matango m){
        System.out.println(this.name+"は戦わずに遊んでいる");
    }
    //さらにHumanから継承した４つの抽象メソッドを実装
    public void talk(){}
    public void watch(){}
    public void hear()[]
        
    }

