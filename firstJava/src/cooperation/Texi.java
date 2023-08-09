package cooperation;

public class Texi {
    String texiName;
    int money;

    public Texi(String texiName){
        this.texiName =texiName;
        this.money = 0;
    }
    public void take(){
        this.money += 10000;
    }
    public void showTexi(){
        System.out.println(texiName+"택시 수입은 "+money+"입니다");
    }

}
