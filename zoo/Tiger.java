public class Tiger extends Cat{

  private String name ,height, weight, color;
  private String sound = "Growl....";

  Tiger(String name,String weight, String color ){
    super( name, weight ,  color );
    this.color = color;

  }

  @Override
  public String getSound(){

    return sound;

  }
  @Override
  public String getColor(){
    return color;
  }

  public static void main(String args[]){

    Tiger tiger = new Tiger("tiger","","Brown with black strip");

    System.out.println("Name: "+tiger.getName());
    System.out.println("Sound: " +tiger.getSound());

    System.out.println("Color: "+tiger.getColor());
    System.out.println("Type: "+tiger.getType());
  }

}