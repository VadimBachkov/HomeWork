public class Person {
     private String name;
     private String surname;
     private int age;
     private String profession;

     public Person(){

     }

     public Person(String name, String surname, int age, String profession) {
          this.name = name;
          this.surname = surname;
          this.age = age;
          this.profession = profession;
     }

     void printAgeGroup(){

          if (age<0){
               System.out.println("Некорректный возраст");
               return;
          }

          String group;
          if(age<=12){
               group = "Детсво";
          }else if (age <=17){
               group = "Юность";
          }else if (age <=44){
               group ="Молодость";
          }else if (age <= 59){
               group ="Зрелость";
          }else if (age <= 74){
               group ="Пожилой возраст";
          }else if (age <= 90){
               group ="Старость";
          }else {
               group ="Долгожитель";
          }
          System.out.println(group);
     }

     static void printAgeGroup(int age){
          if (age<0){
               System.out.println("Некорректный возраст");
               return;
          }

          String group;
          if(age<=12){
               group = "Детсво";
          }else if (age <=17){
               group = "Юность";
          }else if (age <=44){
               group ="Молодость";
          }else if (age <= 59){
               group ="Зрелость";
          }else if (age <= 74){
               group ="Пожилой возраст";
          }else if (age <= 90){
               group ="Старость";
          }else {
               group ="Долгожитель";
          }
          System.out.println(group);
     }

     public String getFullName(){
          return surname + " " + name;
     }


     public String getName() {
          return name;
     }

     public String getSurname() {
          return surname;
     }

     public int getAge() {
          return age;
     }

     public String getProfession() {
          return profession;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setSurname(String surname) {
          this.surname = surname;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public void setProfession(String profession) {
          this.profession = profession;
     }

}
