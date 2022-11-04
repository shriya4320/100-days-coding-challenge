void delete Athead (node*head)
{
	node*todelete= head;
	head=head->next;
	delete todelete;
}
void deletion (node*head, int val)
{
if(head==NULL)
{
return;
}

if(head->next==NULL)
{
delete At Head(Head);
return;
}

node*temp=head;
while(temp->next->data!=val)
}{
temp=temp->next;
}

node*todelete=temp->;
temp->next= temp->next->next;
delete todelete;
}

int main()
deletion(head);
display(head);

return0;
}