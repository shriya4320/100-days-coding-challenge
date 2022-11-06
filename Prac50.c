#include<stdio.h>
#include<stdlib.h>

    int stack[5];
    int top=-1;

    void push();
    void pop();
    void display();

    void main()
    {
        int ch;
        int n1;
        while(1)
        {
            printf("\n Stack Operations");
            printf("\n1 Push the element into the stack");
            printf("\n2 Pop the elements out of the stack");
            printf("\n3 Display the stack");
            printf("\n4 Exit");

            printf("\n Enter your choice");
            scanf("%d", &ch);

            switch(ch)
            {
            case 1:
             printf("\n Enter the elements to be pushed into the stack:");
             scanf("%d", &n);
                    push(n1);
                    break;

             case 2:
                    pop();
                    break;

             case 3:
                    display();
                    break;

             case 4:
                    exit(0);
                    default: printf("\n Wrong choice entered");
                    break;
            }
        }
    }

            void push(int x)
            {
                if (top==4)
                {
                printf("Stack is full");
                }
                else
                {
                top++;
                stack[top]=x;
                }
            }

            void pop()
            {
                if(top==-1)
                {
                    printf("Stack is empty");
                }
                else
                {
                    printf("%d element to be popped out of the stack," stack[top--]);
                }
            }

            void display()
            {
            int i;
                if(top==-1)
            {
                printf("Stack is empty");
            }
                else
            {
                printf("Elements in stack are:");
                    for(i=top; i>0;i--)
                    {
                        printf("%d", stack[i]);
                    }              
            }

            }