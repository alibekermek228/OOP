public class StarTriangle {
    private int width;
    public StarTriangle(int width){
        this.width = width;
    }
    public String toString(){
        String str= "";
        for(int i = 0;i < width;i++){
            for(int j = 0;j < i+1;j++){
                str += "[*]";
            }
            str += "\n";
        }
        return str;
    }

}
