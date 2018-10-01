import java.io.*;
public class Work7 {
	public static void main(String args[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String o ;
		do{
			System.out.println("1. Grade");
			System.out.println("2. Tax");
			System.out.println("3. Commission");
			System.out.println("4. multiplication table");
			System.out.println("5. Calculate Numbers");
			System.out.println("0. exit");
			o = stdin.readLine();
			System.out.println(stdin.readLine());
			
			if(o.equals("1")) {
				grade();
			}else if(o.equals("2")){
				tax();
			}else if(o.equals("3")){
				com();
			}else if(o.equals("4")){
				mul();
			}else if(o.equals("5")){
				cal();
			}
		}while(Integer.parseInt(o) !=0);
	}

		/*-----------grade------------*/
		public static void grade() throws IOException {
		BufferedReader mo = new BufferedReader(new InputStreamReader(System.in));
			String m[][] = new String[3][3];
				System.out.println("=================================================");
				System.out.println("                  Calculate Grade                ");
				System.out.println("=================================================");
				System.out.print("Name : ");
					m[0][0] = mo.readLine();
				System.out.print("Subject : ");
					m[0][1] = mo.readLine();
				System.out.print("Total Score : ");
					m[0][2] = mo.readLine();
				int Score = Integer.parseInt(m[0][2]);
				String Grade;
					if(Score >= 80){
						Grade = "A";
					} 
					else if(Score >= 75) {
						Grade = "B+";
					} 
					else if(Score >= 70) {
						Grade = "B";
					}
					else if(Score >= 65) {
						Grade = "C+";
					}
					else if(Score >= 60) {
						Grade = "C";
					}
					else if(Score >= 55) {
						Grade = "D+";
					}
					else if(Score >= 50) {
						Grade = "D";
					}
					else {
						Grade = "F";
					}
				System.out.println("Name : " + m[0][0]);
				System.out.println("Subject : " + m[0][1]);
				System.out.println("Grade : " + Grade);
				System.out.println("=================================================");
				System.out.println("        Boonyada  Soongtiwong  5808311010        ");
				System.out.println("=================================================");
		}

		/*-----------tax------------*/	
		public static void tax() throws IOException {
		BufferedReader mo = new BufferedReader(new InputStreamReader(System.in));
			String m[][] = new String[3][3];
				System.out.println("=================================================");
				System.out.println("               Calculate Tax Salary              ");
				System.out.println("=================================================");
				System.out.print("ID : ");
					m[0][0] = mo.readLine();
				System.out.print("Name : ");
					m[0][1] = mo.readLine();
				System.out.print("Salary : ");
					m[0][2] = mo.readLine();
				int Salary = Integer.parseInt(m[0][2]);
					double Vat, Income, Tax;
					if(Salary >= 30000) {
						Vat = 0.15;
					}
					else if(Salary >= 20000) {
						Vat = 0.13;
					}
					else if(Salary >= 10000) {
						Vat = 0.10;
					}
					else if(Salary >= 5000) {
						Vat = 0.08;
					}
					else {
						Vat = 0.04;
					}
						Tax = Salary * Vat;
						Income = Salary - Tax;
			System.out.println("ID : " + m[0][0]);
			System.out.println("Name : " + m[0][1]);
			System.out.println("Tax : " + Tax);
			System.out.println("Salary : " + Income);
			System.out.println("=================================================");
			System.out.println("        Boonyada  Soongtiwong  5808311010        ");
			System.out.println("=================================================");
		}
		
		/*-----------com------------*/		
		public static void com() throws IOException {
		BufferedReader mo = new BufferedReader(new InputStreamReader(System.in));
			String m[][] = new String[3][3];
				System.out.println("=================================================");
				System.out.println("               Calculate Commission              ");
				System.out.println("=================================================");
				System.out.print("ID : ");
					m[0][0] = mo.readLine();
				System.out.print("Name : ");
					m[0][1] = mo.readLine();
				System.out.print("Sales : ");
					m[0][2] = mo.readLine();
				int Sales = Integer.parseInt(m[0][2]);
					double Com, Salary, Commission;
					if(Sales >= 40000) {
						Com = 0.15;
					}
					else if(Sales >= 30000) {
						Com = 0.13;
					}
					else if(Sales >= 20000) {
						Com = 0.10;
					}
					else if(Sales >= 10000) {
						Com = 0.08;
					}
					else { 	
						Com = 0;
					}
						Commission = Sales * Com;
						Salary = Sales + Commission;
			System.out.println("ID : " + m[0][0]);
			System.out.println("Name : " + m[0][1]);
			System.out.println("Commission : " + Commission);
			System.out.println("Salary : " + Salary);
			System.out.println("=================================================");
			System.out.println("        Boonyada  Soongtiwong  5808311010        ");
			System.out.println("=================================================");
			}
		
		/*-----------mul------------*/	
			static void mul()throws IOException{
			BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input multiplication table : ");
				String buf=stdin.readLine();
				int i = Integer.parseInt(buf);
				int a=1;
					while(a<=12){
					System.out.println(i+"*"+a+"= "+i*a);
					a++;
					}
			System.out.println("=================================================");
			System.out.println("        Boonyada  Soongtiwong  5808311010        ");
			System.out.println("=================================================");
			}

		/*-----------cal------------*/
			static void cal()throws IOException{
			BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
				String a[][] = new String[1][3];
					System.out.print("Input Number1 : ");
						a[0][0] = stdin.readLine();
					System.out.print("Input Symbol : ");
						a[0][1] = stdin.readLine();
					System.out.print("Input Number2 : ");
						a[0][2] = stdin.readLine();
				double x=0;
					if(a[0][1].equals("+")){
						x = Double.parseDouble(a[0][0])+Double.parseDouble(a[0][2]);
					}
					else if(a[0][1].equals("-")){
						x = Double.parseDouble(a[0][0])-Double.parseDouble(a[0][2]);
					}
					else if(a[0][1].equals("*")){
						x = Double.parseDouble(a[0][0])*Double.parseDouble(a[0][2]);
					}
					else if(a[0][1].equals("/")){
						x = Double.parseDouble(a[0][0])/Double.parseDouble(a[0][2]);
					}
					System.out.println("Answer Is : "+x);
				System.out.println("=================================================");
				System.out.println("        Boonyada  Soongtiwong  5808311010        ");
				System.out.println("=================================================");
				}
}