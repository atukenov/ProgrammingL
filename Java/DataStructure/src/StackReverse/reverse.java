package StackReverse;

import java.util.Scanner;

/*
 * @author AlmazTukenov
 */
public class reverse {
    private int sz = 0;
    private int top = -1;
    private String[] stack;
    
    public reverse(int n)
    {
        sz = n;
        stack = new String[n];
        top = -1;
    }
    
    public void push(String x)
    {
        stack[++top] = x;
    }
    
    public String pop()
    {
        return stack[top--];
    }
    
    public boolean isEmpty()
    {
        return (top == -1);
    }
    
    public static void main(String[] args) {
        reverse myStack = new reverse(20);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 String:");
        for (int i = 1; i <= 10; ++i)
        {
            System.out.print(i + ")");
            String input = scan.nextLine();
            myStack.push(input);
        }
        System.out.println("\nReversed stack:\n");
        while (!myStack.isEmpty())
            System.out.println(myStack.pop());  
        
    }
    
}
