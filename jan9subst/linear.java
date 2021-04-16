class linear {
    public static void main(String[] args) {
        int grid[][] = { { 11, 5, 6 }, { 65, 34, 76 }, { 84, 9, 11 } };
        int target = 5;
        boolean isfound = false;
        outer: for (var nums : grid) {
            for (int num : nums) {
                if (num == target) {
                    System.out.printf("Found! %d\n", target);
                    break outer;
                }
                else{
                    System.out.println("Not Found");
                }
            }
        }
    }
}