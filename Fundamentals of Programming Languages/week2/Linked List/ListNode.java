public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}

    public ListNode addTwoNumbers(ListNode n1, ListNode n2){
        int value1 = n1.val;
        int value2 = n2.val;
        int arrayValue1[] = {value1%100, ((value1/10)%10), ((value1%10)%10)};
        int arrayValue2[] = {value2%100, ((value2/10)%10), ((value2%10)%10)};
        int sum[] = new int[3];
        for(int i = 0; i < 3; i++){
            sum[i] = arrayValue1[0]+arrayValue2[0];
        }
        int reverse = sum[2]*100+sum[1]*10+sum[0];
        ListNode node = new ListNode(reverse);
        return node;
    }
}
