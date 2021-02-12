// each project has a name and desc
// practice overloading methods such as constructors
// implement getters and setters

public class ProjectClass {
    private String name;
    private String desc;
    public ProjectClass(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public ProjectClass(){
    }
    public ProjectClass(String name){
        this.name = name;

    }
    public String elevatorPitch(){
        return this.name + "," + this.desc;
    }
    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name){
        this.name = name;
        // name = name 
    }
    
    // getter
    public String getDesc(){
        return desc;
    }

    // setter
    public void setDesc(String desc){
        this.desc = desc;
        // name = name;
    }

}
