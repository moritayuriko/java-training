public abstract class TangibleAsset implements Asset,Thing{
    String name;
    String price;
    String color;
    double weight;
    
    public void tokutyou (){
        this.name=name;
        this.price=price;
        this.color=color;
    
    }
    public String getName(){return this.name;}
    public String getPrice(){return this.price;}
    public String getColor(){return this.color;}

}

