import java.util.Scanner;

class Main3 {
  public static void main(String[] args) {
    
    printData("Jones",25);
  }
  
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }
}

class Main3 {
  public static void main(String[] args) {
    String name = fullName("Kate","Jones");
    
    printData(name, 27);
    
    printData(fullName("Jone","Christopher","Smith"), 65);
    
  }
  
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "です");
  }
  
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
  
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }
  
  public static boolean isHealthy(double bmi){
    return bmi >= 18.5 && bmi < 25.0;
  }
  
  if (isHealthy(bmi)) {
    System.out.println("健康です");
  } else {
    System.out.println("健康ではありません");
  }
  
  public static void main(String[] args) {
    Person.printData(Person.fullName("Kate","Jones"),27, 1.6, 50.0);
    Person.printData(Person.fullName("John","Christopher","Smith"),65,1.75,80.0);
  }
}

class Main3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("名前：");
    String name = scanner.next();
    
    System.out.print("年齢：");
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    double height = scanner.nextDouble();
    
    Person.printData(Person.fullName(firstName, lastName), age, height);
  }
}