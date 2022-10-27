package kitchenpos.fixture;

import java.math.BigDecimal;
import java.util.List;
import kitchenpos.domain.Menu;
import kitchenpos.domain.MenuProduct;

@SuppressWarnings("NonAsciiCharacters")
public enum MenuTestFixture {

    떡볶이("떡볶이", BigDecimal.valueOf(10000)),
    ;

    private final String name;
    private final BigDecimal price;

    MenuTestFixture(final String name, final BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Menu toEntity(final long menuGroupId, final List<MenuProduct> menuProducts) {
        return toEntity(price, menuGroupId, menuProducts);
    }

    public Menu toEntity(final BigDecimal price, final long menuGroupId, final List<MenuProduct> menuProducts) {
        Menu menu = new Menu(null, name, price, menuGroupId);
        menu.addMenuProducts(menuProducts);
        return menu;
    }
}
