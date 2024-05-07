import java.io.*;
public class Main2 {

    public static void main(String[] args) {
        
        FileWriter fw = null;

        try {
            fw = new FileWriter("data.text");
            fw.write("あいうえお");
        } catch (IOException e) {
            System.out.println("エラーです。中断します。");
        }finally{
            if(fw!=null){
            try{
        fw.close();
    }catch(IOException e){
      ;
    }
}
        }
    }
}