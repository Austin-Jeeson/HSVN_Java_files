import java.util.*;
public class Hadamard
{boolean[][] H;
 int N;
    public Hadamard(int n)
    {H = new boolean[n][n];
     N=n;
    }
    public void CreateHad()
    {H[0][0] = true;
     for(int n=1;n<N;n+=n)
     {for(int i=0;i<n;i++)
      {for(int j=0;j<n;j++)
       {H[i+n][j] = H[i][j];
        H[i][j+n] = H[i][j];
        H[i+n][j+n] = !H[i][j];
       }
      }
     }
    }
    public void print()
    {for(int i=0;i<N;i++)
     {for(int j=0;j<N;j++)
      {if(H[i][j])System.out.print(" T ");
      else System.out.print("   ");
      }
      System.out.println();
     }
    }
    public static void main(String args[])
    {Scanner sc = new Scanner(System.in);
     System.out.println("Enter value of N(must be power of 2) : ");
     int S = sc.nextInt();
     if((S & S-1)==0)
     {Hadamard mat = new Hadamard(S);
      mat.CreateHad();
      mat.print();
     }
     else System.out.println("Invalid input");
    }
}
