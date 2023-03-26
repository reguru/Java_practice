import java.lang.Math;

class Person {
  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");

    double bmi = bmi(height, weight);
    System.out.println("BMIは" + Math.round(bmi) + "です");

    if (isHealthy(bmi)) {
      System.out.println("標準値です");
    } else {
      System.out.println("標準値の範囲外です");
    }
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }
  
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25.0;
  }
  
  
  //-------------------------------------------------------------------------------//
  public String name;
  
  Person(String name) {
    System.out.println("インスタンスが生成されました");
    this.name = name;
  }
  
  public void hello() {
    System.out.println("こんにちは、私は" + this.name + "です");
  }
  
  //-------------------------------------------------------------------------------//
  private static int count = 0; //クラス外からアクセス不可
  private String firstName;     //クラス外からアクセス可
  private String lastName;
  public int age;
  public double height;
  public double weight;
  private String job;

  Person(String firstName, String lastName, int age, double height, double weight, String job) {
    Person.count ++;
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }
  
  public String fullName(){
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
    
  }
  
  public String getMiddleName() {
    return this.middleName;
  }
  
  //ゲッター
  public String getJob() {
    return this.job;
  }
  //セッター
  public void setJob(String job) {
    this.job = job;
  }
  
  public double bmi(){
    return this.weight / this.height / this.height;
  }
  
  public void printData(){
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }
  
  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }

}
