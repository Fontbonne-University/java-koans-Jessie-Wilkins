

public class Test{
  
    class Rodent {
       
    }

    class Rat extends Rodent {
        
    }

    class Mouse extends Rat {
    }
    class PocketMouse extends Mouse {
    }
  
    public static void main(String [ ] args) {
      Rodent [] array = new Rat [10];
      
      array [0] = new Rat();
      
      array [1] = new Mouse();
      
      array [2] = new PocketMouse();
    }
}
    