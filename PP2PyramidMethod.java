public class PP2PyramidMethod {
    static void Pattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern(8);
    }

}

// Pyramid in reverse order.

// public class PP2PyramidMethod {
//     static void Pattern(int x) {
//         for (int i = x; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Pattern(5);
//     }

// }
