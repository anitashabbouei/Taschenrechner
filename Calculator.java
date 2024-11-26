/*
Diese Klasse ist ein Taschenrechner der mit zwei gegebenen Werten Jeweils das ergebnis wiedergibt.
@Date: 25.11.24
@Autor: Anita 
*/
public class Calculator {

  public static void main (String[] args){
    Calculator cal = new Calculator();
    System.out.println(cal.add(5,7));
    System.out.println(cal.subtract(45,11));
    //System.out.println(cal.add(5,7));
  }

    public Calculator(){
  
    }
  
    public int add(int a, int b){
      int result = a + b; 
      return result; 
    }
  
    public int subtract(int a, int b){
      int result = a - b; 
      return result; 
    }
  
    public int multiply(int a, int b){
      int result = a * b; 
      return result; 
    }
  
    public int devide(int a, int b){
      int result = a/b;
      return result;
    }
  
    public int modulo(int a, int b){
      int result = a % b; 
      return result; 
    }

  
  }
  