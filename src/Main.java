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






class RadixSort
{

    private Queue<Integer>[] qArray;

    public RadixSort()
    {
        Queue<Integer> Q0 = new Queue<>();
        Queue<Integer> Q1 = new Queue<>();
        Queue<Integer> Q2 = new Queue<>();
        Queue<Integer> Q3 = new Queue<>();
        Queue<Integer> Q4 = new Queue<>();
        Queue<Integer> Q5 = new Queue<>();
        Queue<Integer> Q6 = new Queue<>();
        Queue<Integer> Q7 = new Queue<>();
        Queue<Integer> Q8 = new Queue<>();
        Queue<Integer> Q9 = new Queue<>();

        qArray = new Queue[]{Q0, Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9};
    }



    public void radixSort(int[] inArray)
    {

    }



    public int getLeastSignificantDigit(int inInt)
    {
        while (inInt > 10)
        {
            inInt %= 10;
        }

        int LSD = inInt;

        System.out.println(LSD);

        return LSD;
    }

}






class Driver
{

    public static void main(String[] args)
    {
        int[] array = {170, 45, 75, 90, 802, 2, 24, 66};

        RadixSort r = new RadixSort();

        r.getLeastSignificantDigit(123);
    }
}
