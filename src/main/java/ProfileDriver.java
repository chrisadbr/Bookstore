public class ProfileDriver {
    public interface Multiply{
        public int multiply(int a, int b);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Juma Nasib", "Coding", 50);
        Person p2 = new Person("Nasir Jones", "Rapper", 47);

        p1.userAge(34);
        p1.userHobby("Dancing");
        printProfile(p1);

        p2.userName("Douglas James");
        p2.userHobby("Swimming");
        p2.userAge(43);
        printProfile(p2);

//        Area area = new Area() {
//            @Override
//            public double Circle(int rad) {
//                return Math.PI * Math.pow(rad, 2);
//            }
//        };
        Multiply area1 = (a, b) -> a * b;
        Area area = radius -> Math.PI * Math.pow(radius, 2);
        System.out.printf("Area: %.2f\n", area.Circle(6));
        int product = area1.multiply(3, 4);
        System.out.println("Product: " + product);
    }
    public static void printProfile(Profile p){
        System.out.println("User Profile");
        System.out.printf("Name: %s\nAge: %d\nHobby: %s\n\n", p.getName(), p.getAge(), p.getHobby());
    }
}
