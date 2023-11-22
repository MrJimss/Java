package Project_QueueStack;



public class Queue {

private int maxSize;
private Patient[] qArray;
private int front;
public void setFront(int front) {
   this.front = front;
}
public int getFront() {
   return front;
}
private int rear;
private int nItems;     //number of items added 
int s;                  //counter variable for the modified size of the array

public Queue()              //default constructor
{
     maxSize=0;
     front=0;
     rear=-1;
     nItems=0;
}
//--------------------------------------------------------------
public Queue(int s)          // constructor
   {
   maxSize = s;
   qArray = new Patient[maxSize];
   front = 0;
   rear = -1;
   nItems = 0;
   }
//--------------------------------------------------------------
public void insert(Patient P)   // put Patient at rear of queue
   {
      if(isFull())         // deal with wraparound
         {
            System.out.println("Cannot add more!");
            
         }
      else
      {
      qArray[++rear] = P;         // increment rear and insert
      nItems++;                     // one more item
      }
   }
//--------------------------------------------------------------
public Patient remove()         // take item from front of queue
   {
      Patient temp=qArray[front];                    
      front++;
      s=nItems-1;
      return temp;                  //returns patient removed 
   }
//--------------------------------------------------------------
public void peekFront()      // peek at front of queue
   {
     System.out.println(qArray[front]);
   }
//--------------------------------------------------------------
public boolean isEmpty()    // true if queue is empty
   {
   return (size()==0);
   }
//--------------------------------------------------------------
public boolean isFull()     // true if queue is full
   {
   return (s==maxSize);
   }
//--------------------------------------------------------------
public int size()           // number of items in queue
   {
   return (nItems-front);
   }
//--------------------------------------------------------------
public void DisplayQ()
{
     System.out.println("Our Records indicate:");
     System.out.println("-------------");
     for(int i=front; i<nItems;i++)
     {
         System.out.println(qArray[i]);
         System.out.println("-------------");
     }
}
}  // end class Queue
     
