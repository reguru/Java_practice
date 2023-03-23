class Main2 {
  public static void main(String[] args) {
    boolean bool = 3 * 9 == 27;
    System.out.println(bool);
    
    System.out.println(4 + 2 >= 6);
    
    if (x > 2) {
      System.out.println("xは2より大きい");
    }
    
    int n = 1;
    switch(n){
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;  
      default:
        System.out.println("凶です");
        break;
    }
    
    int number = 10;
    while (number > 0){
      System.out.println(number);
      number--;
    }
    
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "回目のループです");
    }
    
    int i = 1;
    while (i < 10) {
      if (i % 5 == 0){
        break;
      }
      System.out.println(i);
      i++;
    }
    
    System.out.println("== for文 ==");
    for (int j = 1; j < 10; j++) {
      if (j % 3 == 0){
        continue;
      }
      System.out.println(j);
    }
    
    String[] names = {"Alice","John","Takasi"};
    
    System.out.println(names[1]);
    
    for (int i = 0; i < names.length; i++) {
      System.out.println("私は" + names[i] + "です");
    }
    
    for (String name: names) {
      System.out.println("私は" + name + "です");
    }
  }
}