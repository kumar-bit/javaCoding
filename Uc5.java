public class Uc5{
public static final int FULLTIME=1;
public static final int HALFTIME=2;
public static final int WORKING_DAYS=2;


public static void main(String args[]){

int wage=0;
int wageperhr=20;
int fulldayhr=8;
for(int day=0;day<WORKING_DAYS;day++){
int empcheck=(int) Math.floor(Math.random() * 10) % 3;
switch (empcheck) {
case FULLTIME:
System.out.println("employee is present");
wage=20*8;
System.out.println("wage="+ wage);
break;

case HALFTIME:
System.out.println("employee is having halftime");
wage=20*4;
System.out.println("wage="+ wage);
break;

default:
System.out.println("employee is absent");
System.out.println("wage="+ wage);

}
}
}
}

