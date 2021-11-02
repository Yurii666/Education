package java_10thEdition;

public class Search {
    public static void main(String[] args) {
        int nums[] = {6,8,3,5,7,2,9,4,15};
        int val = 5;
        boolean found = false;
        for (int x:nums){
            if (x==val) {
                found = true;
                break;
            }
        }
        if (found)
        System.out.println("Значение найдено!");
    }
}
