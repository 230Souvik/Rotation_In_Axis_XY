
package ex43;
import java.util.Scanner;

public class Ex43 {
public static void getDistance(int a) {
  int distance = 10;
  int x = 0;
  int y = 0;
  char ch = 'R';
  while(a > 0) 
  {
    switch(ch) 
    {
      case 'R':{
      x = x + distance;
      distance = distance+10;
      ch = 'U';
      System.out.println("X"+x+ " , "+"Y"+y);
      break;}

      case 'U':
      y = y + distance;
      distance = distance + 10;
      ch = 'L';
       System.out.println("X"+x+ " , "+"Y"+y);
      break;

      case 'L':
      x = x - distance;
      distance = distance + 10;
      ch = 'D';
     System.out.println("X"+x+ " , "+"Y"+y);
      break;

      case 'D':
      y = y - distance;
      distance = distance + 10;
      ch = 'A';
       System.out.println("X"+x+ " , "+"Y"+y);
      break;

      case 'A':
      x = x + distance;
      distance = distance + 10;
      ch = 'R';
       System.out.println("X"+x+ " , "+"Y"+y);
      break;
    }
    a--;
  }
  
  }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    getDistance(testCase);
    }
    
}
