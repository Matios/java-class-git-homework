public class Lion extends Cat{

  private String name,height, weight, color;
  private String sound = "Roar....";

  Lion(String name,String weight, String color ){
    super( name, weight,   color );
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

    Lion lion = new Lion("lion","","Brownish");

    System.out.println("Name: "+lion.getName());
    System.out.println("Sound: "+lion.getSound());
    System.out.println("Color: "+lion.getColor());
    System.out.println("Type: "+lion.getType());
  }

}