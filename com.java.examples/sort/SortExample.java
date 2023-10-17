class SortExample {
    public static void main(String[] args) {
        System.out.println("SortExample main started");
        int[] source = {4,7,2,4,1,4,6,8,9,4,6,7};
        int arrLength = source.length;
        System.out.println("Original arrays: ");
        for(int i = 0; i < arrLength; i ++) {
            System.out.print(source[i] + " ");
        }
        sortAsc(source);
        sortDesc(source);
        System.out.println("\nSortExample main stopped");
    }

    private static void sortAsc(int[] sourceArr) {
        int arrLength = sourceArr.length;
        for(int i = 0; i < arrLength - 1; i ++){
            for(int j = i + 1; j < arrLength; j++) {
                if(sourceArr[i] > sourceArr[j]) {
                    int temp = sourceArr[i];
                    sourceArr[i] = sourceArr[j];
                    sourceArr[j] = temp;
                }
            }
        }

        System.out.println("Sort Asc arrays: ");
        for(int i = 0; i < arrLength; i ++) {
            System.out.print(sourceArr[i] + " ");
        }
    }

    private static void sortDesc(int[] sourceArr) {
        int arrLength = sourceArr.length;
        for(int i = 0; i < arrLength - 1; i ++){
            for(int j = i + 1; j < arrLength; j++) {
                if(sourceArr[i] < sourceArr[j]) {
                    int temp = sourceArr[i];
                    sourceArr[i] = sourceArr[j];
                    sourceArr[j] = temp;
                }
            }
        }

        System.out.println("Sort Desc arrays: ");
        for(int i = 0; i < arrLength; i ++) {
            System.out.print(sourceArr[i] + " ");
        }
    }
}