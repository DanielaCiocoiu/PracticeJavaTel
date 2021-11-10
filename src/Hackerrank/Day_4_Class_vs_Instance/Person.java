package Hackerrank;

public class Day_4_Class_vs_Instance {

    public class person {
        public static void main(String[] args) {
            
        }
        private int age;

        public person(int initialAge) {
            if (initialAge >= 0) {
                this.age = initialAge;
            } else {
                age = 0;
                System.out.println("Age is not valid, setting age to 0");
            }

        }

        public void yearPasses(int age) {  //yearPasses() should increase the  instance variable by .
            this.age += 1;
        }

        public void amIOld(int age) {
            if (age <13){
                System.out.println("You are to young");
            }else if (age >=13 && age <18){
                System.out.println("You are a teenager..");
            }else {
                System.out.println("You are old..");
            }
        }
    }
}
