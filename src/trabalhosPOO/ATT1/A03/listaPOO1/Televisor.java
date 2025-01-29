package trabalhosPOO.ATT1.A03.listaPOO1;

public class Televisor {
    private int canal = 1;
    private int volume = 10;

    public void setCanal(int c) {
        if (c > 0) canal = c;
    }

    public void aumentarVolume() {
        if (volume < 100) volume++;
    }

    public void diminuirVolume() {
        if (volume > 0) volume--;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
