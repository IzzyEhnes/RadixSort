class Node<T>
{
    private T value;

    private Node next;


    public Node()
    {
    }



    public Node(T inValue)
    {
        this.value = inValue;
    }



    T getValue()
    {
        return value;
    }



    void setValue(T inValue)
    {
        this.value = inValue;
    }



    Node getNext()
    {
        return next;
    }



    void setNext(Node inNode)
    {
        next = inNode;
    }
}






class Queue<T>
{
    private Node<T> head;

    public Queue()
    {

    }



    void enqueue(T inVal)
    {
        Node nn = new Node();

        nn.setValue(inVal);

        nn.setNext(null);

        if (head == null)
        {
            head = nn;
        }

        else
        {
            Node current = head;
            while (current.getNext() != null)
            {
                current = current.getNext();
            }

            current.setNext(nn);
        }
    }



    void dequeue()
    {
        if (head != null)
        {
            head = head.getNext();
        }
    }



    T peek()
    {
        if (head == null)
        {
            return null;
        }

        else
        {
            return head.getValue();
        }
    }



    boolean isEmpty()
    {
        if (head == null)
        {
            return true;
        }

        else
        {
            return false;
        }
    }



    void traverse()
    {
        Node current = new Node();

        for (current = head; current != null; current = current.getNext())
        {
            System.out.print(current.getValue());
        }
    }
}






public class Main
{

    public static void main(String[] args)
    {
	// write your code here
    }
}
