public class Players {
    private String firstName;
    private String lastName;
    private static int total;
    public Players(String fname,String lname){
        firstName = fname;
        lastName = lname;
        total++;
        System.out.println("Total players: "+total );
    }


}


