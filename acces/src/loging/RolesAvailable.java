package loging;

public enum RolesAvailable {
	// title (login, password, url)
	System("gestlog", "gestlog", "jdbc:mysql://localhost:3306/sec_gest?verifyServerCertificate=false&useSSL=true&requireSSL=true"), 
	Admin("gestadmin", "gestadmin","jdbc:mysql://localhost:3306/admin_secress/?verifyServerCertificate=false&useSSL=true&requireSSL=true"),
	Employer("gestuser", "gestuser","jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true&requireSSL=true"), 
	Maintenance("gestress", "gestress",	"jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true&requireSSL=true"), 
	Manager("gestprof", "gestprof","jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true&requireSSL=true"),
	Standard("geststand", "geststand","jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true&requireSSL=true");

	private RolesAvailable(String _login, String _password, String _url) {
		login = _login;
		password = _password;
		url = _url;
	}
	private String login;
	private String password;
	private String url;
	public String getLogin() {return login;}
	public String getPassword() {return password;}
	public String getURL() {return url;}
}
