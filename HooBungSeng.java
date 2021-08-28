public class JavaApplication32 {

    
    public static void main(String[] args) {
        /**Need to declare two members */
       Member mem = new Member();
       mem.setName("Wang Ang Tee");
       mem.setMemberId("M001");
       mem.setMembershipDuration(10);
       System.out.print(mem.toString());
    }
    
}
public class Member {
    /**Need to declare as private variable */
    String memberId,name;
    int membershipDuration;
    static int noOfMembers;
    
    public Member(){
        
        Member.noOfMembers++;
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
    /**Need to have mutator and setter for all variable */
  
    @Override
    public String toString(){
     return "Member No:"+Member.noOfMembers+"\nMember ID :"+ this.memberId +"\nMember Name:"+this.name+"\nMember Fees: RM"+this.calculateMemberFees();
    }
    
    
    
    
}