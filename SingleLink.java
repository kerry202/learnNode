package com.locojoy.message.util;

/**
 * 单向链表
 * @author: kerry
 * date: On $ {DATE}
 */
public class SingleLink<T> {

    //头节点
    Node head = null;

    class Node<T> {
        Node next = null;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T o) {

        Node newNode = new Node(o);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = this.head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    /**
     * 删除指定索引
     */
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i = 1;
        Node proNode = this.head;
        Node curNode = proNode.next;
        while (curNode != null) {
            if (i == index) {
                proNode.next = curNode.next;
                return true;
            }
            proNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    /**
     * 删除指定对象
     */

    public boolean deleteNode(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        Object tmp = n.data;
        n.data = n.next.data;
        n.next.data = tmp;
        n.next = n.next.next;
        return true;
    }

    public void printList() {
        Node tmp = this.head;
        while (tmp != null) {
            tmp = tmp.next;
            System.out.println(tmp);
        }
    }


    public int length() {
        int lenth = 0;
        Node tmp = this.head;
        while (tmp != null) {
            lenth++;
            tmp = tmp.next;
        }
        return lenth;
    }


    /**
     * 链表反转
     *
     * @param head
     * @return
     */
    public Node ReverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReversedHead;
        return this.head;
    }

    /**
     * 查找单链表的中间节点
     *
     * @param head
     * @return
     */
    public Node SearchMid(Node head) {
        Node p = this.head, q = this.head;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        System.out.println("Mid:" + q.data);
        return q;
    }

    /**
     * 查找倒数 第k个元素
     *
     * @param head
     * @param k
     * @return
     */
    public Node findElem(Node head, int k) {
        if (k < 1 || k > this.length()) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        // 前移k步
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    /**
     * 删除重复节点
     */
    public void deleteDuplecate(Node head) {
        Node p = head;
        while (p != null) {
            Node q = p;
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;
                } else {
                    q = q.next;
                }
            }
            p = p.next;
        }

    }

    /**
     * 从尾到头输出单链表，采用递归方式实现
     *
     * @param pListHead
     */
    public void printListReversely(Node pListHead) {
        if (pListHead != null) {
            printListReversely(pListHead.next);
            System.out.println("printListReversely:" + pListHead.data);
        }
    }

    /**
     * 判断链表是否有环，单向链表有环时，尾节点相同
     */
    public boolean IsLoop(Node head) {
        Node fast = head, slow = head;
        if (fast == null) {
            return false;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("该链表有环");
                return true;
            }
        }
        return !(fast == null || fast.next == null);
    }

    /**
     * 找出链表环的入口
     */
    public Node FindLoopPort(Node head) {
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
