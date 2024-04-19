public class Main{
    public static void main(String[]args){
int yusya_hp = 100;
int mantago_hp=50; 
int mantago2_hp=48;
String yusya_name="ミナト";
int mantago1_level = 10;
int mantago2_level= 10;
System.out.println(yusya_name+"は５秒座った！");
yusya_hp+=5;
System.out.println("HPが5ポイント回復した");
System.out.println("ミナトは、転んだ！");
yusya_hp-=5;
System.out.println("５ダメージ！");
System.out.println("ミナトは25秒座った!");
yusya_hp+=25;
System.out.println("HPが25ポイント回復した!");
System.out.println("ミナトは逃げ出した！");
System.out.println("GAMEOVER");
System.out.println("最終HPは"+yusya_hp+"でした");


    }
}