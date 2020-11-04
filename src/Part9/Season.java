package Part9;

public enum Season {
    WINTER("cold", 90),
    SPRING("not_cold", 92),
    SUMMER("hot", 92),
    AUTUMN("not_hot", 91);
    private final String description;
    private final Integer count_of_days;

    Season(String description, Integer count_of_days) {
        this.description = description;
        this.count_of_days = count_of_days;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCount_of_days() {
        return count_of_days;
    }




    public String getNextSeason(String season) {
        if (season.equals("Winter")) {
            System.out.println(Season.SPRING);
        }
        if (season.equals("Spring")) {
            System.out.println(Season.SUMMER);
        }
        if (season.equals("Summer")) {
            System.out.println(Season.AUTUMN);
        }
        if (season.equals("Autumn")) {
            System.out.println(Season.WINTER);
        }
        return season;
    }

    public String GetDaysInSeason(String season) {
        if (season.equals("Winter")) {
            System.out.println(Season.WINTER.getCount_of_days());
        }
        if (season.equals("Spring")) {
            System.out.println(Season.SPRING.getCount_of_days());
        }
        if (season.equals("Summer")) {
            System.out.println(Season.SUMMER.getCount_of_days());
        }
        if (season.equals("Autumn")) {
            System.out.println(Season.AUTUMN.getCount_of_days());
        }return season;

    }

}

