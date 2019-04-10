
package palindrome;


import java.util.*;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        
        String inputValue = input.nextLine();
        String popedValue ="";
        int length = inputValue.length();
        functions stack = new functions(length);
        stack.initStack();
        
        for(int i =0;i<length;i++)
        {
            //val.charAt(i);
            String toString = Character.toString(inputValue.charAt(i));
         stack.push(toString);
         System.out.println(stack.TOP);
        System.out.println(toString);
        
        }
        for(int i = 0;i<length;i++)
        {
            
            popedValue += stack.pop();
            System.out.println(stack.TOP);
        }
        System.out.println(stack.compare(inputValue, popedValue));
        System.out.println(popedValue.length());
        System.out.println(inputValue.length());
    }
    
}
class functions{
    int TOP = -1;
   int MAX =50;
 
   Scanner input = new Scanner(System.in);
   //creating array of string called Stack
   String [] Stack = new String[MAX];
  
  /* Initializig the Stack to -1 */
   public functions(int max){
       this.MAX = max;
   }
public void initStack(){
      TOP=-1;
  }
/* checks whether Stack is empty or not and return boolean value */
public boolean isEmpty(){
    if(TOP==-1)
        return true;
    else 
        return false;
}
/* returns boolean if the Stack is full */
public boolean isFull(){
    if(TOP == MAX-1)
        return true;
    else 
        return false;
}
/* methods to push value in the stack which takes string parameter */
public void push(String val){
    if (isFull()){
       System.out.println("Stack is full");
       return;
    }
    else{
         ++TOP;
         Stack[TOP]=val;
         System.out.println(val + " has been inserted");
    }
    
}
// pops the element in the Stack

String pop(){
    
    if(isEmpty()){
        System.out.println("Stack is empty");
        return "Stack is Empty";
    }
    
    return Stack[TOP--];
    
    
}

String compare(String a, String b)
{
    if(a.equals(b))
        return "yes";
    else
        return "no";
}

}
