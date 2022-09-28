 void deleteAthead(node* &head)
{
    node* todelete=head;
    head=head-> next;

    delete todelete;
}

void deletion(node* &head, int val)
{
    if(head==NULL)
    {
        return;
    }

    if(head->next==NULL)
    {
        deleteHead(Head);
        return;
    }

    node* temp=head;
    while(temp->next->data!=val)
    {
        temp=temp->next;
    }

    node* toDelete=temp->next;
    temp->next= temp->next->next;
    delete todelete;
}

int main()
deletion(head,3);
display(head);

return0;
