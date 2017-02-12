/**
 * @author AlmazTukenov
 */

import java.util.*;

public class Queue
{
    protected int Queue[] ;
    protected int front, rear, size, len;
 
   
    public Queue(int n) 
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    
   
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    
    
    public int size()
    {
        return len ;
    }    
    
    public int first() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }    
   
    public void enqueue(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
        len++ ;    
    }    
    
   
    public int dequeue() 
    {
        if (isEmpty())
        {
            System.out.println("Sorry, but Queue is already empty!!!");
            throw new NoSuchElementException("Underflow Exception");
        }
        else 
        {
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    
    public void outQ()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }
    
    public static void main(String[] args)
    {
               
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many numbers would like to insert into the Queue?");
        
        int N = scan.nextInt();
        
        System.out.println();
        
        Queue myQ = new Queue(N);
        
        while(true)
        {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. First");
            System.out.println("4. isEmpty");
            System.out.println("5. Size\n");
            
            System.out.println("Print the operation number :");
            
            int type = scan.nextInt();                
                   
            switch(type)
            {
                case 1: 
                    System.out.println("Enter integer element to insert :");
                    int x = scan.nextInt();
                    myQ.enqueue(x);
                    myQ.outQ();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("First Number Deleted");
                    myQ.dequeue();
                    myQ.outQ();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("First Number is :   " + myQ.first());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Is the queue empty?   " + myQ.isEmpty());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("The Queue's current size is : " + myQ.size());
                    System.out.println();
                    break;
            }
            
            System.out.println("Do you want to continue? (Y/N)");
            String answer = scan.next();
            if (answer.equals("N"))
                break;
        }
    }
}
 
