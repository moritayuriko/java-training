public class Wand {
    public String name;// 杖の名前
    public double power;// 杖の魔力

    public String getName() {
        return this.name;
    }

    public double getpower() {
        return this.power;

    }

    public void setName(String name) {
        // 記述
        if(name.length()<=3){
            throw new IllegalArgumentException
            ("杖の名前が三文字以下。処理を中断");
        }
        this.name = name;
}
public void setPower(double power){
  
        if(!(0.5<=power&&power<=100)){
            throw new IllegalArgumentException
            ("杖による増幅率は0.5以上100以下である。処理を中断。");
        }
    this.power=power;
}

}
