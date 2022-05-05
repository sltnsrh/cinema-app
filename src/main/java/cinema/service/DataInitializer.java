package cinema.service;

import cinema.model.Role;
import cinema.model.User;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User adminUser = new User();
        adminUser.setEmail("admin@i.ua");
        adminUser.setPassword("admin123");
        adminUser.setRoles(Set.of(adminRole));
        userService.add(adminUser);
        User user = new User();
        user.setEmail("user@i.ua");
        user.setPassword("12345678");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
