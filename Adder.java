import java.util.*;
class Adder {
int a[];
public Adder() {
a = new int[2];
}
public void readtime() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter hour:");
a[0] = sc.nextInt();
System.out.println("Enter minute :");
a[1] = sc.nextInt();
}
public void addtime(Adder X, Adder Y) {
int hour1 = X.a[0];
int min1 = X.a[1];
int hour2 = Y.a[0];
int min2 = Y.a[1];
int hourSum = hour1 + hour2;
int minSum = min1 + min2;
a[0] = hourSum + (minSum/60);
a[1] = minSum%60;
}
public void disptime() {
System.out.println("Their sum is : ");
System.out.println("hours =" + a[0] +" minutes =" + a[1]);
}
public static void main(String args[ ]) {
Adder obj1 = new Adder();
Adder obj2 = new Adder();
Adder sumObj = new Adder();
obj1.readtime();
obj2.readtime();
sumObj.addtime(obj1, obj2);
sumObj.disptime();
}
}