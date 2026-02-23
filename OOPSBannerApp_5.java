public class OOPSBannerApp_4{
    public static void main(String[] args) {

        // Store all 7 lines of OOPS banner
        String[] banner = {

            String.join(" ",
                "  *****  ",  // O
                "  *****  ",  // O
                " ******* ",  // P
                " ******* "   // S
            ),

            String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * "
            ),

            String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *      "
            ),

            String.join(" ",
                " *     * ",
                " *     * ",
                " ******  ",
                "  *****  "
            ),

            String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "       * "
            ),

            String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *     * "
            ),

            String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  *****  "
            )
        };

        // Print using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}