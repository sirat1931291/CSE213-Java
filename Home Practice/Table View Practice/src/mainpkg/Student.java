/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author habib
 */
public class Student {
    private String name;
    private String id;
    private int section;
    private String course;

    public Student(String name, String id, int section, String course) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", section=" + section + ", course=" + course + '}';
    }
    
    
}
