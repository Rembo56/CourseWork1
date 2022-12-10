public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee Ivanov = new Employee("Иванов И.И.", 1, 10000);
        Employee Petrov = new Employee("Петров И.И.", 1, 100000);
        Employee Sidorov = new Employee("Сидоров И.И.", 2, 14000);
        Employee D = new Employee("Петрова И.И.", 3, 16000);
        Employee I = new Employee("Тимошенко И.И.", 4, 30000);
        Employee F = new Employee("Лавочкин И.И.", 5, 50000);
        Employee P = new Employee("Налевайка И.И.", 1, 60000);
        Employee W = new Employee("Бегунов И.И.", 2, 25000);
        Employee R = new Employee("Антонов И.И.", 3, 12000);
        Employee A = new Employee("Прыгунов И.И.", 4, 19000);

        Ivanov.setDepart(2);
        Petrov.setSalary(20000);
        System.out.println(Ivanov.getInfo());
        System.out.println(Petrov.getInfo());
        Employee [] employees = new Employee[10];
        employees[0]=Ivanov;
        employees[1]=Petrov;
        employees[2]=Sidorov;
        employees[3]=D;
        employees[4]=A;

        System.out.println("Сумма затрат на зарплату на месяц: "+Employee.salarySume(employees));
        System.out.println("Минимальная зарплата: "+Employee.salaryMin(employees));
        System.out.println("Максимальная зарплата: "+Employee.salaryMax(employees));
        System.out.println("Средняя зарплата: "+Employee.salaryAver(employees));
        Employee.surName(employees);
    }
}