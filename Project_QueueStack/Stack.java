package Project_QueueStack;

class Stack
{
private int maxSize;        // size of stack array
private Patient[] sArray;
private int top;            // top of stack
private int nitems=0;
public int getTop() {return top+1;}

//--------------------------------------------------------------
public Stack()         // default constructor
   {
   maxSize = 0;             // set array size
   sArray = new Patient[maxSize];  // create array
   top = -1;                // no items yet
   }
public Stack(int s)         // constructor
   {
   maxSize = s;             // set array size
   sArray = new Patient[maxSize];  // create array
   top = -1;                // no items yet
   }
//--------------------------------------------------------------
public void push(Patient p)    // put item on top of stack
   {
      nitems++;
      sArray[++top] = p;     // increment top, insert item
   }
//--------------------------------------------------------------
public Patient pop()           // take item from top of stack
   {
      nitems--;
      return sArray[top--];  // access item, decrement top
    
   }
//--------------------------------------------------------------
public void peek()          // peek at top of stack
   {
   System.out.println(sArray[top]) ;
   }
//--------------------------------------------------------------
public boolean isEmpty()    // true if stack is empty
   {
   return (top == -1);
   }
//--------------------------------------------------------------
public boolean isFull()     // true if stack is full
   {
   return (top == maxSize-1);
   }
//--------------------------------------------------------------
public void DisplayStack()
{
     System.out.println("Our Records indicate:");
     for(int i=0; i<nitems;i++)
     {
          System.out.println(sArray[i]);
          System.out.println("-------------");
     }
}
}  // end class Stack