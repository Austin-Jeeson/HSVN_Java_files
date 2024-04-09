import java.util.*;
public class OddEven
{int a[];int m;
    public OddEven(int mm)
    {m = mm;
     a = new int[m];
    }
    public void fillarray()
    {Scanner sc = new Scanner(System.in);
     System.out.println("Enter elements");
     for(int i=0;i<m;i++)
     a[i] = sc.nextInt();
    }
    public void display()
    {System.out.println("The elements are");
     for(int i=0;i<m;i++)
     System.out.print(a[i]+" , ");
     System.out.println();
    }
    public OddEven arrange(OddEven P,OddEven Q)
    {int n = P.m + Q.m;
     OddEven R = new OddEven(n);
     int begin = 0 , end = (n-1);
     for(int i=0;i<P.m;i++)
     {if(P.a[i] % 2 != 0)
      {R.a[begin] = P.a[i];
       begin++;
      }
      else
      {R.a[end] = P.a[i];
       end--;
      }
     }
     for(int j=0;j<Q.m;j++)
     {if(Q.a[j] % 2 != 0)
      {R.a[begin] = Q.a[j];
       begin++;
      }
      else
      {R.a[end] = Q.a[j];
       end--;
      }
     }
     return R;
   }
   public static void main(String args[])
   {Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int m1 = sc.nextInt();
    OddEven A = new OddEven(m1);
    A.fillarray();
    System.out.println("Enter size");
    int m2 = sc.nextInt();
    OddEven B = new OddEven(m2);
    B.fillarray();
    OddEven C = new OddEven(m1+m2);
    C = C.arrange(A,B);
    A.display();
    B.display();
    C.display();
   }
}