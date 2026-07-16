class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }

    public void push(int x) {
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
    }

    public int pop() {
        return q2.poll();
    }

    public int top() {
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty();
    }
}