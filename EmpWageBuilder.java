import java.util.*;
interface IComputeEmpWage{
public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
public void computeEmpWage();
public int getTotalWage(String company);
}
class  CompanyEmpWage {
public final String company;
public final int empRatePerHour;
public final int numOfWorkingDays;
public final int maxHoursPerMonth;
public int totalEmpWage;

public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
this.company=company;
this.empRatePerHour=empRatePerHour;
this.numOfWorkingDays=numOfWorkingDays;
this.maxHoursPerMonth=maxHoursPerMonth;
}
public void setTotalEmpWage(int totalEmpWage){
this.totalEmpWage=totalEmpWage;
}
public String toString(){
return "total emp wage  for  company: " + company + " is " + totalEmpWage;
}
}
public class EmpWageBuilder implements IComputeEmpWage{
public static  final int IS_PART_TIME=1;
public static  final int IS_FULL_TIME=2;
private int numOfCompany=0;
private LinkedList<CompanyEmpWage> companyEmpWageList;
private Map<String,CompanyEmpWage> companyToEmpWageMap;

public EmpWageBuilder(){
companyEmpWageList=new LinkedList<>();
companyToEmpWageMap=new HashMap();
}
public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
companyEmpWageList.add(companyEmpWage);
companyToEmpWageMap.put(company,companyEmpWage);
}
public void computeEmpWage(){
for(int i=0;i<companyEmpWageList.size();i++){
CompanyEmpWage companyEmpWage= companyEmpWageList.get(i); 
companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
System.out.println(companyEmpWage);
}
}
public int getTotalWage(String company){
return companyToEmpWageMap.get(company).totalEmpWage;
}
public int computeEmpWage(CompanyEmpWage companyEmpWage) {

 
int empHrs=0,totalEmpHrs=0,totalWorkingDays=0; 
 
while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) { 
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
return totalEmpHrs*companyEmpWage.empRatePerHour;

}
public static void main(String[] args){
IComputeEmpWage empWageBuilder=new EmpWageBuilder();
empWageBuilder.addCompanyEmpWage("dmart", 20,2,10);
empWageBuilder.addCompanyEmpWage("reliance",10,4,20);
empWageBuilder.computeEmpWage();
System.out.println("total  emp wage for dmart company:" +empWageBuilder.getTotalWage("dmart"));
}
}


