import java.util.*;
public class Transarray
{int m,n;int arr[][];
    public Transarray()
    {m = 20; n = 20;
     arr = new int[20][20];
    }
    public Transarray(int mm,int nn)
    {m = mm;n = nn;
     arr = new int[mm][nn];
    }
    public void fillarray()
    {Scanner sc = new Scanner(System.in);
     System.out.println("Enter matrix");
     for(int i=0;i<m;i++)
     {for(int j=0;j<n;j++)
      arr[i][j] = sc.nextInt();
     }
    }
    public void generate()
    {for(int i=0;i<m;i++)
      {for(int j=0;j<n;j++)
       arr[i][j] = (int)(Math.random()*100);
      }
    }
    public void disparray()
    {for(int i=0;i<m;i++)
      {for(int j=0;j<n;j++)
       System.out.print(arr[i][j]+" ");
       System.out.println();
      }
    }
    public void transpose(Transarray A)
    {for(int i=0;i<m;i++)
     {for(int j=0;j<n;j++)
      arr[i][j] = A.arr[j][i];
     }
    }
    public static void main(String args[])
    {Scanner sc = new Scanner (System.in);
     System.out.println("Enter row size");
     int ro = sc.nextInt();
     System.out.println("Enter column size");
     int co = sc.nextInt();
     if(ro>0 && ro<=20 && co>0 && co<=20)
     {Transarray T = new Transarray(ro,co);
      //T.accept();
      T.generate();
     System.out.println("\nOriginal matrix : ");
     T.disparray();
     System.out.println("\nTransposed matrix : ");
     Transarray T1 = new Transarray(co,ro);
     T1.transpose(T);
     T1.disparray();
     }
     else System.out.println("Size out of range");
    }
}
