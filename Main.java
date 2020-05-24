package sda._200523.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        StringList list = new StringList();
        list.add("Java");
        list.add("jest");
        list.add("fajna");
        System.out.println(list.size());
        printList(list);
        StringList copyList = new StringList(list);
        sortDescending(copyList);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size() - 1 - i));
        }
        list.addAt("nie", 1);
        printList(list);
    }

    private static void printList(StringList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void sortDescending(StringList copyList) {
        while (copyList.size() != 0) {
            int maxLength = 0;
            int maxIndex = 0;
            for (int i = 0; i < copyList.size(); i++) {
                if (copyList.get(i).length() > maxLength) {
                    maxLength = copyList.get(i).length();
                    maxIndex = i;
                }
            }
            System.out.println(copyList.get(maxIndex));
            copyList.remove(copyList.get(maxIndex));
        }
    }
}
