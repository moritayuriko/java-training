public abstract class TangibleAsset {
    String name;
    String price;
    String color;
    String isbn;
    String makerName;
    public void Book(String name,String price,String color,String isbn){
        this.name=name;
        this.price=price;
        this.color=color;
        this.isbn=isbn;
    }
    public void Computer(String name,String price,String color,String makerName){
        this.name=name;
        this.price=price;
        this.color=color;
        this.makerName=makerName;
    }
}


