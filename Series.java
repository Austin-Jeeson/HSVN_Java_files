import java.util.*;
class Number
{int n;
    public Number(int nn)
    {n = nn;
    }
    public int factorial(int a)
    {int f=1;
     for(int i=1;i<=a;i++)
     f = f*i;
     return f;
    }
    public void display()
    {System.out.println("Entered number : "+n);
    }
}
public class Series extends Number
{int sum;
    public Series(int n1)
    {super(n1);
     sum=0;
    }
    public void calsum()
    {int fr=0;
     for(int i=1;i<=n;i++)
     {fr = factorial(i);
      sum=sum+fr;
     }
    }
    public void display()
    {super.display();
     System.out.println("Sum of series : "+sum);
    }
    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = sc.nextInt();
     Series s = new Series(num);
     s.calsum();
     s.display();
    }
}
