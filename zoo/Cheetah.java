public class Cheetah extends Cat{

  private String name ,height, weight, color ;
  private String sound = "Purrs....";

  Cheetah(String name,String weight, String color  ){
    super( name, weight,color);
    this.color = color;

  }

  public String getSound(){

    return sound;

  }
public String getColor(){
    return color;
}
  public static void main(String args[]){

    Cheetah cheetah = new Cheetah("cheetah","","Tan with black spot");

    System.out.println("Name: "+cheetah.getName());
    System.out.println("Sound: "+cheetah.getSound());
    System.out.println("Color: "+ cheetah.getColor());
    System.out.println("Type: "+ cheetah.getType());
  }

}