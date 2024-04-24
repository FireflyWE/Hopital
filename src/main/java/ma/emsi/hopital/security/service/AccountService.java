package ma.emsi.hopital.security.service;

import ma.emsi.hopital.security.entities.AppRoles;
import ma.emsi.hopital.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmPassword);
    AppRoles addRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
}