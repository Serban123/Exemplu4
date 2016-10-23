
package exemplu4;



public class Exemplu4 {

    public static void main(String[] args) {
    
  
        

System.out.println("Credit card generator");

System.out.print("Name:");

int name1 = 0 + (int)(Math.random() * ((10 - 0) + 1));

if(name1 == 0) {System.out.print("Alex");}
if(name1 == 1) {System.out.print("Bogdan");}
if(name1 == 2) {System.out.print("Cristi");}
if(name1 == 3) {System.out.print("Ion");}
if(name1 == 4) {System.out.print("Mihai");}
if(name1 == 5) {System.out.print("George");}
if(name1 == 6) {System.out.print("Viorel");}
if(name1 == 7) {System.out.print("Damian");}
if(name1 == 8) {System.out.print("Stefan");}
if(name1 == 9) {System.out.print("Adrian");}    
if(name1 == 10) {System.out.print("Paul");}    

int name2 = 0 + (int)(Math.random() * ((10 - 0) + 1));
        System.out.print(" ");
if(name2 == 0) {System.out.print("Popesc");}
if(name2 == 1) {System.out.print("Mihaiesti");}
if(name2 == 2) {System.out.print("Dumitru");}
if(name2 == 3) {System.out.print("Chirila");}
if(name2 == 4) {System.out.print("Vaetan");}
if(name2 == 5) {System.out.print("Gheorghe");}
if(name2 == 6) {System.out.print("Adamescu");}
if(name2 == 7) {System.out.print("Udrescu");}
if(name2 == 8) {System.out.print("Radulescu");}
if(name2 == 9) {System.out.print("Popovici");}          
if(name2 == 10) {System.out.print("Paun");}    
    
int a = 0 + (int)(Math.random() * ((9 - 0) + 1));
int b = 0 + (int)(Math.random() * ((9 - 0) + 1));
int c = 0 + (int)(Math.random() * ((9 - 0) + 1));
int d = 0 + (int)(Math.random() * ((9 - 0) + 1));
int e = 0 + (int)(Math.random() * ((9 - 0) + 1));
int f = 0 + (int)(Math.random() * ((9 - 0) + 1));
int g = 0 + (int)(Math.random() * ((9 - 0) + 1));
int h = 0 + (int)(Math.random() * ((9 - 0) + 1));    
int i = 0 + (int)(Math.random() * ((9 - 0) + 1));
int j = 0 + (int)(Math.random() * ((9 - 0) + 1));
int k = 0 + (int)(Math.random() * ((9 - 0) + 1));
int l = 0 + (int)(Math.random() * ((9 - 0) + 1));
int m = 0 + (int)(Math.random() * ((9 - 0) + 1));
int n = 0 + (int)(Math.random() * ((9 - 0) + 1));
int o = 0 + (int)(Math.random() * ((9 - 0) + 1));
int p = 0 + (int)(Math.random() * ((9 - 0) + 1));        
System.out.println("\n");    
System.out.print("VISA Credit Card Number: ");
System.out.print(a);
System.out.print(b);    
System.out.print(c);
System.out.print(d);  
System.out.print(" ");
System.out.print(e);
System.out.print(f);    
System.out.print(g);
System.out.print(h);  
System.out.print(" ");
System.out.print(i);
System.out.print(j);    
System.out.print(k);
System.out.print(l);  
System.out.print(" ");
System.out.print(m);
System.out.print(n);    
System.out.print(o);
System.out.print(p);

int an = 201;
int an2 = 6 + (int)(Math.random() * ((9 - 6) + 1));
System.out.println("\n");
System.out.print("Data expirare: " );
System.out.print(an);
System.out.print(an2);
System.out.print("/");
int luna = 0 + (int)(Math.random() * ((12 - 0) + 1));
System.out.print(luna);

int cvv = 100 + (int)(Math.random() * ((999 - 100) + 1));
System.out.print("\n");
System.out.print("CVV: ");
System.out.print(cvv);

    } 
}
