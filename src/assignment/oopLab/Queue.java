package assignment.oopLab;

public class Queue {
    public double[] queueElements;
    private int queueCapacity;
    private int lastIndex;

    public Queue(int capacity){
        this.queueElements= new double[capacity];
        this.queueCapacity= capacity;
        this.lastIndex= -1;
        System.out.println("Creating a Queue: Capacity " + capacity);
    }

    public void enqueue(double n){
        if(lastIndex== queueCapacity-1){
            System.out.println("Error Enqueuing " + n);
        }
        else{
            lastIndex++;
            queueElements[lastIndex]= n;
            System.out.println("Enquee " + n + ": Successful");
        }
    }

    public void dequeue(){
        if(lastIndex==-1){
            System.out.println("Error cannot dequequ");
        }
        else{
            System.out.println("Dequeqe: Successful");
            for(int i= 0; i<lastIndex; i++){
                queueElements[i]= queueElements[i+ 1];
            }
            lastIndex--;
        }
    }

    public void printElements(){
        if(lastIndex== -1){
            System.out.println("Queue is empty.");
        }
        else{
            System.out.println("Showing Elements of queue: ");
            for(int i= 0; i<= lastIndex; i++){
                System.out.print(queueElements[i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
