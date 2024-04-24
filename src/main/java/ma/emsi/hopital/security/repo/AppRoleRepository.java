package ma.emsi.hopital.security.repo;

import ma.emsi.hopital.security.entities.AppRoles;
import ma.emsi.hopital.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRoles, String> {
}
