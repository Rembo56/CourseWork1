public class Employee {
    private String name;
    private int salary;
    private int depart;
    private static int counter=0;
    private int id;

    public String getInfo(){
        return this.id+" "+this.name+" "+this.depart+" "+this.salary;
    }

    public String getName(){
        return this.name;
    }


    public int getDepart(){
        return this.depart;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getId(){
        return this.id;
    }

    public Employee(String name,int depart,int salary){
        this.name=name;
        this.depart=depart;
        this.salary=salary;
        id = counter++;
    }

    public void setDepart(int depart){
        this.depart=depart;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    static void employeeList(Employee[]employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getInfo());
            }
        }
    }

    static int salarySume(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }return sum;
    }

    static int salaryMin(Employee[] employees){
        int min = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                if (min > employees[i].getSalary()) {
                    min = employees[i].getSalary();
                }
            }
        }
            return min;
    }

    static int salaryMax(Employee[] employees){
        int max = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                if (max < employees[i].getSalary()) {
                    max = employees[i].getSalary();
                }
            }
        }return max;
    }

    static int salaryAver(Employee[] employees){
        int aver = salarySume(employees)/employees.length;
        return aver;
    }

    static void surName(Employee[] employees){
        for(int i = 0;i<employees.length;i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getName());
            }
        }
    }
}
