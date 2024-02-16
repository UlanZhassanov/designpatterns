package structural.flyweight;

public class FootballTeam {
    private String teamName;
    private String city;

    public FootballTeam(String teamName, String city) {
        this.teamName = teamName;
        this.city = city;
    }

    public void getTeam(String league) {
        System.out.println("Team: " + teamName + "\n" + "City: " + city + "\n" + "League: " + league + "\n");
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "teamName='" + teamName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
