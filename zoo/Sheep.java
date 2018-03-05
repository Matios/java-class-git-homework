public class Sheep extends Animal{

  private String name;
  private String weight;

  private String sound = "Baahahaa...";


  Sheep(String name, String weight,String color){

    super(name,weight,color);

  }
  @Override
  public String getSound(){

    return sound;

  }

  public static void main(String args[]){

    Sheep shelly = new Sheep("Shelly","100","1.2 meter");

    System.out.println("Name: " + shelly.getName());

    System.out.println("Sound: " +shelly.getSound());

  }

}