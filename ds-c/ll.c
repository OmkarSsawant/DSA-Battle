#include<stdio.h>
#include<stdlib.h>


typedef struct Node
{
    int data;
    struct Node* next;
} Node;
Node* __createHEAD(int d){
    Node* n = malloc(sizeof(Node));
    n->data = d;
    n->next=NULL;    
    return n;
}

void append(Node* h,int d){
    Node* t = h;
    while (t->next!=NULL)
    {
        t = t->next;
    }
    Node* nn = malloc(sizeof(Node));
    nn->data = d;
    nn->next=NULL;
    t->next = nn;

}

Node* insertHEAD(Node* h,int d){
    Node* nn = malloc(sizeof(Node));
    nn->data = d;
    nn->next=h;
    return nn;        
}

Node* insert_at(int i,Node* h,int d){
    Node* t = h;
    if(i==0){
        return insertHEAD(h,d);   
    }

    while ( i>0 &&t->next!=NULL)
    {
        t = t->next;
        i--;
    }
    
    Node* nn = malloc(sizeof(Node));
    nn->data = d;
    nn->next=t->next;
    t->next=nn;
    return h;
}

Node* pop(Node* h){
    Node* t = h;
    if(t->next==NULL){
        free(t);
        return NULL;
    }


    while (t->next->next!=NULL)
    {
        t= t->next;
    }
    free(t->next);
    t->next=NULL;    
    return h;
}


Node* delete(Node* h,int d){
    Node* t = h;
    Node* pn=NULL;

    if(h->data==d){
        //if its head
        free(h);
        return h->next;
    }

    while (t->next!=NULL)
    {
        if(t->data==d){
            pn->next = t->next;
            free(t);    
            return h;
        }
        pn=t;
        t= t->next;
    }    
    return h;
}


Node* delete_at(Node* h,int i){
    Node* t = h;
    Node* pn=NULL;
    if(!i){
        //if its head
        free(h);
        return h->next;
    }

    while (i>0 && t->next!=NULL)
    {
        pn=t;
        t= t->next;
        i--;
    }    
        pn->next = t->next;
            free(t);    
    return h;
        }




void printLinkedList(Node* h){
    if(h==NULL) return;
    Node* t = h;
    while (t->next!=NULL)
    {
        printf("\ndata:\t%d\n",t->data);
        t = t->next;
    }
        
        printf("\ndata:\t%d\n",t->data);

}

void clean(Node* h){

    if(h==NULL) return;
    while (h->next!=NULL)
    {
        Node* c =h;
        h=h->next;
        free(c);        
    }        
    free(h);
}

int main(){

    int n;
    Node* head = NULL;   //!SO IMPORTANT TO init NULL pointers else garbage value
    int bi;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
    scanf("%d",&bi);
        if(head==NULL){
            head = __createHEAD(bi);
        }else{
            append(head,bi);            
        }
    }
    
    printf("\n \x1b[32m After insert v:7777 at pos:3"); 
    printLinkedList(head);
   printf("\1xb[0m"); 
    head = insert_at(3,head,7777);


    printf("\n \x1b[32m After insert v:7777 at pos:3"); 
    printLinkedList(head);
    printf("\x1b[0m");
    head = delete(head,3);
    
    printf("\n" "\x1b[31m After delete v:3");
    printLinkedList(head);
    
    printf("\x1b[0m");
    head = delete_at(head,7777);   
    
    printf("\n" "\x1b[31m After delete v:7777 ");
    printLinkedList(head);
    clean(head);
    printf("\x1b[0m");
}



