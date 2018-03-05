public class Cat extends Animal{

  private String name, height, weight, color ;
  private String type = "Cat";

  Cat(String name,String weight, String color ){

    super(name, weight,color);
    this.name = name;
    //this.color = color;
    this.height = height;
    this.weight = weight;

  }


  public String getType(){

    return type;

  }

  public String getName(){

    return name;

  }
  public String getWeight(){

    return weight;

  }


 // public String getHeight() {
  //  return height;
  //}

  public static void main(String args[]){

    Cat beefy = new Cat("Cat Species","","default cat color");

    System.out.println("Name: " + beefy.getName());

    System.out.println("Type: " + beefy.getType());


  }

}