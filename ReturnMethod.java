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