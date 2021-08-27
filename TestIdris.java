 public class JavaApplication22 {


public static void main(String[] args) {
    /**Need to declare two members */
       Member mem = new Member();
       mem.setname("Idris shah");
       mem.setmemberId("S786");
       mem.setmembershipDuration(10);
       System.out.print(mem.toString());
    }
    
public class member {
    private String memberId;
    private String name;
    private int membershipDuration;
    private static int noOfMembers;
}

    public member() {
        /**use Member.numOfMembers for better visibility.  */
        this.noOfMembers++;
    }

    public member(String memberId, String name, int membershipDuration) {
        this.memberId = memberId;
        this.name = name;
        this.membershipDuration =  membershipDuration;
        /**need to increment noOfMembers */
}
    
    
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateMemberFees() {
        return membershipDuration *100;
    }

    public void setMembershipDuration(int membershipDuration) {
        this.membershipDuration = membershipDuration;
    }
    /**Need to declare setter and getter for all variable */
  
    @Override
    public String toString(){
     return "Member No:"+Member.noOfMembers+"\nMember ID :"+ this.memberId +"\nMember Name:"+this.name+"\nMember Fees: RM"+this.calculateMemberFees();
    }
    
    
    
   }

