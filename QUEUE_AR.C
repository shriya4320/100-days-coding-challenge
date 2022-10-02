#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

int queue[size];
int front, rear;

void init();
void enqueue(int);
void dequeue();
void display();

void main()
{
int ch;
int x;
init();

while(1)
{
	printf("\n\n Queue Operation");
	printf("\n\n Enqueue element");
	printf("\n\n Dequeue element");
	printf("\n\n display the queue elements");

	printf("enter your choice");
	scanf("%d", &ch);

	switch(ch)
	{
	case 1: printf("\n\n Enter the element to be enqueued");
		scanf("%d", &x);
		enqueue(x);
		break;

	case 2: dequeue();
		break;

	case 3: display();
		break;

	case 4: exit();
		break;

	default: printf("\n\n wrong choice");
	}
}
}

void init()
{
front=0;
rear=-1;
}

void enqueue(intx)
{
	if(rear==size-1)
	{
	printf("\n\n Queue overflow");
	}
	else
	{
	queue[++rear]=x;
	}
}

void dequeue()
{
	if(rear<front)
	{
	printf("\n\n Queue is empty");
	}
	else
	{
	printf("\n\n %d is deleted ", queue[front ++]);
	}
}
void display()
{
	int i;
	if(rear<front)
	{
	printf("\n\n Queue underflow");
	}
	else
	{
	for(i=front; i<=rear; i++)
	{
	printf("\n\n %d", queue[i]);
	}
	}
}