public class Uc2{
public static void main(String args[]){
int  fulltime=1;
int wage;
int wageperhr=20;
int fulldayhr=8;
double empcheck=Math.floor(Math.random()*10) % 2;
if (empcheck==fulltime){
System.out.println("employee is present");
wage=20*8;
System.out.println("wage="+ wage);
}
else{
System.out.println("employee is absent");
wage=0;
System.out.println("wage="+ wage);
}

}
}
