/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigDecimal;
import java.math.BigInteger;
class Solution {
    
    public String traverseList(ListNode l) {
        String s = "";
        ListNode temp = l;
        while(temp.next != null){
            s = s.concat(String.valueOf(temp.val));
            temp = temp.next;
        }
        s = s.concat(String.valueOf(temp.val));
        return s;
    }
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = reverseString(traverseList(l1));
        String s2 = reverseString(traverseList(l2));
        BigDecimal sum = new BigDecimal(s1).add(new BigDecimal(s2));
        String numberString = sum.toString();
        ListNode temp = new ListNode();
        ListNode head = temp;
        for (int i = numberString.length()-1; i >= 0 ; i--){
            char c = numberString.charAt(i);        
            if(i == numberString.length() -1 ){
                temp.val = Integer.parseInt(String.valueOf(c));
            } else {
                temp.next = new                         ListNode(Integer.parseInt(String.valueOf(c)),null);
                temp = temp.next;
            }
        }
        return head;
    }
}