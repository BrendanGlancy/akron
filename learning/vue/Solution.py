# Create a linked list
class Node(object):
    def __init__(self, data):
        self.data = data
        self.next = None

    # reverse the linked list
    def reverse(self):
        prev = None
        current = self
        while current is not None:
            next = current.next
            current.next = prev
            prev = current
            current = next
        return prev

    # print the linked list
    def print_list(self):
        current = self
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()

    def main(self):
        head = Node(1)
        head.next = Node(2)
        head.next.next = Node(3)
        head.next.next.next = Node(4)
        head.next.next.next.next = Node(5)
        head.print_list()
        headReversed = head.reverse()
        headReversed.print_list()

if __name__ == "__main__":
    Node(1).main()
