class Method {
    
    String name;
    int age;

        void speak() {
        System.out.println("My name is " + name + " and I am " + age + " Years old." );

        }

        public static void main (String[] args) {

        Method person1 = new Method();
        person1.name = "Nitish Tayal";
        person1.age = 22;
        person1.speak();

        Method person2 = new Method();
        person2.name = "Vivek Kumar";
        person2.age = 23;
        person2.speak();
        }
    }