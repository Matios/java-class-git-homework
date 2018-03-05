public class Animal{

  private String name;
  private String weight;
  private String color ;
  private String height;

  private String sound = "I'm a generic animal!!";

  Animal(String name, String weight, String color){

    this.name = name;

    this.height = height;
    this.weight = weight;
    this.color = color;

  }

  public String getName(){

    return name;
  }

  public String getColor() {
    return color;
  }

  public String getHeight() {
    return height;
  }

  public String getWeight() {
    return weight;
  }

  public String getSound(){

    return sound;
  }



  public static void main(String args[]){

    Animal generic = new Animal("Animal","500 pounds","Default color ");

    System.out.println("Name: " + generic.getName());

    System.out.println("Sound: " + generic.getSound());

    System.out.println("Weight : " + generic.getWeight());

    System.out.println("Color: " + generic.getColor());



  }

}