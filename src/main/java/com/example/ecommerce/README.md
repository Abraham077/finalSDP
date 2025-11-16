# E-Commerce Shopping Cart (Design Patterns)


Проект демонстрирует 6 паттернов проектирования: Facade, Factory, Builder, Strategy, Decorator, Bridge.


Запуск:
- Собрать через Maven: `mvn package`
- Запустить: `java -cp target/ecommerce-project-1.0-SNAPSHOT.jar com.example.ecommerce.App`


Описание:
- `ECommerceFacade` — упрощённый интерфейс для операций магазина
- `ProductFactory` — фабрика для создания продуктов
- `ProductBuilder` — строит продукт по шагам
- `Decorator` — добавляет функциональность продуктам (гарантия, подарочная упаковка)
- `Strategy` — стратегия скидки
- `Bridge` — абстрактный уровень платежей и конкретные шлюзы (Stripe/PayPal)
```
