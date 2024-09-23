package assignment.oopLab.healthcare;

public abstract class Person {
    private int pid;
    private String pname;

    public Person(int pid, String pname){
        this.pid= pid;
        this.pname= pname;
    }

    public void setPid(int pid){
        this.pid= pid;
    }
    public int getPid(){
        return pid;
    }

    public void setPname(String pname){
        this.pname= pname;
    }
    public String getPname(){
        return pname;
    }
}
