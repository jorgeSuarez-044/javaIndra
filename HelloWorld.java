import java.util.Random;
public class HelloWorld{

     public static void main(String []args){
Random r=new Random();
  int[][] a=new int[2][8];
  for(int i=0;i<2;i++)
  {
      for(int j=0;j<8;j++)
      {
         a[i][j]=r.nextInt(2);
         System.out.print(a[i][j]+"\t");
      }
  
     System.out.print("\n");
  
  }
   System.out.print("\n");
  for(int i=0;i<2;i++)
  {
      for(int j=0;j<8;j++)
      {
         a[i][j]=r.nextInt(2);
         System.out.print(a[i][j]+"\t");
      }
  
     System.out.print("\n");
  }
  
     }
}