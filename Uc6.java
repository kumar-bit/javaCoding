public class Uc6{
public static final int FULLTIME=1;
public static final int HALFTIME=2;
public static final int WORKING_DAYS=2;
public static final int EMPRATE_PERHR=20;
public static final int MAX_HRS_IN_MONTH=10;

public static void main(String args[]){

int empHrs=0;
int totalEmpHr=0;
int totalWorkingDays=0;
while(totalEmpHr <= MAX_HRS_IN_MONTH  && totalWorkingDays < WORKING_DAYS){
totalWorkingDays++;
totalEmpHr++;
int empcheck=(int) Math.floor(Math.random() * 10) % 3;
switch (empcheck) {
case FULLTIME:
empHrs=8;
break;

case HALFTIME:
empHrs=4;
break;

default:
empHrs=0;

}

System.out.println("days"+totalWorkingDays+" EMP HR:" +empHrs);
}
int totalEmpWage = totalEmpHr * EMPRATE_PERHR;
System.out.println("Total emp wage:"+ totalEmpWage);

}
}
