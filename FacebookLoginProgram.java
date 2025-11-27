package module1programs;
class AUtomationProject
{
	private int age=15;
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
	private String emailId="dsds@gmail.com";
	public String getEmailId()
	{
		return emailId;
	}
	public void setEmailId(String emailId)
	{
		this.emailId=emailId;
	}
	
	private int otp=7414;
	public int getOtp() 
	{
		return otp;
	}

	public void setOtp(int otp)
	{
		this.otp = otp;
	}
}


public class FacebookLoginProgram {

	public static void main(String[] args) 
	
	{
		
		AUtomationProject a1= new AUtomationProject();
		a1.setAge(24);
		System.out.println(a1.getAge());
		a1.setEmailId("549fkj@gmail.com");
		System.out.println(a1.getEmailId());
	}

}
