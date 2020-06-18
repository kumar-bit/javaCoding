public class Uc9{
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
private final String company;
private final int empRatePerHour;
private final int numOfWorkingDays;
private final int maxHoursPerMonth;
private int totalEmpWage;

public Uc9(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
this.company=company;
this.empRatePerHour=empRatePerHour;
this.numOfWorkingDays=numOfWorkingDays;
this.maxHoursPerMonth=maxHoursPerMonth;
}
public void computeEmpWage() {

 
int empHrs=0,totalEmpHrs=0,totalWorkingDays=0; 
 
while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) { 
totalWorkingDays++;  
int empCheck=(int) Math.floor(Math.random()*10)%3; 
switch (empCheck){
case IS_PART_TIME:
empHrs=4;
break;
case IS_FULL_TIME:
empHrs=8;
break;
default:
empHrs=0;
}
totalEmpHrs+=empHrs;
System.out.println("Day#: " +totalWorkingDays +" Emp Hr:" +empHrs);
}
totalEmpWage=totalEmpHrs* empRatePerHour;

}
 
public String toString(){
return "total emp wage  for  company: " + company + " is " + totalEmpWage;
}
public static void main(String[] args) {
Uc9 reliance=new Uc9("reliance",20,2,10);
Uc9 dmart=new Uc9("dmart",10,4,20);

reliance.computeEmpWage();
System.out.println(reliance);

dmart.computeEmpWage();
System.out.println(dmart);

}
}
