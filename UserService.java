
public class UserService {
	
	@Service 
	public class UserService implements UserDb {
	@Autowired
	private UserDao userDao;

	@Autowired
	PasswordEncoder encoder;

	@Autowired 
	private VerificationDao verificationDao; 

	boolean changePassword(){            
		  String pass=JOptionPane.showInputDialog(null, "Enter old password: ", "Input", JOptionPane.QUESTION_MESSAGE);
		  if(pass.equals(Password)) {
		    String newpass=JOptionPane.showInputDialog(null, 
		           "Enter new password: ", "Input", JOptionPane.QUESTION_MESSAGE);
		    String connewpass=JOptionPane.showInputDialog(null, 
		           "Enter confirming new password: ", "Input", 
		            JOptionPane.QUESTION_MESSAGE);
		    if(newpass.equals(connewpass)){
		      Password= newpass;
		      JOptionPane.showMessageDialog(null, "password changed ", "message", 
		          JOptionPane.INFORMATION_MESSAGE);
		      return true;
		    }
		    else
		    JOptionPane.showMessageDialog(null, "Wrong Conferm ", "message", 
		        JOptionPane.INFORMATION_MESSAGE);

		  }
		  else
		    JOptionPane.showMessageDialog(null, "Wrong password ", "message", 
		        JOptionPane.INFORMATION_MESSAGE);

		  return false;
		}

	}
	}
