package auction.service.security;


public interface SecurityService {
    String findLoggedInUser();

    void autoLogin(String username, String password);
}
