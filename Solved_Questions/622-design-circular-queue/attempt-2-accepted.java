class MyCircularQueue {
    int[] arr;
    int front = 0, rear = -1, count = 0, size;
    public MyCircularQueue(int k) {
        size = k;
        arr = new int[k];
    }
    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % size;
        arr[rear] = value;
        count++;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % size;
        count--;
        return true;
    }
    public int Front() {
        return isEmpty() ? -1 : arr[front];
    }
    public int Rear() {
        return isEmpty() ? -1 : arr[rear];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == size;
    }
}