public class Person implements Profile{
    private String name;
    private String hobby;
    private int age;
    public Person(String n, String h, int a){
        name = n;
        hobby = h;
        age = a;
    }
    public void userName(String user_name) {
        name = user_name;
    }

    public void userAge(int user_age) {
        age = user_age;
    }
    public void userHobby(String user_hobby) {
        hobby = user_hobby;
    }
    public String getName(){
        return name;
    }
    public String getHobby(){
        return hobby;
    }
    public int getAge(){
        return age;
    }
}
