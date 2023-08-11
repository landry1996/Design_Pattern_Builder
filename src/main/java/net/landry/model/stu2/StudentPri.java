package net.landry.model.stu2;

public class StudentPri {
    public static void main(String[] args) {


        Student student = Builder
                .newInstance().
                setId(2).build();

        System.out.println(student.getAddress()+"  "+student.getName()+"  "+student.getId());
    }
}
