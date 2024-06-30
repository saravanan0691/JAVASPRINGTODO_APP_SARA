Step 1: 

Todo Application Controller Guide:

start the BuildingRestApiTodoApplication (port configuraed 8082)


Step 2:

How to do CURD operation:

run the POST operation using postman. Url : localhost:8082/Todo
Request body: { "title":"NPCI", "description":"National Payments Corporation of India", "completed":1 }

{"title": "Course",    "description": "course2",    "completed": "True",    "createAt": "20-jun-2024"}

run the GET operation and get the all details URL: localhost:8082/Todo

run the GET operation with id and get that id details URL: localhost:8082/Todo/1

run the DELETE operation and delete the 3rd id. URL: localhost:8082/Todo/3

run the PUT operation and update details. URL: localhost:8082/Todo/1

{"title": "Course",    "description": "course3",    "completed": "True",    "createAt": "20-jun-2024"}

run the PATCH operation and update details. URL: localhost:8082/Todo/1
Request body: {"title": "Courses"}

Get the total count of todos. URL: localhost:8082/Todo/findById