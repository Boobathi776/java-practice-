class student
{
    int rollno;
    String name;
    int mark;
}

class Class_as_array
{
    public static void main(String[] args) {
        
        student s1=new student();
        s1.rollno=1;
        s1.name="boobathi";
        s1.mark=88;

        student s2=new student();
        s2.rollno=1;
        s2.name="durai";
        s2.mark=88;

        student s3=new student();
        s3.rollno=1;
        s3.name="govai";
        s3.mark=88;

        student students[]=new student[3];   //create a array with objects using class 
         students[0]=s1;    //each object in the each index
         students[1]=s2;
         students[2]=s3;

         for(int i=0;i<students.length;i++)
         {
            System.out.println(students[i].name);   
            System.out.println(students[i].mark);
            
         }

         for(student stud:students)   //datatype is a class name because we use it as a datatype
         {
           System.out.println(stud.name +" : "+stud.mark);
         }

        
    }
}