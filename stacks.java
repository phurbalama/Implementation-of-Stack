

package stacks;



import java.util.*;

public class Stacks {

 
    public static void main(String[] args) {
        
            functions obj = new functions();
        
      
Scanner input = new Scanner(System.in);

char cont=' ';
do{
     obj.results();
     System.out.println("Would you like to continue? If so, Enter 'Y' or 'y'");
     cont = input.next().charAt(0);
}while(cont=='Y'||cont=='y'); 
   
       
    }
    
}
class functions{
    int TOP = 0;
   int MAX = 10;
 
   Scanner input = new Scanner(System.in);
   //creating array of string called Stack
   String [] Stack = new String[MAX];
  
  /* Initializig the Stack to -1 */
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
public void push(String num){
    int x,y,result;
    if (isFull()){
       System.out.println("Stack is full");
       return;
    }
    else if(num.equals("+")){
        y = pop(); 
        x = pop();
        result = x+y;
        ++TOP;
       
        Stack[TOP] = String.valueOf(result);
        System.out.println(result + " has been inserted");
        
    }
      else if(num.equals("-")){
        y = pop(); 
        x = pop();
        result = x-y;
        ++TOP;
       
        Stack[TOP] = String.valueOf(result); 
        System.out.println(result + " has been inserted");
        
    }
    else if(num.equals("/")){
        y = pop(); 
        x = pop();
        result = x/y;
        ++TOP;
       
        Stack[TOP] = String.valueOf(result);
        System.out.println(result + " has been inserted");
        
    }
     else if(num.equals("*")){
        y = pop(); 
        x = pop();
        result = (int)Math.multiplyExact(x, y);
        ++TOP;
       
        Stack[TOP] = String.valueOf(result);
        System.out.println(result + " has been inserted");
        
    }
      else if(num.equals("$")){
        y = pop(); 
        x = pop();
         result = (int)Math.pow(x, y);
        ++TOP;
       
        Stack[TOP] = String.valueOf(result);
        System.out.println(result + " has been inserted");
        
    }
       else if(num.equals("~")){
        y = pop(); 
         result = (int)Math.multiplyExact(-1, y);
        ++TOP;
      
        Stack[TOP] = String.valueOf(result); 
        System.out.println(result + " has been inserted");
        
    }
    else{
        ++TOP;
        Stack[TOP]=num;
         System.out.println(num + " has been inserted");
    }
       
}
// pops the element in the Stack
int pop(){
    int temp;
    if(isEmpty()){
        System.out.println("Stack is empty");
        return ' ';
    }
    temp = Integer.parseInt(Stack[TOP]);
    TOP--;
    System.out.println(temp +" has been deleted");
    return temp;
    
    
}
/* The display function returns the out of the Stack */
void display(){
    int i;
    if(isEmpty()){
        System.out.println("Stack is empty");
        return;
    }
    for(i=TOP;i>=0;i--){
        
        System.out.println("|"+Stack[i]+"  |");
    }
}
/* function to take in value and display it
*/
public void results(){
    
        int num;
        
        initStack();
        System.out.println("How many values would you like enter (counting the operator) : ");
         num = input.nextInt();
         System.out.println("Please input each value and press Enter");
         String[] data = new String[num];
         for(int i = 0;i<num;i++){
             data[i] = input.next();
         }
         System.out.println("--------------------------");
         for(int i = 0;i<num;i++){
             push(data[i]);
         }
         System.out.println("------------------------");
         System.out.println("Displaying the contents in stack");
         display();
}
}
