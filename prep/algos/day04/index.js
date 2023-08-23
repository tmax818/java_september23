/**
 * A class to represents a single item of a SinglyLinkedList that can be
 * linked to other Node instances to form a list of linked nodes.
 */
class ListNode {

    constructor(data) {
      this.data = data;
      this.next = null;
    }
  }
  

  class SinglyLinkedList {

    constructor() {
      this.head = null;
    }
  
    isEmpty() {
      return this.head === null;
    }
  

    insertAtBack(data) {
      const newBack = new ListNode(data)

      // the list is empty
      if(this.isEmpty()){
        this.head = newBack
        return this;
      }

      // the list is not empty
      let runner = this.head

      while(runner.next !== null){
        runner = runner.next

      }
      runner.next = newBack
      return this

    }

    insertAtBackRecursive(data, runner = this.head) {
      if(this.isEmpty()){
        this.head = new ListNode(data)
        return this
      }

      if(runner.next === null){
        runner.next = new ListNode(data)
        return this
      }
      return this.insertAtBackRecursive(data, runner.next);
    }
  

    insertAtBackMany(vals) {
      for (const item of vals) {
        this.insertAtBack(item);
      }
      return this;
    }
  

    toArr() {
      const arr = [];
      let runner = this.head;
  
      while (runner) {
        arr.push(runner.data);
        runner = runner.next;
      }
      return arr;
    }
//! WEDNESDAY ////////////
/**
 * Creates a new node with the given data and inserts that node at the front
 * of this list.
 * - Time: (?).
 * - Space: (?).
 * @param {any} data The data for the new node.
 * @returns {SinglyLinkedList} This list.
*/
insertAtFront(data) {
  const newHead = new ListNode(data)
  newHead.next = this.head
  this.head = newHead
  return this
  
  
}

/**
 * Removes the first node of this list.
 * - Time: (?).
 * - Space: (?).
 * @returns {any} The data from the removed node.
*/
removeHead() {
  if(this.isEmpty()){
    return null
  }
  let thedata = this.head.data
  this.head = this.head.next
  return thedata
  
  
}


// EXTRA
/**
 * Calculates the average of this list.
 * - Time: (?).
 * - Space: (?).
 * @returns {number|NaN} The average of the node's data.
*/
average() {
  let runner = this.head
  let sum = 0;
  let count = 0;
  
  while(runner){
    count++;
    sum += runner.data;
    runner = runner.next;
  }
  let avg = sum/count
  if( count === 0){
    return "empty list"
  } else {
    return avg;
  }
}
//! THURSDAY ////////////
/**
 * Removes the last node of this list.
 * - Time: O(?).
 * - Space: O(?).
 * @returns {any} The data from the node that was removed.
 */
removeBack() {
  // case 1: empty list
  if(this.isEmpty()){
    return null
  }

  // case 2: one node
  if(this.head.next === null){
    return this.removeHead()
  }

  // case 3: more than one node
  let runner = this.head

  while(runner.next.next){
    runner = runner.next
  }

  //after while, runner is the second to last node
  const removedData = runner.next.data;
  runner.next = null;
  return removedData;
}

/**
 * Determines whether or not the given search value exists in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} val The data to search for in the nodes of this list.
 * @returns {boolean}
 */
contains(val) {

  let runner = this.head;

  while(runner){
    if(runner.data === val){
      return true;
    }
    runner = runner.next
  }
  return false;
}

/**
 * Determines whether or not the given search value exists in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @param {any} val The data to search for in the nodes of this list.
 * @param {?ListNode} current The current node during the traversal of this list
 *    or null when the end of the list has been reached.
 * @returns {boolean}
 */
containsRecursive(val, current = this.head) {
  if(current === null){
    return false;
  }
  if(current.data === val){
    return true;
  }
  return this.containsRecursive(val, current.next);
}

// EXTRA
/**
 * Recursively finds the maximum integer data of the nodes in this list.
 * - Time: O(?).
 * - Space: O(?).
 * @param {ListNode} runner The start or current node during traversal, or null
 *    when the end of the list is reached.
 * @param {ListNode} maxNode Keeps track of the node that contains the current
 *    max integer as it's data.
 * @returns {?number} The max int or null if none.
 */
recursiveMax(runner = this.head, maxNode = this.head) {}

  }
  
  /******************************************************************* 
  Multiple test lists already constructed to test your methods on.
  Below commented code depends on insertAtBack method to be completed,
  after completing it, uncomment the code.
  */
  const emptyList = new SinglyLinkedList();
  
  // const singleNodeList = new SinglyLinkedList().insertAtBackMany([1]);
  // const biNodeList = new SinglyLinkedList().insertAtBackMany([1, 2]);
  // const firstThreeList = new SinglyLinkedList().insertAtBackMany([1, 2, 3]);
  // const secondThreeList = new SinglyLinkedList().insertAtBackMany([4, 5, 6]);
  // const unorderedList = new SinglyLinkedList().insertAtBackMany([
  //   -5, -10, 4, -3, 6, 1, -7, -2,
  // ]);
  
  /* node 4 connects to node 1, back to head */
  // const perfectLoopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
  // perfectLoopList.head.next.next.next = perfectLoopList.head;
  
  /* node 4 connects to node 2 */
  // const loopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
  // loopList.head.next.next.next = loopList.head.next;
  
  // const sortedDupeList = new SinglyLinkedList().insertAtBackMany([
  //   1, 1, 1, 2, 3, 3, 4, 5, 5,
  // ]);
  
  // Print your list like so:
  // console.log(firstThreeList.toArr());

  const sll = new SinglyLinkedList()
  sll.insertAtBack(1)
  sll.insertAtBack(2)
  sll.insertAtBack(3)
  // console.log(sll.removeHead())
  console.log(sll.containsRecursive(3))
  console.log(sll.average())
  console.log(sll.toArr())