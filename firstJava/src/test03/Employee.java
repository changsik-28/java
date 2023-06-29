package test03;

public class Employee {
    public static int serialNum=1000;
    //멥버변수( 인스턴스변수)
    private int employeeId;
    private String employeeName;
    private String department;
    //사원이 추가될때마다 serialNum 을 자동증가하게 하자
    public Employee(){
        serialNum++;
        employeeId=serialNum;
//        employeeId=serialNum++; 저장하고 나중에 증가해서 이건 안된다
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
        //return get EmployeeName()
    }
    public static int showName(){
        int name; //지역변수, 로컬변수
        name = serialNum;
        return name;
    }

    //static 메소드내부에서는 인스턴스변수,일반함수는 참조항수 없다.
    //static 메소드는 지역변수사용가능하고, static 변수만 사용가능하다.
    //인스턴스변수, 인스턴스메소드와 스테틱메소드는
    //시작부터가 다르다. 메모리에 로딩되는 시점이 다르다.
    //인스턴스변수는 인스턴스생성이 되어야 사용가능하다
    //static 변수나 메소드는 프로그램시작될때 자동로딩된다.
        public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
        System.out.println(employeeLee.serialNum);

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

        System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim.serialNum);
        System.out.println(Employee.serialNum++);
        System.out.println(employeeLee.serialNum);

        employeeLee.setEmployeeId(5000);
        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());

        Employee em3 = new Employee();
        System.out.println(em3.getEmployeeId());
        Employee em4 = new Employee();
        System.out.println(em4.getEmployeeId());

        //static 변수는 참조변수로 호출하지 말고, 클래스명.변수명으로 호출한다.
        Employee em5 = new Employee();
        System.out.println(em5.getEmployeeId());
        System.out.println(Employee.showName());

    }


}
