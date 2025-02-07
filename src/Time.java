public class Time {
    protected int ore;
    protected int minuti;
    protected int secondi;

    



    public Time(int ore, int minuti, int secondi) {
        if(ore >24 || minuti >60 || secondi > 60){
            this.ore = 0;
            this.minuti=0;
            this.secondi=0;
        }else{
            this.ore = ore;
            this.minuti = minuti;
            this.secondi = secondi;
        }
    }

    public int getOre() {
        return ore;
    }
    public void setOre(int ore) {
        this.ore = ore;
    }
    public int getMinuti() {
        return minuti;
    }
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    public int getSecondi() {
        return secondi;
    }
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }


    public void addSecondi(int secondi){;
        this.secondi += secondi;
        if(this.secondi > 59){
            minuti += (this.secondi%60);
        }
    }


}
