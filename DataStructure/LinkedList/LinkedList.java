class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public void add(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next =new Node(data);
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public int size(){
        int cnt=0;
        Node temp=head;
        while(temp.next!=null){
            cnt++;
            temp=temp.next;
        }
        cnt++;
        return cnt;
    }
    public void delete(int index){
        if(head==null){
            return;
        }
        if(index==1){
            head=head.next;
        }
        int cnt=1;
        Node temp=head;
        while(temp!=null && cnt<index-1){
            if(cnt==index){
              temp.next=temp.next.next;
              break;
            }
           temp=temp.next;
           cnt++;
        }
    }
}
class Main{
    public static void main(String args[]){
       LinkedList obj =new LinkedList();
       obj.add(30);
       obj.add(40);
       obj.add(50);
       obj.add(60);
       obj.add(50);
       obj.display();
       int d=obj.size();
       System.out.print(d);
    }
}
