package practice;

public class Test_Practice1 {

	public void greatorNumber(int a,int b,int c) {
		if(a==b && b==c) {
			System.out.println("all are same ");
		}
		else if(a==b || b==c || c==a) {
			System.out.println( " Two numbers are same ");
		}


		if(a>b) {
			System.out.println(a + " is greator");
		}

		else if(b>c) {
			System.out.println(b + " b is greator");
		}

		else if(c>a) {
			System.out.println(c + " c is greator");
		}
	}


	public void lowestNumber(int a,int b,int c) {
		if(a==b && b==c) {
			System.out.println("all are same ");
		}
		else if(a==b || b==c || c==a) {
			System.out.println( " Two numbers are same ");
		}


		if(a<b) {
			System.out.println(a + " is smalest");
		}

		else if(b<c) {
			System.out.println(b + " b is smalest");
		}

		else if(c<a) {
			System.out.println(c + " c is smalest");
		}
	}

	public void findDivisibleBy5Or11(int a) {
		if (a%5==0 && a%11==0) {
			System.out.println(a+" is divisible by both numbers");
		}
		else if(a%5 == 0) {
			System.out.println(a+ "  is divisible by 5");	
		}
		else if(a%11==0) {
			System.out.println(a+ "  is divisible by 11");
		}
	}
	
	public void findmonth(int monthNumber) {
		if(monthNumber>12||monthNumber<1) {
			System.out.println("Invalid month");
		}
		else if (monthNumber==2) {
			System.out.println("it has 28 days");
		}
		else if(monthNumber==1 || monthNumber==3 || monthNumber==5 || monthNumber==7|| monthNumber==8|| monthNumber==10|| monthNumber==12) {
			System.out.println("it has 31 days");
		}
		else {
			System.out.println("it has 30 days");
		}
		
	}

}
