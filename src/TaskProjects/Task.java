
package TaskProjects;
public class Task {
    private String name,desc;
    public Task(String n, String d){
        name = n;
        desc = d;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public boolean validate(){
        if(name == null || desc == null || name.equals("") || desc.equals("")) return false;
        else return true;
    }
    
    @Override
    public String toString() {
        return "Name:  " + name + "\nDescription: " + desc + "\n========\n";
    }
    
}
