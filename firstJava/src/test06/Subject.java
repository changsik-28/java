package test06;

public class Subject {
//멤버 변수 선언 (private : 이름(name), 점수 (scorePoint)
    private String name;
    private int scorePoint;
    //사용할 수 있도록 getter 와 setter 를 만들어 사용할 수 있도록 한다

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }
}
