import java.util.Scanner;

public class calc2 {

	public static void main(String[] args) {
		System.out.println("PROGRAM WYŚWIETLAJĄCY PODSTAWOWE DZIAŁANIA NA DWóCH LICZBACH RZECZYWISTYCH");
		System.out.println("wersja 002");
		/*wersja uwzględnia liczby ujemne aby były one w nawiasach 
		 * oraz niemożliwość dzielenia przez zero
		 * uwzglednione gdy wynikiem mnozenia lub dzielenia jest -0.0 linia z (-(dzialanie))
		 */
		double a,b;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Podaj pierwszą liczbę a: "); 
		a = sc.nextDouble();
		System.out.print("Podaj drugą liczbę b: "); 
		b = sc.nextDouble();
		System.out.println("Działania:");
		//suma,roznica, iloczyn
		if (b<0 && a<0) 
			{System.out.println("a+b  ("+a+")+("+b+")="+(a+b));
			 System.out.println("a-b  ("+a+")-("+b+")="+(a-b));
			 System.out.println("b-a  ("+b+")-("+a+")="+(b-a));
			 System.out.println("a*b  ("+a+")*("+b+")="+(a*b));
			}
		else if(b<0 && a>=0) 
				{System.out.println("a+b  "+a+"+("+b+")="+(a+b));
				 System.out.println("a-b  "+a+"-("+b+")="+(a-b));
				 System.out.println("b-a  ("+b+")-"+a+"="+(b-a));
				 System.out.println("a*b  "+a+"*("+b+")="+(-(a*b)));
				}
			else if (b>=0 && a<0) 
					{System.out.println("a+b  ("+a+")+"+b+"="+(a+b));
					 System.out.println("a-b  ("+a+")-"+b+"="+(a-b));
					 System.out.println("b-a  "+b+"-("+a+")="+(b-a));
					 System.out.println("a*b  ("+a+")*"+b+"="+(-(a*b)));
					}
				else 
						{System.out.println("a+b  "+a+"+"+b+"="+(a+b));
						 System.out.println("a-b  "+a+"-"+b+"="+(a-b));
						 System.out.println("b-a  "+b+"-"+a+"="+(b-a));
						 System.out.println("a*b  "+a+"*"+b+"="+(a*b));
						}
		
		//iloraz
		if(b==0 && a!=0) // przypadek gdy b = 0
			{System.out.println("a/b  Nie można dzielić przez zero");
			 if(a<0)System.out.println("b/a  "+b+"/("+a+")="+(-(b/a)));
			 else System.out.println("b/a  "+b+"/"+a+"="+(b/a));}
		else if(a==0 && b!=0) // przypadek gdy a = 0
				{if(b<0)System.out.println("a/b  "+a+"/("+b+")="+(-(a/b)));
				 else System.out.println("a/b  "+a+"/"+b+"="+(a/b));
				 System.out.println("b/a  Nie można dzielić przez zero");}
			else if(a==0 && b==0) //oba dzielenia są niemożliwe
				{System.out.println("a/b  Nie można dzielić przez zero");
				 System.out.println("b/a  Nie można dzielić przez zero");}
				else //dwa dzielenia są możliwe
					 if(a>0 && b>0)
						{System.out.println("a/b  "+a+"/"+b+"="+(a/b));
						 System.out.println("b/a  "+b+"/"+a+"="+(b/a));
						}
					 else if(a<0 && b>0)
					 		{System.out.println("a/b  ("+a+")/"+b+"="+(a/b));
							 System.out.println("b/a  "+b+"/("+a+")="+(b/a));
					 		}
					 	else if(a>0 && b<0)
					 			{System.out.println("a/b  "+a+"/("+b+")="+(a/b));
								 System.out.println("b/a  ("+b+")/"+a+"="+(b/a));
					 			}
					 		else
					 			{System.out.println("a/b  ("+a+")/("+b+")="+(a/b));
								 System.out.println("b/a  ("+b+")/("+a+")="+(b/a));
					 			}
	
	}

}
