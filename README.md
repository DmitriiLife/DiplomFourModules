# Курсовой проект по модулю «Автоматизация тестирования» для профессии «Инженер по тестированию»

Курсовой проект представляет собой автоматизацию тестирования комплексного сервиса, взаимодействующего с СУБД Банка.

### Документы проекта

* [План автоматизации](Plan.md)
* [Отчет о тестировании веб-сервиса для приобретения путевок](Report.md)
* [Что было запланировано и что было сделано](Summary.md)

## Начало работы

Выполнить `git clone` проекта на локальный компьютер.

### Предпосылки

На локальном компьютере должен быть установлен Git, Java, Docker.

### Установка и запуск

1. Запустить Docker
2. Выполнить docker-compose.yml в папке проекта `docker-compose -f docker-compose.yml up`
3. Тестирование с использованием СУБД MySQL:
   3.1. Запустить SUT, выполнить `java -Dspring.datasource.url=jdbc:mysql://localhost:3306/app_db -jar artifacts/aqa-shop.jar`  
   3.2. Запуск тестов `./gradlew clean test -Dselenide.headless=true -Ddatasource.url=jdbc:mysql://localhost:3306/app_db`  
4. Остановить SUT `CTRL+C`
5. Остановить БД `docker-compose stop`, выполнить `docker-compose down`