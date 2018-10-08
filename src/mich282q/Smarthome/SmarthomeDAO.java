package mich282q.Smarthome;

public interface SmarthomeDAO {

    public void gemLokation(String navn);
    public void indlæsLokation(int nummer);
    public void gemOnOff(Hus hus);
}
