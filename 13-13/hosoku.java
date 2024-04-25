public class hosoku {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name==null){
            throw new IllegalArgumentException
            ("名前がullである。処理を中断");
        }
        if(name.length()<=1){
            throw new IllegalArgumentException
            ("名前が短すぎる。処理を中断。");
        }  
        if(name.length()>=8){
            throw new IllegalArgumentException
            ("名前が長すぎる。処理を中断。");
        }         
        
        this.name=name;
    }
}
//因みにコード13-13と13-12をくっつけられるんじゃないか説はくっつけられた！てコードで、このファイルは復習用のおまけです