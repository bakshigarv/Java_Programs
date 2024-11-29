class ReturnMethod{

    int age;

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
       return yearsLeft;
    }
    public static void main(String[]args) {
        ReturnMethod person1 = new ReturnMethod();
        person1.age = 22;
        
        int years = person1.calculateYearsToRetirement();

        System.out.println(years);
    }
}

// class ReturnMethod {
//     static int calculateYearsToRetirement(int x) {
//         return 65 -x;
//     }

//     public static void main (String[]args) {
//         System.out.println(calculateYearsToRetirement(22));
//     }
// }