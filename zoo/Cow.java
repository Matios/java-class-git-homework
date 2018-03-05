public class Cow extends Animal{

  private String name, height, weight, color;

  private String sound = "Moo...";

  Cow(String name, String weight,String height ){

    super(name,weight,height);

  }

  public String getSound(){

    return sound;

  }

  public static void main(String args[]){

    Cow beefy = new Cow("beefy","500 pound","white");

    System.out.println("Name: " + beefy.getName());

    System.out.println("Sound: " + beefy.getSound());

    System.out.println("weight: " + beefy.getWeight());



  }

}