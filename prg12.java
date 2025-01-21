class OuterClass {
  int x = 10;

   static class InnerClass {
    int y = 5;
  }
}

public class prg12 {
  public static void main(String[] args) {
  
    //OuterClass myOuter = new OuterClass();
    
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    
    //System.out.println("Num1: "+ myOuter.x);
    
    System.out.println("Num2: "+ myInner.y);
  }
}
