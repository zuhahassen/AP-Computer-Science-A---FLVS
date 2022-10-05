
/**
 * Purpose: Implementation class, to intialize variables
 *
 * @author Zuha Hassen
 * @version 4/15/2022
 */
public class Contact
{
    private String name;
    private String relation;
    private String birthday;
    private String phoneNumber;
    private String email;

   
    public Contact(String n, String r, String b, String p, String e)
    {
        name = n;
        relation = r;
        birthday = b;
        phoneNumber = p;
        email = e;
    }

    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void setRelation(String r){
        relation = r;
    }
    
    public String getRelation(){
        return relation;
    }
    
    public void setBday(String b){
        birthday = b;
    }
    
    public String getBday(){
        return birthday;
    }
    
    public void setPhoneNum(String p){
        phoneNumber = p;
    }
    
    public String getPhoneNum(){
        return phoneNumber;
    }
    
    public void setEmail(String e){
        email = e;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String toString()
    {
        return String.format("%-25s %-15s %-15s %-15s %-15s", name, relation, birthday, phoneNumber, email);
    }
}
