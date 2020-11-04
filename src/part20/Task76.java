package part20;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Person {
   private Integer id;
    private String name;
    private boolean permanent;
    private String street;
    private String city;
    private Integer zipcode;
    private List<String> phone;
    private List addres = new ArrayList(3);
    private String role;
    private List<String> cities;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }


    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List getAddres() {
        return addres;
    }

    public void setAddres(List addres) {
        this.addres = addres;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", addres: ["+
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +" ]"+
                ", phone=" + phone +
                ", role='" + role + '\'' +
                ", cities=" + cities +
                '}';
    }
}

public class Task76 {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        String path = "D:\\Sacuta\\src\\part20\\Person.txt";
        String str = Files.lines(Path.of(path)).reduce("", String::concat);


        boolean json = false;
        int startindex = str.indexOf("{");
        str = str.substring(1);
        String para;
        if (startindex == 0) {
            json = true;
        }
        if (json) {
            Pattern pattern = Pattern.compile("(\\[)(.*?)(\\])");
            Matcher matcher = pattern.matcher(str);

            List<String> listMatches = new ArrayList<String>();

            while (matcher.find()) {
                listMatches.add(matcher.group(2));
            }
            String phoneNumber = listMatches.get(0);
            String[] phones = phoneNumber.split(",");
            person.setPhone(Arrays.asList(phones));

            String citiesAll = listMatches.get(1);
            String[] sitiesAll = citiesAll.split(",");
            person.setCities(Arrays.asList(sitiesAll));
        }
        if (json) {
            Pattern pattern = Pattern.compile("\\{([\\s\\S]+?)}");
            Matcher matcher = pattern.matcher(str);
            List<String> listMatches = new ArrayList<String>();
            while (matcher.find()) {
                listMatches.add(matcher.group(1));
            }
            String adressAll = listMatches.get(0);
            String[] addressAll = adressAll.split(",");
            for (int i = 0; i < addressAll.length; i++) {
                para = addressAll[i];
                if (para.contains("street")) {
                    String[] street = addressAll[i].split(":");
                    person.setStreet((street[1]));
                }
                if (para.contains("city")) {
                    String[] city = addressAll[i].split(":");
                    person.setCity((city[1]));
                }
                if (para.contains("zipcode")) {
                    String[] zipcode = addressAll[i].split(":");
                    person.setZipcode(Integer.valueOf((zipcode[1])));
                }
            }
            List list = new ArrayList();
            list.add(person.getZipcode());
            list.add(person.getStreet());
            list.add(person.getCity());
            person.setAddres(list);
        }
        if (json) {
            String[] strings = str.split(",");

            for (int i = 0; i < strings.length; i++) {
                para = strings[i];
                if (para.contains("id")) {
                    String[] strings1 = strings[i].split(":");
                    person.setId(Integer.valueOf(strings1[1]));
                }
                if (para.contains("permanent")) {
                    boolean b;
                    if (para.contains("true")) {
                        b = true;
                    } else b = false;
                    person.setPermanent(b);
                }
                if (para.contains("role")) {
                    String[] strings1 = strings[i].split(":");
                    person.setRole(strings1[1]);
                }
                if (para.contains("name")) {
                    String[] strings1 = strings[i].split(":");
                    person.setName(strings1[1]);
                }
            }
        }
        System.out.println(person);
        System.out.println(person.getStreet());

    }
}



