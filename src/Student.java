public class Student implements Comparable<Student>{

    int compareTo(Student s){
        return Double.valueOf(myGPA).compareTo(s.getGPA())
    }

}
