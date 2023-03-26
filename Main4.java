class Main4 {
  public static void main(String[] args) {
    Person person1 = new Person("Kate Jones");
    person1.hello();
  
    Person person2 = new Person("John Christopher Smith");
    person2.hello();
    
    //---------------------------------------------------------------------------//
    
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0, "獣医");
    person1.printData();
    
    System.out.println("合計" + Person.count + "人です");
    Person.printCount();
    
    System.out.println("仕事は" + person1.getJob() + "です");
    person1.setJob("教師");
  }
}