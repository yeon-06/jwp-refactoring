package kitchenpos.menu.dao;

import java.util.List;
import java.util.Optional;
import kitchenpos.menu.domain.MenuGroup;

public interface MenuGroupDao {
    MenuGroup save(MenuGroup entity);

    Optional<MenuGroup> findById(Long id);

    List<MenuGroup> findAll();

    boolean existsById(Long id);
}