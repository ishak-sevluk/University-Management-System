import java.util.UUID;

public class Department {

    // PRIVATE FIELDS
    private UUID id;
    private String code;
    private String name;
    private UUID facultyId;
    private UUID headInstructorId;
    private String phone;
    private String email;
    private boolean isActive;

    // PUBLIC CONSTRUCTOR
    public Department() {
    }

    // PUBLIC GETTER
    public UUID getId() {
        return id;
    }

    // PUBLIC SETTER
    public void setId(UUID id) {
        this.id = id;
    }

    // ...
    
    // PUBLIC TOSTRING
    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}