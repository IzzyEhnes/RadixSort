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



    int size()
    {
        int size = 0;

        Node current = new Node();

        for (current = head; current != null; current = current.getNext())
        {
            size++;
        }

        return size;
    }
}






class RadixSort
{

    private Queue<Integer>[] qArray;
    private int ARRAY_SIZE;



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
        ARRAY_SIZE = inArray.length;

        int numPasses = getLargestNumDigits(inArray);

        for (int i = 1; i <= numPasses; i++)
        {
            for (int j = 0; j < inArray.length; j++)
            {
                int LSD = getDigit(inArray[j], i);

                putInQueue(inArray[j], LSD);
            }

            inArray = dequeueIntoArray();
        }

        printAscending(inArray);
        printDescending(inArray);
    }



    public void putInQueue(int inNum, int LSD)
    {
        switch (LSD)
        {
            case 0:
                qArray[0].enqueue(inNum);
                break;

            case 1:
                qArray[1].enqueue(inNum);
                break;

            case 2:
                qArray[2].enqueue(inNum);
                break;

            case 3:
                qArray[3].enqueue(inNum);
                break;

            case 4:
                qArray[4].enqueue(inNum);
                break;

            case 5:
                qArray[5].enqueue(inNum);
                break;

            case 6:
                qArray[6].enqueue(inNum);
                break;

            case 7:
                qArray[7].enqueue(inNum);
                break;

            case 8:
                qArray[8].enqueue(inNum);
                break;

            case 9:
                qArray[9].enqueue(inNum);
                break;
        }
    }



    public int[] dequeueIntoArray()
    {
        int[] numArray = new int[ARRAY_SIZE];

        int indexCount = 0;

        for (int i = 0; i < 10; i++)
        {
            int queueSize = qArray[i].size();

            for (int j = 0; j < queueSize; j++)
            {
                int temp = qArray[i].peek();
                qArray[i].dequeue();
                numArray[indexCount] = temp;
                indexCount++;
            }
        }

        return numArray;
    }



    public int getDigit(int inInt, int targetDigit)
    {
        StringBuilder sb = new StringBuilder(String.valueOf(inInt));
        sb.reverse();

        if (sb.toString().length() < targetDigit)
        {
            return 0;
        }

        else
        {
            char temp = sb.toString().charAt(targetDigit - 1);

            return Integer.parseInt(String.valueOf(temp));
        }
    }



    public int getLargestNumDigits(int[] inArray)
    {
        int numDigits = 0;

        int max = inArray[0];

        for (int i = 1; i < inArray.length; i++)
        {
            if (inArray[i] > max)
            {
                max = inArray[i];
            }
        }

        while (max > 0)
        {
            max /= 10;
            numDigits++;
        }

        return numDigits;
    }



    public void printAscending(int[] inArray)
    {
        System.out.println("Array in ascending order: ");

        for (int i = 0; i < inArray.length; i++)
        {
            System.out.println(inArray[i]);
        }

        System.out.println();
    }



    public void printDescending(int[] inArray)
    {
        System.out.println("Array in descending order: ");

        for (int i = inArray.length - 1; i >= 0; i--)
        {
            System.out.println(inArray[i]);
        }

        System.out.println();
    }
}






class Driver
{

    public static void main(String[] args)
    {
        int[] array = {170, 45, 75, 90, 802, 2, 24, 66};

        RadixSort r = new RadixSort();

        r.radixSort(array);
    }
}
