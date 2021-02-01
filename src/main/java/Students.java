import java.util.ArrayList;
import java.util.List;

public class Students {
    public static List<Students> list = new ArrayList<>();
    static {
        list.add(new Students(1,"Sơn", 26,"Độc thân, vui vừa vừa"));
        list.add(new Students(2,"Tự", 20, "Đã có người yêu, sắp cưới"));
        list.add(new Students(3,"Thịnh", 21,"Đã có người yêu"));
        list.add(new Students(4,"Hải", 23,"Độc thân, trăng hoa"));
        list.add(new Students(5,"Thắng mập", 23,"Độc thân vui vừa vừa"));
        list.add(new Students(6,"Thắng ốm", 23,"Sắp có người yêu"));
        list.add(new Students(7,"Huy anh", 25,"Đã có người yêu, chung tình"));
    }
    public int id;
    public String name;
    public int age;
    public String status;

    public Students(int id,String name, int age, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
