package miniProjects;

public class FindNumbers {
    public static void main(String[] args) {


        int[] nums = {1, 3, 5, 7, 13, 8, 2, 9, 33, 6, 0};
        int search = -1;
        boolean isOnList = false;

        for (int num : nums) {
            if (search == num) {
                isOnList = true;
                break;
            }
        }
        if (isOnList)System.out.println("Search num is on the list");
        else System.out.println("Search num is not on the list");
    }
}
