import java.util.Scanner;
class AuthenticationException extends Exception
{
    public AuthenticationException(String message)
    {
        super(message);
    }
}

public class UserAuthentication 
{
    public static void authenticate(String username, String password) throws AuthenticationException 
    {
        String correctUsername = "admin";
        String correctPassword = "ksb123";
        if (username == null || password == null || !username.equals(correctUsername) || !password.equals(correctPassword)) 
        {
            throw new AuthenticationException("Invalid username or password.");
        }
        System.out.println("Authentication successful!");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        try 
        {
            authenticate(username, password);
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        } finally 
        {
            scanner.close();
        }
    }
}

