//stack_array//
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

int stack=[5];
int top==-1;           //Stack Initilzation condition
void PUSH();	       //Function Prototype
void POP();
void display();

void main()
{
int ch;
int n1;

while(1)
{
	printf("\n\n Stack Operation");
	printf("\n\n Push an element into stack");
	printf("\n\n Pop out an element from the stack");
	printf("\n\n Display Stack");
	printf("\n\n Exit");

	printf("\n\n Enter your choice");
	scanf("%d", &ch);

	switch(ch)
	{
	case 1:
		printf("\n\n Enter the element to be pushed into the stack");
		scanf("%d", &n1);
		push(n1);
		break;

	case 2:
		POP();
		break;

	case 3:
		display();
		break;

	case 4:
		exit(1);

	default:
		printf("\n\n Wrong choice entered");
		break;
	}	//end of switch
}	//end of while
}       //end of main method

void PUSH()
{
	if(top==4)
	{
	printf("\n\n Stack is full")
	}
	else
	{
	top++
	stack[top]=x;
	}
}        //end of PUSH

void POP()
{
	if(top==-1)
	{
	printf("\n\n Stack is empty");
	}
	else
	{
	printf("\n\n %d is popped ouot of the stack", stack[top--]);
	}
}        //end of POP

void display()
{
	int i;
	if(top==-1)
	{
	printf("\n\n Stack is empty");
	}
	else
	{
	printf("\n\n elements in stack are");
		for(i=top;i>=0;i--)
		{
			printf("\n\n %d", stack[i]);
		}
	}
}       //end of display