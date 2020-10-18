import javax.swing.text.Style;

class Stack<T>{
    private Node head=new Node();
    private int size;
    public void push(T e)
    {
        Node n=new Node();
        n.data=e;
        n.next=head.next;
        head.next=n;
    }
    public T pop(){
        T p;
        p=head.next.data;
        head.next=head.next.next;
        return p;
    }
    public  T top(){
        return head.next.data;
    }
    private class Node{
        public T data;
        public Node next;
    }
}
public class MyStack{
    public static void main(String[] args){
        Stack<String> test=new Stack<String>();
        test.push("zhangshan");
        test.push("lisi");
        test.push("wangmazi");
        test.push("akjdfh");
        System.out.println(test.pop());
        System.out.println(test.top());
    }
}