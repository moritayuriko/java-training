
    private String name;
  
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
//これはcode13-12の中身で6行目と7行目の間に挟んであげるやつでした！