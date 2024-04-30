import java.util.*;
import java.util.stream.Collectors;

public class MapsSearch {
    public static void main(String[] args){

        /*The map() method takes a function as an argument and applies it to each element of the stream.
          The result is a new stream with the transformed elements.*/
        Map<Integer,String> a=new HashMap<>();
        a.put(1,"multiply");
        a.put(2,"multiply");
        a.put(3,"multiply");
        a.put(4,"multiply");
        a.entrySet().stream().filter(j->j.getKey()>2).forEach(j->System.out.println(j));


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Ramesh", 30, "male","EEE",2007,4000.00));
        employees.add(new Employee(20, "John", 29, "male","ece",2007,3500.00));
        employees.add(new Employee(30, "Tom", 30, "male","civil",2006,45000.0));
        employees.add(new Employee(40, "Pramod", 29, "male","mechanical",2008,50000.0));

        //sort the employee based on the salary
        System.out.println("Ascending order");
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
        System.out.println("descending order");
        employees.stream().sorted((e1,e2)-> (int) (e2.getSalary()-e1.getSalary())).forEach(System.out::println);

        //How many male and female employees are there in the organization?
        System.out.println("no Of Male And Female Employees");
        Map<String, Long> noOfMaleAndFemaleEmployees=
                employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(noOfMaleAndFemaleEmployees);
        //
        Map<String, Long> Employees=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(Employees);

        //Print the name of all departments in the organization?
        System.out.println("departments");
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //What is the average age of male and female employees?
        System.out.println("average age of employees");
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
                employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAgeOfMaleAndFemaleEmployees);

        //Get the details of highest paid employee in the organization?
        System.out.println("details of highest paid employee");
        Optional<Employee> highestPaidEmployeeWrapper=
                employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : "+highestPaidEmployee.getId());
        System.out.println("Name : "+highestPaidEmployee.getName());
        System.out.println("Age : "+highestPaidEmployee.getAge());
        System.out.println("Gender : "+highestPaidEmployee.getGender());
        System.out.println("Department : "+highestPaidEmployee.getDepartment());
        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
        System.out.println("Salary : "+highestPaidEmployee.getSalary());

        //Get the names of all employees who have joined after 2007?
        System.out.println("name of the employee joined after 2007 ");
        employees.stream().filter(e -> e.getYearOfJoining() > 2007).map(Employee::getName).forEach(System.out::println);


        //second-highest salary
        Optional<Employee> d= employees.stream().sorted((e, e1)-> (int) (e1.getSalary()-e.getSalary())).skip(1).findFirst();

        System.out.println(d);

        Optional<Employee> secondHighestEmployee= employees.stream().sorted((e, e1)-> (int) (e.getSalary()-e1.getSalary())).skip(employees.size()-2).findFirst();
        System.out.println("secondHighestEmployee "+ secondHighestEmployee);

        //senior employee
        Optional<Employee> senior=employees.stream().sorted((e,e1)-> e.getYearOfJoining()-e1.getYearOfJoining()).findFirst();
        System.out.println("senior employee "+senior.get().getName());

        //employee names
        employees.stream().map(Employee::getName).forEach(System.out::println);









    }
}
