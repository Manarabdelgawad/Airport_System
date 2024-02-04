public  abstract class Person {
   private int id;
   private String name;
   private float age;
   private String gender,nationality;
    public Person()
    {}
    public Person(int id, String name, float age, String gender, String nationality) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }
    public int getId () {
         return id;
     }

     public void setId ( int id){
         this.id = id;
     }

     public String getName () {
         return name;
     }

     public void setName (String name){
         this.name = name;
     }

     public float getAge () {
         if (age > 0 && age < 100)
             return age;
         else {
             System.out.println("age not available");

             return 0;
         }
     }

     public void setAge ( float age){
         this.age = age;
     }

     public String getNationality () {
         return nationality;
     }

     public void setNationality (String nationality){
         this.nationality = nationality;
     }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
