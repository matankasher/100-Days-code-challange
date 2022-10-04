/**
 * Definition for singly-linked list.
 * struct  {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    
    struct ListNode *temp = node->next;
    while ( temp->next != NULL )
    {
        node->val = temp->val;
        temp = temp->next;
        node = node->next;
    }
    node->val = temp->val;
    node->next = NULL;
    
}