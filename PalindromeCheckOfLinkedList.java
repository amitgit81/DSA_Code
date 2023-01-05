/*This program contains only function for checking the palindrome 
	Full code is not there.
*/

class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next == null)	//if there will be even no of Elements in LinkedList then we do nothing
        {
				
        }
        else			//here condition would be fast.next.next == null
        {
            fast = fast.next;  //if there will be even no of Elements in LinkedList then we increase step by one for one time
        }

        ListNode nH = slow.next;
        slow = null;

        ListNode curr = nH;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        nH = prev;
        ListNode t1 = head;
        ListNode t2 = nH;

        while(t1 != null && t2 != null)
        {
            if(t1.val != t2.val)
                return false;
            
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}