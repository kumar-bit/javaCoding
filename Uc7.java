public class Uc7{ 
void display(){
System.out.println("welcome to master branch");
}
void display1(){
int  fulltime=1;
double empcheck=Math.floor(Math.random()*10) % 2;
if (empcheck==fulltime)
System.out.println("employee is present");
else
System.out.println("employee is absent");
}
void display2(){
int  fulltime=1;
int wage;
int wageperhr=20;
int fulldayhr=8;
double empcheck=Math.floor(Math.random()*10) % 2;
if (empcheck==fulltime){

wage=20*8;
System.out.println("wage="+ wage);
}
else{

wage=0;
System.out.println("wage="+ wage);
}

}
void display3(){
int fulltime=1;
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
void display4(){


int wage=0;
int wageperhr=20;
int fulldayhr=8;
int empcheck=(int) Math.floor(Math.random() * 10) % 3;
switch (empcheck) {
case 1:
System.out.println("employee is present");
wage=20*8;
System.out.println("wage="+ wage);
break;

case 2:
System.out.println("employee is having halftime");
wage=20*4;
System.out.println("wage="+ wage);
break;

default:
System.out.println("employee is absent");
System.out.println("wage="+ wage);

}
}
void display5(){


int WORKING_DAYS=2;




int wage=0;
int wageperhr=20;
int fulldayhr=8;
for(int day=0;day<WORKING_DAYS;day++){
int empcheck=(int) Math.floor(Math.random() * 10) % 3;
switch (empcheck) {
case 1:
System.out.println("employee is present");
wage=20*8;
System.out.println("wage="+ wage);
break;

case 2:
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
void display6(){
int WORKING_DAYS=2;
int EMPRATE_PERHR=20;
int MAX_HRS_IN_MONTH=10;

int empHrs=0;
int totalEmpHr=0;
int totalWorkingDays=0;
while(totalEmpHr <= MAX_HRS_IN_MONTH  && totalWorkingDays < WORKING_DAYS){
totalWorkingDays++;
totalEmpHr++;
int empcheck=(int) Math.floor(Math.random() * 10) % 3;
switch (empcheck) {
case 1:
empHrs=8;
break;

case 2:
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

public static void main(String[] args){
Uc7 d1=new Uc7(); 
d1.display();
d1.display1(); 
d1.display2(); 
d1.display3();
d1.display4();
d1.display5();
d1.display6();
}
}
