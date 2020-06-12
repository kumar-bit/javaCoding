public class Uc3{
public static void main(String args[]){
int  fulltime=1;
int halftime=2;
int wage;
int wageperhr=20;
int fulldayhr=8;
double empcheck=Math.floor(Math.random()*10) % 3;
if (empcheck==fulltime){
System.out.println("employee is present");
wage=20*8;
System.out.println("wage="+ wage);
}
else if (empcheck==halftime){
System.out.println("employee is having halftime");
wage=20*4;
System.out.println("wage="+ wage);
}
else
System.out.println("employee is absent");


}
}
