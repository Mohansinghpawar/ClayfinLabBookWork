public class UserInputSetGet{

    private String name;
    private int id;

    Scanner userinput = new Scanner(System.in);

    public void setName(){
        System.out.println("Enter a name: ");
        name= userinput.next();     
    }

    public String getName(){

        return name;
    }

    public void displayInfo(){
        setName();
        System.out.println("You entered " + this.getName());
    }
    public static void main(String [] args){

        UserInputSetGet test = new UserInputSetGet();
        test.displayInfo();

    }

}
