# my-project-for-Camunda
Для знакомства с Camunda

1. https://start.camunda.com/  - создайте проект Camunda Automation Platform 7 Initializr
2. https://docs.camunda.org/manual/7.19/ - документация
3. https://camunda.com/download/modeler/ - установите Modeler (Open Source Desktop Modeler)
   
   При желании вы также можете запустить платформу Camunda с Docker:
docker pull camunda/camunda-bpm-platform:run-latest
docker run -d --name camunda -p 8080:8080 camunda/camunda-bpm-platform:run-latest



4. Откройте IntelliJ IDEA, File -> New -> Project from Existing Sources -> выберите распакованный файл, созданный в пункте №1, выберите Maven
5. Откройте через Modeler process.bpmn (находится в resources)

![image](https://user-images.githubusercontent.com/89107308/232590084-8e4553bb-69f7-4664-b2bb-655f6b0c0458.png)



6. Запустите Run 'Application'
7. Перейдите по ссылке http://localhost:8080/camunda/app/tasklist/default/#/login - работа с Camunda Tasklist (логин - demo, пароль - demo)
8. Выберите "Start process", введите значение переменной и нажмите "start"

![image](https://user-images.githubusercontent.com/89107308/232590360-e37484a5-31cd-4724-9b7d-feafc1aaf60d.png)


9. Выберите начатую task (нажмите All task для обновления задач), измените Claim(находится справа) на DemoDemo, нажмите на "Load Variables", чтобы увидеть результат работы программы
10. Нажмите "Complete"

Варианты результатов:
1) если warriors <= 0 или >100, то получим "Prepare to battle" (ошибка 'warriorsError')
2) если warriors > enemyWarriors, то battleStatus="Victory"
3) если warriors <= enemyWarriors, то battleStatus="Fail :("
