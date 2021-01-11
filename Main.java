class Main {

    static void printX(int number) {
        System.out.println(number);
    }

    static String printFName(String fname) {
        return fname;
    }

    public static void main(String[] args) {
        
        printX(29);
        String firstName = printFName("kyle");
        System.out.println(firstName);

        System.out.println(firstName.substring(1, 2));

        // System.out.println("Hello World");

        // System.out.println(x);

        // int y;
        // y = 17;
        // System.out.println(y);
    
        // final int w = 27;
        // // w = 28; errors out since you cant redefine a final variable 
        // System.out.println(w);
        
        // String name = "kyle";
        // System.out.println(name.length());
        // System.out.println(name);

        // float decimal = 2.2f; //f means its a floating point, and d is double precision numbers, provides 6 to 7 decimals
        // System.out.println(decimal);

        // double number = 2.2; // double is more accurate than a float, provides 15 to 16 decimals
        // System.out.println(number);

        // boolean myBool = false;
        // System.out.println(true);

        // char letter = 'a';
        // System.out.println(letter);

        // //declaring multiple variables of the same type
        // int k = 9, e = 10, l = 3;
        // System.out.println(k + e + l);

        // float division = k / 4f;
        // float modulo = k % 4f ;
        // System.out.println(division);
        // System.out.println(modulo);

        // String txt = "We are the so-called \"Vikings\" from the north.";
        // System.out.println(txt); 
    }
}
