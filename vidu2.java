public class vidu2 {
    private String name;
    public vidu2 (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        vidu2 bkitvidu2 = new vidu2 ("Nguyen Khanh");
        System.out.println("Ten: "+bkitvidu2.getName());
    }


}
