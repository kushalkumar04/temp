package linkedlist.circular;
import java.util.Scanner;

/*
 * Round Robin CPU Scheduling using Circular Linked List
 */
class ProcessNode {
    int pid, burstTime;
    ProcessNode next;

    ProcessNode(int pid, int bt) {
        this.pid = pid;
        this.burstTime = bt;
    }
}

public class RoundRobinScheduler {

    private ProcessNode head;

    public void addProcess(int pid, int bt) {
        ProcessNode newNode = new ProcessNode(pid, bt);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        ProcessNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void simulate(int quantum) {
        if (head == null) return;

        ProcessNode temp = head;
        do {
            if (temp.burstTime > 0) {
                int exec = Math.min(temp.burstTime, quantum);
                temp.burstTime -= exec;
                System.out.println("Process " + temp.pid + " executed for " + exec);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10);
        rr.addProcess(2, 5);
        rr.addProcess(3, 8);

        rr.simulate(3);
        sc.close();
    }
}