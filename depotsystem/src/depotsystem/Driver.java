package depotsystem;

public abstract class Driver {
    //declare protected varibales
    protected String username;
    protected String Password;
    
    
    public Driver(String username, String password) {
        this.username = username;
        this.Password = password; 
    }
    
    public boolean CheckPassword() {
        return false;
        
    }
    
    public boolean IsAvailable() {
        return false;
    }
    
    public void SetShchedule() {
        
    }

}