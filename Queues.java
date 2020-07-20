class Queues{

    static int head = 0;
    static int tail = 0;
    static int max = 10;
    public static int[] enque(int[] arr,int data){

        if(Queues.tail == Queues.max){

            System.out.println("Queue maxed out");
            return null;

        }else{

            arr[Queues.tail] = data;
            Queues.tail++;

            return arr;

        }

    }


    public static int[] deque(int[] arr){

        Queues.head = Queues.head + 1;
        return arr;

    }    
    public static void main(String[] args) {
        
        int[] arr = new int[Queue.max];
        arr = Queues.enque(arr, 1);
        arr = Queues.enque(arr, 2);

        arr = Queues.enque(arr, 3);

        arr = Queues.enque(arr, 4);

        arr = Queues.deque(arr);
        arr = Queues.deque(arr);

        arr = Queues.enque(arr, 5);

        Queues.printQueue(arr);

    }


    public static void printQueue(int[] arr){

        for(int i = Queues.head; i<Queues.tail; i++){

            System.out.println( arr[i]);
        }

    }



}