import javax.swing.text.Style;

class Stack<T>{
    private Node head=new Node();
    private int size=0;
    public void push(T e)
    {
        Node n=new Node();
        n.data=e;
        n.next=head.next;
        head.next=n;
        size++;
    }
    public T pop(){
        if(size==0){
            System.out.println("当前栈为空，无法出栈");
            return head.data;
        }
        else {
            T p;
            p = head.next.data;
            head.next = head.next.next;
            size--;
            return p;
        }
    }
    public  T top(){
        if(size==0) {
            System.out.println("当前栈为空，无法返回栈顶元素");
            return head.data;
        }
        else {
            return head.next.data;
        }
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
        String a=test.pop();
        System.out.println(a);
        a= test.top();
        System.out.println(a);
        test.pop();
        test.pop();
        test.pop();
        test.pop();
        a=test.pop();
        System.out.println(a);
    }
}