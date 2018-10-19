# CourseService
Restful  API
Courses:

GET: To get course with id 0, Try->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/courses/0"
GET: To get all the courses, Try->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/courses"
DELETE: To delete course 0, Try->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/courses/0"
PUT: To change course 2, Try-> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/courses/0"
     And set the body as following
       {
        "TA": {
  
                	"photo": 123,
          
              	        "program": {
                
       				"courses": [],
               
			        "name": "Information Systems",
             
			        "programId": 33
          
			   },
            
			"studentId": 23243
       
		 },
        
		"name": "Tensor flow",
   
                "professor": {
          
				  "department": "InfoSystems",
            
				  "firstName": "Tom",
           
				  "joiningDate": "2018-10-17T16:17:21.879",
          
				  "professorId": 1
        
			     }
  
    }
-------------------------------------------------------------------------------------
Lectures:

GET: To get all lectures: GET->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/lectures"
GET: To get lecture0: GET->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/lectures/0"
POST: To add new lecture: POST-> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/lectures"
      put in body:

	{
   "name": "Lecture 1"
}

PUT: To update lecture0: PUT -> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/lectures/0"
     put int body:
     
	{
   "name": "new Lecture"
}
DELETE: To delete course 0, DELETE->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/courses/0"

------------------------------------------------------------------------------------------
Programs:
GET: To get all programs: GET->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/programs"
GET: To get program 0: GET->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/programs/0"
POST: To add a new program: POST->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/programs"
      put this in body in pokeman go:
             
    {
        
			"courses": [],
     
			"name": "Data Science"
    
		 }
PUT: To update program0: PUT -> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/programs/0"
     put int body:

                {
        
			"courses": [],
 
		        "name": "Computer Engineering"
   
	        }
DELETE: To delete program0: DELETE-> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/programs/0"

---------------------------------------------------------------------------------------------
Students: 

GET: To get all students: GET -> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/students"
GET: To get student 0 : GET->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/students/0"
POST: To add a new student: POST->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/students"
		{
    
			"name": "chan3",
		    
    "photo": 123,
    
			"program": {
        
					"courses": [],
        
					"name": "Information Systems",
        
					"programId": 0
   
				    }
		
}
PUT: To update student 0: PUT->"http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/students/0"
     put in body:
    
		{
    
			"name": "updateChang",
		    
    "photo": 123,
    
			"program": {
        
					"courses": [],
        
					"name": "Information Systems",
        
					"programId": 0
   
				    }
		
}

DELETE: DELETE -> "http://changhomeworkcloudcomputing.us-east-2.elasticbeanstalk.com/webapi/students/0"
