 class Student{

    public int roll;
    public String name;
    public String course; 
    public int m1,m2,m3;

    public int total(){
                return m1+m2+m3;
            }        
    public float average(){
        return (float)total()/3;
    }

    public char grade(){

        if(grade()>=60){
            return 'A';
        }
        else{
            return 'B'; 
        }
    }
    public String details(){
        return "Roll No"+roll+"\n"+"Name"+name+"\n"+"Course:"+course+"\n";
    }

}


public class StudentTest{
    public static void main(String[] args) {
        Student s=new Student();
        s.roll=1;
        s.name="Tausif";
        s.course="B.Tech";
        s.m1=70;
        s.m2=80;
        s.m3=90;
        System.out.println(s.total());
        System.out.println(s.average());
        // System.out.println(s.grade());
        System.out.println(s.details());
        
    


        
    }
}