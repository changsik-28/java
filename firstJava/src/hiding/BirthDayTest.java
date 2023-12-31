package hiding;
//정보은닉(information hiding)
class BirthDay{
    //private class 안에서만 사용할 수 있는 접근제어자이다.
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month == 2){
            if(day<1 || day>28) {
                System.out.println("날짜 오류입니다");
            }
        }else{
            this.day = day;
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BirthDayTest {
    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.setMonth(2);
        day.setDay(30);
        day.setYear(2022);
    }
}
