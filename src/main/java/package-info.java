/*
 * Singleton:   применён в классе Controller, т.к. в нём содержится единственный экземпляр, впоследствие применяющийся
 *              при запуске программы. Класс Controller имеет общие базовые настройки, поэтому логично было применить
 *              Singleton.
 * Factory:     не применён, т.к. нет необходимости в создании множества однотипных объектов или переноса сложной
 *              логики в фабрику.
 * Builder:     применён в классах Person и InputProcessor для создания личности с набором характеристик (firstName,
 *              phys, phone и пр.). Если необходимо будет добавить ещё характеристику (одну или несколько), нам не
 *              придётся менять конструктор. Также теперь есть возможность вызова только некоторых характреистик по мере
 *              надобности.
 * Adapter:     не применён, т.к. я не увидел несовместимых классов, которые можно (и нужно) было бы совместить с
 *              помощью адаптера.
 * Bridge:      не применён, т.к. нет большого количества классов и их наследников с пересекающимися параметрами. Хотя
 *              несколько классов ...Hair наводят на мысли, что может быть и есть определённая возможность применения
 *              бриджа. Однако, как именно реализовать эту возможность, понять мне так и не удалось.
 * Facade:      не применён, т.к. я не нашёл области его применения в коде. То есть по моему мнению нет такого порядка
 *              методов, которые можно было бы вынести в отдельный класс. На мой взгляд данный код уже довольно
 *              корректно разбит на необходимые классы и блоки. Хоть в лекции и упоминалось, что "код написан
 *              безобразно", я, видимо, вижу далеко не все "грехи" разработчика =)
 * DTO:         применён для создания единого объекта, включающего в себя ФИО (как рекомендовалось в лекции).
 *              Он же позволил ообъединить отдельные методы по обработке фамилии, имени и отчества в единый метод
 *              setNameFromFile при чтении из файла, оперирующий объектом класса Fio, что существенно позволило
 *              уменьшить количество кода.
 * Шаблон:      не применён, т.к. в рамках данного кода не вижу смысла в создании родителя, наследники которого будут
 *              переопределять его методы. На мой взгляд в коде нет однотипных методов, применяемых к объектам
 *              разных классов.
 */