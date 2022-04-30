package cinema.service;

import cinema.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(Role.RoleName roleName);
}
