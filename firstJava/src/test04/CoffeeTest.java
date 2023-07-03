package test04;



public class CoffeeTest {
    public static void main(String[] args) {
        StarCoffee starcoffee=new StarCoffee();
        BeanCoffee beancoffee=new BeanCoffee();

        System.out.println(starcoffee.bewing(4000));
        System.out.println(starcoffee.bewing(4300));
        System.out.println(beancoffee.bewing(4100));
        System.out.println(beancoffee.bewing(4500));

        System.out.println(starcoffee.bewing(Menu.STARAMERICANO));
        System.out.println(beancoffee.bewing(Menu.BEANLATTE));


        //사람이 있고, 그 사람이 커피를 산다.
        Person kim = new Person("kim",10000);
        Person Lee = new Person("lee",10000);

        kim.buyStarCoffee(starcoffee, Menu.STARAMERICANO);
        Lee.buyBeanCoffee(beancoffee, Menu.BEANLATTE);
    }
}
