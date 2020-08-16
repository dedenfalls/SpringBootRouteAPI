This project is a maven spring boot project. To be able to run the project, Just create a Database named "Routes" (without quotatitons marks)
on the MongoDB database and add a collection named "Route" (without quotatitons marks). 
Then run mongoDB server with mongod. run the project as java application.
Now you can access tho api from http://localhost:8080/
the provided apis are:
/addRoute
/findAllRoutes
/routes/{id}
/delete/{id}
/{id}/crit_points
/update