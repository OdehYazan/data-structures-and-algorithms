package queue.data;


  public class QueueNode<T> {
    T data;
    QueueNode next;

    public QueueNode(T data) {
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }

    public QueueNode getNext() {
      return next;
    }

    public void setNext(QueueNode next) {
      this.next = next;
    }

    @Override
    public String toString() {
      return "Node{" +
        "data='" + data + '\'' +
        '}';
    }
  }

