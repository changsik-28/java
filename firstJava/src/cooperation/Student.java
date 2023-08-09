package cooperation;

public class Student {
    //이름, 학년, 가진돈을 멤버 변수로 선언한다. ( studentName, grade, money)
    String studentName;
    String grade;
    int money;
    //학생의 이름과 가진돈을 매개변수로 가지는 생성자 함수를 만든다.
    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }
    //학생이 버스를 타면 1,250원을 지불하는 메서드를 구현한다. ( takeBus() )
    public void takeBus(Bus bus){
        if(this.money < 1250){
            System.out.println(this.studentName + "학생은 버스를 탈수 없습니다");
            return;
        }
        this.money -= 1250;
        bus.take();
        System.out.println(this.studentName + "학생이 "+bus.busNumber+"버스를 탑니다.");
    }

    public void takeSubway(Subway subway){
        if(this.money < 1250){
            System.out.println(this.studentName + "학생은 지하철을 탈수 없습니다");
            return;
        }
        this.money -= 1250;
        subway.take();
        System.out.println(this.studentName + "학생이 지하철을 탑니다.");
    }

    public void takeTexi(Texi texi){
        this.money -= 10000;
        texi.take();
        System.out.println(this.studentName + "학생이 택시를 탑니다");
    }
    public void showInfo(){
        System.out.println(studentName+"학생의 남은 돈은 "+money+"입니다");
    }
}
