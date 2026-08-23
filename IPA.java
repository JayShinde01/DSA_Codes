
import java.util.*;


public class IPA{
    public static void main(String [] args){
        System.out.println("IPA Preparation....?");
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        System.out.println(countPrimeNumbers(str));

    }
    public static int countPrimeNumbers(int n){
        int count = 0;
        for(int i = 3 ; i <= n ; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    // aabbbcc = a2b3c2
    public static void charRepeat(String str){
        char c = str.charAt(0);
        int count = 0;
        int len = 0;
        for(char ch : str.toCharArray()){
            if(c == ch){
                count++;
            }
            else{
                System.out.print(c+""+count);
                c = ch;
                count=1;
            }
            
            if(len == str.length()-1){
                System.out.println(c+""+count);
            }
            len++;
        }
    }
    public static boolean isPrime(int num){
        if(num == 0 || num == 1)return false;
        if(num % 2 == 0)return false;
        
        for(int i = 3; i * i < num; i++ ){
            if(num % i == 0)return false;
        }
        return true;
    }
    public static boolean isArmStrong(int num){
        int temp = num ;
        int digit = 0;
        while (temp != 0) { 
            digit++;
            temp /=10;
        }
        temp = num ;
        int ans = 0 ;
        while(temp != 0){
            ans += Math.pow(temp%10,digit);
            temp = temp / 10;
        }
        return ans == num;
    }
    public static int countEmployeesBasedOnAge(Employee []employees, int age){
        if(employees == null || employees.length == 0){
            return 0;
        }
        int count = 0 ;
        for(Employee emp : employees){
            if(emp.getAge() == age){
                count++;
            }
        }
        return count;

    }
    public static Employee getEmployeeWithSecondLowestSalary(Employee []employees){
        if(employees == null || employees.length <= 1 ){
            return null;
        }
        Arrays.sort(employees,(e2,e1)->Double.compare(e1.getSalary(), e2.getSalary()));
        Double lowest = employees[0].getSalary();
        for(Employee emp : employees){
            if(emp.getSalary() > lowest){
                return emp;
            }
        }
        return null;
    }
    public static Truck[] getAllTrucksWithDistance( Truck trucks[], int distance){
        ArrayList<Truck> al = new ArrayList<>();
        for(Truck truck:trucks){
            if(truck.getTotalMiles() >= distance){
                al.add(truck);
            }

        }
        Truck filtered[] = al.toArray(new Truck[0]);
        Arrays.sort(filtered,(t1,t2)->Float.compare(t2.getTotalMiles(),t1.getTotalMiles()));
        return filtered;
    }
    public static int countWords(String str){
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        return str.split("\\s+").length;
    }
}
class Company{
    private String companyName;
    private Employees[] employees;
    private int employeecount;

    public Company(String companyName, Employees[] employees, int employeecount) {
        this.companyName = companyName;
        this.employees = employees;
        this.employeecount = employeecount;
    }

    public double getAvgSalary(){
        double sum = 0.0 ;
        for(Employees emp : employees){
            sum = sum + emp.getSalary();
        }
      
        return sum /employees.length;
    }
    public Employees[] getEmployeesByDesignation(String designation){
        ArrayList<Employees> al = new ArrayList<>();
        for(Employees emp : employees){
            if(designation.equals(emp.getDesignation())){
                al.add(emp);
            }
        }
        return al.toArray(new Employees[0]);
    }
    public  double getMaxSalary(){
        double max = Double.MIN_EXPONENT;
        for(Employees emp : employees){
            if(max < emp.getSalary()){
                max = emp.getSalary();
            }
        }
        return max;
    }
    public String getCompanyName() {
        return companyName;
    }

    public Employees[] getEmployees() {
        return employees;
    }

    public int getEmployeecount() {
        return employeecount;
    }
    
}
class Employees{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employees(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
    
}
class Employee{
    private int id;
    private String name;
    private int age;
    private char gender;
   private double salary;

    public Employee(int id, String name, int age, char gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
   

}
class Driver{
   private Integer id;
   private String name;
   private String contact;
   private Float experience;

}
class Truck{
    private Integer id;
    private String name;
    private Float totalMiles;
    private Driver driver;

    public Truck(Integer id, String name,Float totalMiles,Driver driver) {
        this.id = id;
        this.name = name;
        this.totalMiles = totalMiles;
        this.driver = driver;
    }
     public Integer getId(){
        return id;
     }
     public String getName(){
        return name;
     }
     public Float getTotalMiles(){
        return totalMiles;
     }
     public Driver getDriver(){
        return driver;
     }
    
}