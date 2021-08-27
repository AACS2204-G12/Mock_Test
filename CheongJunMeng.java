package test;

public class member {

    private String memberID;
    private String name;
    private int memberShipDuration;
    private static int noOfMembers;
   
    public member(){
        this.memberID = "";
        this.name = "";
        this.memberShipDuration = 0;
        member.noOfMembers ++;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberShipDuration() {
        return memberShipDuration;
    }

    public void setMemberShipDuration(int memberShipDuration) {
        this.memberShipDuration = memberShipDuration;
    }

    public static int getNoOfMemebers() {
        return noOfMembers;
    }

    public static void setNoOfMemebers(int noOfMemebers) {
        member.noOfMembers = noOfMemebers;
    }

    public member(String memberID, String name, int memberShipDuration) {
        this.memberID = memberID;
        this.name = name;
        this.memberShipDuration = memberShipDuration;
        member.noOfMembers++;
    }
    
    public double calculateMemberFees(){
        return this.memberShipDuration * 100;
    
    }
    
    @Override
    public String toString() {
        return "Member ID: " + memberID + "\n" + 
               "Name: " + name + "\n"  +
               "Membership Duration: " + memberShipDuration + "\n";
    }
    
    public static void main(String[] args){
        /**Need to declare two members */
        member mem = new member("E007","David Lee",3);
        
        System.out.println("Member ID: "+mem.getMemberID());
        System.out.println("Name: "+mem.getName());
        System.out.println("Membership Duration: "+mem.getMemberShipDuration());
        System.out.printf("Member Fees: %.2f \n",mem.calculateMemberFees());
    
    }
    
}